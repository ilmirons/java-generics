package org.example.generic.lib.server;

import lombok.Data;

@Data
public class BaseBody implements ResponseBody {

    String payload;

    @Override
    public int getLength() {
        return payload.length();
    }

}
