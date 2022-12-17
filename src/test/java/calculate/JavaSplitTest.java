package calculate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaSplitTest {

    @Test
    void split_테스트() {
        String[] splitArray = "1".split(",");
        Assertions.assertArrayEquals(new String[] {"1"}, splitArray);

        String[] values = "1,2".split(",");
        Assertions.assertArrayEquals(new String[] {"1", "2"}, values);
    }
}
