package org.example.generic.lib;

import java.util.*;

// partial implementation: we should override loading method to parse
// Integer and maybe other non-string types from file
public class PropertiesPlusPlus extends Properties {

    public <T> T getTypedProperty(String key) {
        return (T)super.get(key);
    }

    // setProperty from parent is restricted with String values
    public synchronized Object setProperty(String key, Object value) {
        return super.put(key, value);
    }

    // ...
}
