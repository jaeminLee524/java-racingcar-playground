package calculate;

public class StringAddCalculator {

    public static int splitAndSum(String param) {
        if (param == null || param.isEmpty()) {
            return 0;
        }
        if (param.length() == 1) {
            return 1;
        }
        if (param.contains(",")) {
            String[] splitParam = param.split(",");
            int sum = 0;
            for (String splitData : splitParam) {
                sum += Integer.parseInt(splitData);
            }
            return sum;
        }

        return Integer.parseInt(param);
    }
}
