package task01_2605;
import java.util.List;

public class NumberSummation {

      public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;

        for (Number number : list) {
            if (number != null) {
                sum += number.doubleValue();
            }
        }

        return sum;
    }
}