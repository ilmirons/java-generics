
import org.example.generic.lib.PropertiesPlusPlus;
import org.example.generic.lib.animal.Bird;
import org.example.generic.lib.server.GenericResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


class PropertiesPlusPlusTest {

    PropertiesPlusPlus ppp;

    @BeforeEach
    void setUp() {
        ppp = new PropertiesPlusPlus();
        ppp.setProperty("my.property", "string");
        // we can put in different types
        ppp.setProperty("my.int.property", 1);
    }

    @Test
    @SuppressWarnings("unused")
    void testPseudoReturnSignature() {
        assertDoesNotThrow(() -> { String s = ppp.getTypedProperty("my.property"); });
        assertDoesNotThrow(() -> { Integer i = ppp.getTypedProperty("my.int.property"); });
        assertDoesNotThrow(() -> { var s = ppp.getTypedProperty("my.property"); });
        // we can pass type parameter in angular parenteses after dot in method call
        assertDoesNotThrow(() -> {
            var s = ppp.<CharSequence>getTypedProperty("my.property"); });
        assertThrows(ClassCastException.class, () -> {
            var s = ppp.<StringBuilder>getTypedProperty("my.property");
        });
    }
}
