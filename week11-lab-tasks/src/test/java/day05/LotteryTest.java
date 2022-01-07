package day05;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery(90, 5);

    @Test
    void startLottery() {
        System.out.println(lottery.startLottery());
        List<Integer> wins = lottery.startLottery();
        for (int i = 0; i < wins.size(); i++) {
            for (int j = i + 1; j < wins.size(); j++) {
                if (wins.get(i) == wins.get(j)) {
                    System.out.println("Rossz!");;
                }
            }
        }
        System.out.println("Jó!");
    }
}