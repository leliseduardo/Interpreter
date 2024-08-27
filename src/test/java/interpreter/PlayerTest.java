package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldCalculateScoreWithFormula() {
        Player player = new Player();
        player.setGameScore1(10);
        player.setGameScore2(10);
        player.setGameScore3(10);

        assertEquals(10, player.calculateTotalScore());
    }
}
