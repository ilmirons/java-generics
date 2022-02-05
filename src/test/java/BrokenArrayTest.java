import org.example.generic.lib.animal.Animal;
import org.example.generic.lib.animal.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BrokenArrayTest {

    @Test
    void verifyArrayAreNotTypeSafe() {
        Object[] objArr;
        Animal[] animalArr = new Animal[2];

        // everything ok here
        animalArr[0] = new Human();

        objArr = animalArr; // I shouldn't be able to do this
        // because it makes possible to do this
        assertThrows(ArrayStoreException.class,
                () -> objArr[1] = "Oh, no!"); // throws at runtime
    }
}
