import org.example.generic.lib.TypedProperties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings("unused")

class TypedPropertiesTest {

    @Test
    void testPseudoReturnSignature() {
        TypedProperties tp = new TypedProperties();
        tp.setProperty("my.prop", "string");
        // we can put in different types
        tp.setProperty("my.int.prop", 1);
        assertDoesNotThrow(() -> {
            String s = tp.getTypedProperty("my.prop");
        });
        assertDoesNotThrow(() -> {
            Integer i = tp.getTypedProperty("my.int.prop");
        });
        assertDoesNotThrow(() -> {
            var s = tp.getTypedProperty("my.prop");
        });
        // we can pass type parameter in angular
        // parenteses after dot in method call
        assertDoesNotThrow(() -> {
            var s =
                    tp.<CharSequence>getTypedProperty("my.prop");
        });
        assertThrows(ClassCastException.class, () -> {
            var s =
                    tp.<StringBuilder>getTypedProperty("my.prop");
        });
    }
}
