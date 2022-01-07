package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int numbers;
    private int selected;

    public Lottery(int numbers, int selected) {
        this.numbers = numbers;
        this.selected = selected;
    }

    public List<Integer>  startLottery() {
        Random random = new Random();
        List<Integer> winner = new ArrayList<>();
        int win;
        for (int i = 0; i < selected; i++) {
            win = random.nextInt(1, numbers);
            while (winner.contains(win)) {
                win = random.nextInt(1, numbers);
            }
            winner.add(win);
        }
        return winner;
    }
}
