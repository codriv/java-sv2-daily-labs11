package day05;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery(90, 5);

    boolean startLottery() {
        List<Integer> wins = lottery.startLottery2();
        for (int i = 0; i < wins.size(); i++) {
            for (int j = i + 1; j < wins.size(); j++) {
                if (wins.get(i) == wins.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    void lottery() {
        assertTrue(startLottery());
        List <Integer> win = lottery.startLottery2();
        for (int i = 0; i < win.size() - 1; i++) {
            assertFalse(win.subList(i + 1, win.size()).contains(win.get(i)));
        }
    }
}