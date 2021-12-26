import org.example.generic.lib.ClassFactory;
import org.example.generic.lib.animal.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClassFactoryTest {

    @Test
    void testClassFactory() throws ReflectiveOperationException {
        var humanFactory = new ClassFactory<>(Human.class);
        Human h = humanFactory.get();
        assertNotNull(h);
    }
}
