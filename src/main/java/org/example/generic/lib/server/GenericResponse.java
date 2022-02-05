package org.example.generic.lib.server;

public class GenericResponse<T> {

    T result = null;
    String error = null;

    public GenericResponse() {}

    public GenericResponse(String error) { setError(error); }

    public GenericResponse(T result) { setResult(result); }

    public T getResult() { return this.result; }

    public void setResult(T result) { this.result = result; }

    public String getError() { return this.error; }

    public void setError(String error) { this.error = error; }

}
