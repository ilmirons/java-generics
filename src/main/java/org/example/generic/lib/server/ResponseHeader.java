package org.example.generic.lib.server;

@SuppressWarnings("unused")
public interface ResponseHeader {

    int getResponseType();

    String getSenderNodeId();

    void setResponseType(int responseType);

    void setSenderNodeId(String senderNodeId);
}
