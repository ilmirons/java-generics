import org.example.generic.lib.server.GenericResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponsesTest {

    @Test
    @DisplayName("The most specific constructor gets called...")
    void testStringResponse() {
        GenericResponse<String> resString =
                new GenericResponse<>("Result");
        assertNull(resString.getResult());
        assertNotNull(resString.getError());
    }
}
