package org.example.generic.lib.server;

public class Responses {

    GenericResponse<Integer> resInt = new GenericResponse<>(1);
    GenericResponse<GenericResponse<Integer>> resRes = new GenericResponse<>(resInt);
    GenericResponse<String> resString = new GenericResponse<>("Oh, no!");

}
