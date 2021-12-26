package org.example.generic.lib.server;

import lombok.Data;

@Data
public class BaseHeader implements ResponseHeader {

    private int responseType;
    private String senderNodeId;

}
