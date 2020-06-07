package crackingCodingInterview.StringsArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class UniqueChar {
    //using a hashset
//    O(n)
    public static boolean uniqueCharacter(String astr) {
        HashSet<Character> stringChars = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            stringChars.add(astr.charAt(i));
        }
        if (astr.length() == stringChars.size()) {
            return true;
        }
        return false;
    }

    //without using a another data structure
//    o(pow(n,2))
    public static boolean uniqueCharacter1(String astr) {
        for (int i = 0; i < astr.length(); i++) {
            for (int j = i + 1; j < astr.length(); j++) {
                if (astr.charAt(i) == astr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean uniqueCharacter2(String astr) {
        char[] charArray = astr.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
