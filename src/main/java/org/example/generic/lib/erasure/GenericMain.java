package org.example.generic.lib.erasure;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Hello generic world");
        String s = l.get(0);
        System.out.println(s);
    }

}
