package day05;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    Lottery lottery = new Lottery(90, 5);

    @Test
    void startLottery() {
        System.out.println(lottery.startLottery2());
        List<Integer> wins = lottery.startLottery2();
        for (int i = 0; i < wins.size(); i++) {
            for (int j = i + 1; j < wins.size(); j++) {
                if (wins.get(i) == wins.get(j)) {
                    System.out.println("Rossz!");;
                }
            }
        }
        System.out.println("Jó!");
    }

    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            System.out.print((new Random()).nextInt(3,6));
        }
    }
}