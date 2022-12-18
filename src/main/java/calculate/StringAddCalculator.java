package calculate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static final String CUSTOM_REGEX = "//(.)\n(.*)";
    public static final String COMMA_COLONS_RㄴEGEX = ",|:";

    public int splitAndSum(String text) {
        if (isBlank(text)) {
            return 0;
        }

        return add(toInts(split(text)));
    }

    private String[] split(String text) {
        Matcher matcher = Pattern.compile(CUSTOM_REGEX).matcher(text);
        if (matcher.find()) {
            return matcher.group(2).split(matcher.group(1));
        }

        return text.split(COMMA_COLONS_RㄴEGEX);
    }

    private int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    private int[] toInts(String[] values) {
        int[] intArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            intArray[i] = getPositiveNumber(values[i]);
        }

        return intArray;
    }

    private int getPositiveNumber(String text) {
        int number = Integer.parseInt(text);
        if (number < 0) {
            throw new RuntimeException();
        }

        return number;
    }

    private boolean isBlank(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }
        return false;
    }
}
