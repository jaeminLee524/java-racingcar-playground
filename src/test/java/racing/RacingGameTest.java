package racing;

import java.util.Arrays;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingGameTest {

    @Test
    void 우승자_조회() {
        Car jaem = new Car("jaem");
        jaem.move(4);
        jaem.move(4);
        jaem.move(4);

        Car jaen = new Car("jaen");
        jaen.move(4);
        jaen.move(4);
        jaen.move(4);

        Car hwan = new Car("hwan");
        hwan.move(4);

        Cars cars = new Cars(Arrays.asList(jaem, jaen, hwan));
        Assertions.assertThat(cars.findWinner()).containsExactly(jaem, jaen);
        Assertions.assertThat(cars.findWinner().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("[우승자 조회]-테스트를 위한 생성자 코드 추가")
    void 우승자_조회_V2() {
        Car jaem = new Car("jaem", 2);
        Car jaen = new Car("jaem", 2);
        Car hwan = new Car("jaem", 1);

        Cars cars = new Cars(Arrays.asList(jaem, jaen, hwan));
        Assertions.assertThat(cars.findWinner()).containsExactly(jaem, jaen);
        Assertions.assertThat(cars.findWinner().size()).isEqualTo(2);
    }
}
