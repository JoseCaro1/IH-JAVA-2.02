package exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void playerTest_check_set_negative_strength() {
        assertEquals(0, new Player(10, -5, 1).getStrength());
    }

    @Test
    public void playerTest_check_set_negative_health() {
        assertEquals(0, new Player(-1, 5, 1).getHealth());
    }

    @Test
    public void playerTest_check_set_negative_lives() {
        assertEquals(0, new Player(1, 1, -1).getLives());
    }

}
