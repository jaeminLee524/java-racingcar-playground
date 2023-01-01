package racing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_이름_5글자() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Car("jaemin"));
    }

    @Test
    void 전진하는자동차_이름출력() {
        Car car = new Car("jaem");

        assertThat(car.printName()).isEqualTo("jaem");
    }

    @Test
    void 자동차_이름_콤마_구분() {
        Car car = new Car("j,j,h");
        List<Car> carList = car.split();

        assertThat(carList.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("[문제상황 1 - 해결방법 1 상속] 전진")
    void 이동() {
        Car car = new Car("jaem") {
            @Override
            public int getRandomNum() {
                return 4;
            }
        };

        car.move();
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("[문제상황 1 - 해결방법 1 상송] 정지")
    void 정지() {
        Car car = new Car("jaem") {
            @Override
            protected int getRandomNum() {
                return 3;
            }
        };

        car.move();
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("[문제상황 1 - 해결방법 2 객체그래프 이동] 이동")
    void 이동2() {
        Car car = new Car("jaem");
        car.move(4);

        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("[문제상황 1 - 해결방법 2 객체그래프 이동] 정지")
    void 정지2() {
        Car car = new Car("jaem");
        car.move(3);

        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("[문제상황 1 - 해결방법 3 인터페이스 이용] 이동")
    void 이동3() {
        Car car = new Car("jaem");
        car.move(() -> true);

        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("[문제상황 1 - 해결방법 3 인터페이스 이용] 정지")
    void 정지3() {
        Car car = new Car("jaem");
        car.move(() -> false);

        assertThat(car.getPosition()).isEqualTo(0);
    }
}
