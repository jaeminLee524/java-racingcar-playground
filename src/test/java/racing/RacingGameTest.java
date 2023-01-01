package racing;

import java.util.Arrays;
import org.assertj.core.api.Assertions;
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
}
