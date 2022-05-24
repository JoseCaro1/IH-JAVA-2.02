package exercise2;

import exercise1.MathArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KeywordAnalyzerTest {


    @Test
    public void keywordAnalyzer_empty_string() {
        assertFalse(KeywordAnalyzer.reservedWords(""));
    }

    @Test
    public void keywordAnalyzer_may_min_string() {
        assertTrue(KeywordAnalyzer.reservedWords("HOLA ME LLAMO ABSTRACT"));
        assertTrue(KeywordAnalyzer.reservedWords("HOLA ME LLAMO abstract"));
    }

    @Test
    public void keywordAnalyzer_null_string() {
        assertThrows(IllegalArgumentException.class, () -> {
            KeywordAnalyzer.reservedWords(null);
        });

    }

    @Test
    public void keywordAnalyzer_check_spaces() {

        assertTrue(KeywordAnalyzer.reservedWords("  Hola  soy  boolean  "));
    }

    @Test
    public void keywordAnalyzer_check_first_element() {
        assertTrue(KeywordAnalyzer.reservedWords("if"));
    }

    @Test
    public void keywordAnalyzer_check_last_element() {
        assertTrue(KeywordAnalyzer.reservedWords("hola me llamo hola if"));
    }

    //Primer valor y ultimo
}
