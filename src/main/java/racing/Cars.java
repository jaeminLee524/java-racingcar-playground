package racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> findWinner() {
        return getWinnerCarList(getMaxPosition());
    }

    private List<Car> getWinnerCarList(Position maxPosition) {
        List<Car> winnerCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.maxPosition(maxPosition)) {
                winnerCarList.add(car);
            }
        }
        return winnerCarList;
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position(0);
        for (Car car : carList) {
            if (car.maxPosition(maxPosition)) {
                maxPosition = car.getMaxPosition();
            }
        }

        return maxPosition;
    }

    public void tryNoOfMove(int tryNo) {
        for (Car car : carList) {
            car.moveByTryNo(tryNo);
        }
    }
}
