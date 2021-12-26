import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.generic.lib.animal.Human;
import org.example.generic.lib.server.GenericResponse;
import org.example.generic.lib.server.HumanResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ResponsesTest {

    @Test
    @DisplayName("The most specific constructor gets called...")
    void testStringResponse() {
        GenericResponse<String> resString = new GenericResponse<>("Result");
        assertNull(resString.getResult());
        assertNotNull(resString.getError());
    }

    @Test
    void testEmbeddedObjectResponse() throws JsonProcessingException {
        GenericResponse<Human> resHuman = new GenericResponse<>(new Human());
        ObjectMapper objectMapper = new ObjectMapper();
        String response = objectMapper.writeValueAsString(resHuman);
        System.out.println(response);
        assertThrows(ClassCastException.class, () -> {
            // we can't pass in generic values through a class object
            GenericResponse<Human> resHuman2 = objectMapper.readValue(response, GenericResponse.class);
            assert resHuman2.getResult() instanceof Map;
            Human h = resHuman2.getResult(); // class cast Exception thrown here
        });

        assertDoesNotThrow(() -> {
            // we can pass in generic values through a TypeReference anonymous class
            var resHuman2 = objectMapper.readValue(response,
                    new TypeReference<GenericResponse<Human>>() { });
            assert resHuman2.getResult() instanceof Human;
        });

        assertDoesNotThrow(() -> {
            // we can fixate the Generic variable extending the GenericType
            var resHuman2 = objectMapper.readValue(response,
                    HumanResponse.class);
            assert resHuman2.getResult() instanceof Human;
        });
    }
}
