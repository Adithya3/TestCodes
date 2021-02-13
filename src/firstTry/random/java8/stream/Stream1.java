package firstTry.random.java8.stream;

import java.util.Arrays;

public class Stream1 {
    public static void main(String[] args) {
//        Stream<String> aStream=Stream.generate(() -> "another thing").limit(10);
//        aStream.forEach(s -> {
//            System.out.println(s);
//        });
        String theString = Arrays.asList("a", "b", "", "dskk", "dkk", "zzz").stream().reduce("", (str1, str2) ->
                {
                    return str1 + str2;
                }
        );
        System.out.println(theString);
    }
}
