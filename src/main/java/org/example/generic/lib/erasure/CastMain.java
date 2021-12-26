package org.example.generic.lib.erasure;

import java.util.ArrayList;
import java.util.List;

public class CastMain {

    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Hello cast world");
        String s = (String)l.get(0);
        System.out.println(s);
    }

}
