package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int numbers;
    private int selected;
    private Random random = new Random();

    public Lottery(int numbers, int selected) {
        this.numbers = numbers;
        this.selected = selected;
    }

    public List<Integer>  startLottery() {
        List<Integer> winner = new ArrayList<>();
        int win;
        for (int i = 0; i < selected; i++) {
            win = random.nextInt(1, numbers + 1 );
            while (winner.contains(win)) {
                win = random.nextInt(1, numbers + 1);
            }
            winner.add(win);
        }
        return winner;
    }

    public List<Integer>  startLottery2() {
        List<Integer> winner = new ArrayList<>();
        while (winner.size() < selected) {
            int win = random.nextInt(1, numbers + 1);
            if (!winner.contains(win)) {
                winner.add(win);
            }
        }
        return winner;
    }
}
