package racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> findWinner() {
        int maxPosition = getMaxPosition();

        return getWinnerCarList(maxPosition);
    }

    private List<Car> getWinnerCarList(int maxPosition) {
        List<Car> winnerCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getPosition() == maxPosition) {
                winnerCarList.add(car);
            }
        }
        return winnerCarList;
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : carList) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }
}
