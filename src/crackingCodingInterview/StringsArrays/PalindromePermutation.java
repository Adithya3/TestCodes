package crackingCodingInterview.StringsArrays;

import java.util.HashMap;

public class PalindromePermutation {
    public static boolean solution(String aString) {
        char[] stringArray = aString.toCharArray();
        int totalOdds = 0, totalEvens = 0;
        Boolean isEven = false;
        HashMap<Character, Integer> ahashMap = new HashMap<>();
        if (aString.length() % 2 == 0) {
            isEven = true;
        }
        for (int i = 0; i < stringArray.length; i++) {
            if (ahashMap.get(stringArray[i]) == null) {
                ahashMap.put(stringArray[i], 1);
            } else {
                ahashMap.put(stringArray[i], ahashMap.get(stringArray[i]) + 1);
            }
        }
        for (Integer value : ahashMap.values()) {
            if (value % 2 == 0) {
                totalEvens = totalEvens + 1;
            } else {
                totalOdds = totalOdds + 1;
            }
        }
        if (isEven) {
            if (totalOdds == 0) {
                return true;
            }
        } else {
            if (totalOdds == 1) {
                return true;
            }
        }
        return false;
    }
}
