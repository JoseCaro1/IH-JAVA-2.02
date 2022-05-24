package exercise1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MathArrayTest {

    @Test
    @DisplayName("Validacion numero negativo")
    public void mathArray_check_negative_numbers() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathArray.oddNumbersArray(-5);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathArray.oddNumbersArrayList(-5);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathArray.oddNumbersArrayMethod(-5);
        });
    }

    @Test
    @DisplayName("Validacion encontrar un solo numero")
    void oddsToArray_numberOne_returnsArrayOneValue() {
        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, MathArray.oddNumbersArray(1));
        assertArrayEquals(expectedResult, MathArray.oddNumbersArrayMethod(1));
        assertEquals(1,MathArray.oddNumbersArrayList(1).get(0));
    }
}
