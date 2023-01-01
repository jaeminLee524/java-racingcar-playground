package racing;

import java.util.Random;

public class RandomMovingStrategy implements MoveStrategy {

    public static final int FORWARD_NUM = 4;
    public static final int MAX_BOUND = 9;

    @Override
    public boolean movable() {
        return getRandomNum() >= FORWARD_NUM;
    }

    private int getRandomNum() {
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
    }
}
