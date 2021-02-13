package firstTry.leetcode.interview.math;

import java.util.Map;

public class RomanNumerals {
    public static int solution(String romanNumeral, Map romanNumeralsToDecimal) {
        int count = (int) romanNumeralsToDecimal.get(romanNumeral.charAt(romanNumeral.length() - 1));
        for (int i = romanNumeral.length() - 2; i >= 0; i--) {
            int currentValue = (int) romanNumeralsToDecimal.get(romanNumeral.charAt(i));
            int previousValue = (int) romanNumeralsToDecimal.get(romanNumeral.charAt(i + 1));
            if (previousValue <= currentValue) {
                count = count + currentValue;
            } else {
                count = Math.abs(count - currentValue);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<Character, Integer> romanNumeralsToDecimal = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        System.out.println(solution("MCMXCIV", romanNumeralsToDecimal));
    }
}
