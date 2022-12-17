package calculate;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        if (isBlank(text)) {
            return 0;
        }

        return add(toInts(split(text)));
    }

    private static String[] split(String text) {
        String[] values = text.split(",");
        return values;
    }

    private static int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    private static int[] toInts(String[] values) {
        int[] intArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            intArray[i] = Integer.parseInt(values[i]);
        }

        return intArray;
    }

    private static boolean isBlank(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }
        return false;
    }
}
