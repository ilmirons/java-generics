package org.example.generic.lib.server;

@SuppressWarnings("unused")
public interface ResponseBody {

    int getLength();

    String getPayload();

    void setPayload(String payload);

}
