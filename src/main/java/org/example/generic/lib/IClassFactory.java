package org.example.generic.lib;

public interface IClassFactory<T> {

    T get() throws ReflectiveOperationException;

}
