package org.example.generic.lib;

public class ErrorFactory<T extends MyError> extends ClassFactory<T> {

    public ErrorFactory(Class<T> clazz) { super(clazz); }

    public T getLocalizedError(int code)
            throws ReflectiveOperationException {
        T error = get();
        error.setCode(code);
        error.setDescription(getLocalizedDescription(code));
        return error;
    }

    private String getLocalizedDescription(int code) {
        // implementation
        return "";
    }

}
