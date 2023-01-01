package racing;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    List<Car> carList;
    private int tryNo;

    public RacingGame(String carNames, int gameTryTime) {
        this.carList = initCarList(carNames);
        this.tryNo = gameTryTime;
    }

    private List<Car> initCarList(String carNames) {
        if (carNames.isEmpty() || carNames == null) {
            throw new IllegalArgumentException("자동차의 이름이 존재해야합니다.");
        }

        String[] splitCarName = carNames.split(",");
        List<Car> cars = new ArrayList<>();
        for (String carName : splitCarName) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    public void racing() {
        for (int i = 0; i < tryNo; i++) {
            for (Car car : carList) {
                car.move();
            }
        }
    }

    public void printCarsDistinct() {
        
    }
}
