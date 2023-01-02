package racing;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private Cars cars;
    private int tryNo;

    public RacingGame(String carNames, int tryNo) {
        this.cars = new Cars(initCarList(carNames));
        this.tryNo = tryNo;
    }

    private List<Car> initCarList(String carNames) {
        if (carNames.isEmpty() || carNames == null) {
            throw new IllegalArgumentException("자동차의 이름이 존재해야합니다.");
        }

        String[] splitCarName = carNames.split(",");
        List<Car> carList = new ArrayList<>();
        for (String carName : splitCarName) {
            carList.add(new Car(carName));
        }

        return carList;
    }

    public List<Car> racing() {
        cars.tryNoOfMove(tryNo);
        return cars.findWinner();
    }

    public void printCarsDistinct() {

    }
}
