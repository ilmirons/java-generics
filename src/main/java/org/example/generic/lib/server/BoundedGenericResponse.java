package org.example.generic.lib.server;

public class BoundedGenericResponse
        extends GenericResponse<ResponseData<BaseHeader,ResponseBody>> {

    public BoundedGenericResponse(ResponseData<BaseHeader,ResponseBody> hbResponseData) {
        this.result = hbResponseData;
    }

}
