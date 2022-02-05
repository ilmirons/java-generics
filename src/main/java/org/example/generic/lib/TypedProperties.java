package org.example.generic.lib;

import java.util.*;
import java.util.regex.Pattern;





public class TypedProperties extends Properties {
    // we need to change name because of type signature limit
    public <T> T getTypedProperty(String key) { return (T)super.get(key); }

    public synchronized Object setProperty(String key, Object value) {
        return super.put(key, value);
    }
    @Override // force call of specific method
    public synchronized Object put(Object k, Object v) {
        return k instanceof String && v instanceof String
                ? put((String)k, (String)v)
                : super.put(k, v);
    }

    private Object put(String key, String value) {
        if (Pattern.matches("[\\+\\-]?[1-9][0-9]*|0", value)) {
            try {
                return put(key, Integer.parseInt(value));
            } catch (Exception e) { return put(key, Long.parseLong(value)); }
        } else if (Pattern.matches("([\\+\\-]?[1-9][0-9]*|0)\\.[0-9]+", value)) {
            try {
                return put(key, Float.parseFloat(value));
            } catch (Exception e) { return put(key, Double.parseDouble(value)); }
        } else return super.put(key, value);
    }
}
