package random.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyByTwo {
    public static List<Integer> multiplyByTwo(List<Integer> aList){
        return aList.stream().map(value -> value*2).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList(1, 2, 3, 45, 53, 324, 2, 4, 43, 22);
        aList = multiplyByTwo(aList);
        for (Integer value :
                aList) {
            System.out.println(value);
        }
    }
}
