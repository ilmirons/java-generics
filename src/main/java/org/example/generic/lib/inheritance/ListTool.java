package org.example.generic.lib.inheritance;

import java.util.List;

public interface ListTool<T> {

    void cpyList(List<? super T> out, List<? extends T> in);

}
