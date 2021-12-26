package org.example.generic.lib.erasure;

import java.util.ArrayList;
import java.util.List;

public class ObjectMain {

    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Hello object world");
        Object s = l.get(0);
        System.out.println(s);
    }

}
