package org.example.generic.lib;

import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public interface Elist<T> extends List<T> {
    default <U, Z extends U> U reduce(U identity,
                 BiFunction<U, ? super T, Z> accumulator) {
        Iterator<T> it = this.iterator();
        U acc = identity;
        while (iterator().hasNext()) {
            acc = accumulator.apply(acc, it.next());
        }
        return acc;
    }
}
