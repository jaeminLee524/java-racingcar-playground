package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {

    public static final int MAX_BOUND = 9;
    public static final int FORWARD_NUM = 4;
    private final Name name;
    private final Position position;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자를 초과할 수 없습니다.");
        }
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            position.plusDistinct();
        }
    }

    public void move(int randomNum) {
        if (randomNum >= FORWARD_NUM) {
            position.plusDistinct();
        }
    }

    public void move() {
        if (getRandomNum() >= FORWARD_NUM) {
            position.plusDistinct();
        }
    }

    /**
     * README 문제상황 1번 - 해결방법 1번
     * 해당 메소드의 접근 제어자를 private -> protected로 변경하여 오버라이딩이 가능한 구조로 변경
     */
    protected int getRandomNum() {
        Random random = new Random();
        int randomNum = random.nextInt(MAX_BOUND);
        return randomNum;
    }

    public List<Car> split() {
        List<Car> carList = new ArrayList<>();

        if (name.isContainComma()) {
            for (String carName : name.splitName()) {
                carList.add(new Car(carName));
            }
        }

        return carList;
    }

    public String printName() {
        return name.printName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public Name getName() {
        return name;
    }
}
