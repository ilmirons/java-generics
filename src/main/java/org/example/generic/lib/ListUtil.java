package org.example.generic.lib;

import java.util.List;

@SuppressWarnings("unused")
public class ListUtil {

    public static void printList(List<?> l) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object o : l) {
            sb
                    .append(++i)
                    .append(". ")
                    .append(o.toString())
                    .append("\n");
        }
        System.out.println(sb);
    }

}

