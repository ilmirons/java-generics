package org.example.generic.lib.server;

@SuppressWarnings("unused")
public class ResponseData<H extends ResponseHeader,
        B extends ResponseBody> {

    private H header;
    private B body;

    public ResponseData(H header, B body) {
        setHeader(header);
        setBody(body);
    }

    public H getHeader() {
        return this.header;
    }

    public B getBody() {
        return this.body;
    }

    public void setHeader(H header) {
        this.header = header;
    }

    public void setBody(B body) {
        this.body = body;
    }

    public int getLength() {
        return this.getBody().getLength();
    }

}
