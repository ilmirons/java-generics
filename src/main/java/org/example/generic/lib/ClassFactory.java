package org.example.generic.lib;

public class ClassFactory<T> implements IClassFactory<T> {

    private final Class<T> clazz;

    public ClassFactory(Class<T> clazz){
        this.clazz = clazz;
    }

    @Override
    public T get() throws ReflectiveOperationException {
        return clazz.getDeclaredConstructor().newInstance();
    }
}
