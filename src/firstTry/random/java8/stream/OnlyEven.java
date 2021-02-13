package firstTry.random.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyEven {
    public static List<Integer> onlyEven(List<Integer> aList) {
        return aList.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList(1, 2, 3, 45, 53, 324, 2, 4, 43, 22);
        aList = onlyEven(aList);
        for (Integer value :
                aList) {
            System.out.println(value);
        }
    }
}
