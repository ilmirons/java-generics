package org.example.generic.lib;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class GenericList {

    static {
        // this is a raw type use
        List v = new ArrayList(); // implicitly a list of Objects
        // this is an unchecked method call
        v.add("test");
        // String s = v.get(0); // compile time error as get returns a value of type "Object"
        Integer i = (Integer) v.get(0); // Run time error (ClassCastException)

        // Generics to the rescue
        List<String> l = new ArrayList<>();
        l.add("test2");

        String s = l.get(0);
        // Integer i2 = l.get(0); get returns a value of type String as this is the value of the type variable
    }
}
