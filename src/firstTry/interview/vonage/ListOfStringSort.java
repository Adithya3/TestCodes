package firstTry.interview.vonage;

import java.util.Arrays;

public class ListOfStringSort {
    public static boolean isANumber(char givenChar) {
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < numbers.length; i++) {
            if (givenChar == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean solution(String[] A) {
        String[] CopyOfABeforeSort = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            CopyOfABeforeSort[i] = A[i];
        }
        Arrays.sort(A, (String s1, String s2) -> {
            StringBuilder sbalpha1, sbnum1, sbalpha2, sbnum2;
            char temps1Char, temps2Char;
            sbalpha1 = new StringBuilder();
            sbnum1 = new StringBuilder();
            sbalpha2 = new StringBuilder();
            sbnum2 = new StringBuilder();
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            } else {
                for (int i = 0; i < s1.length(); i++) {
                    temps1Char = s1.charAt(i);
                    temps2Char = s2.charAt(i);
                    if (isANumber(temps1Char)) {
                        sbnum1.append(temps1Char);
                    } else {
                        sbalpha1.append(temps1Char);
                    }
                    if (isANumber(temps2Char)) {
                        sbnum1.append(temps2Char);
                    } else {
                        sbalpha1.append(temps2Char);
                    }
                }
                if ((sbalpha1.length() > 0 || sbalpha2.length() > 0)) {
                    if (!sbalpha1.toString().equals(sbalpha2.toString())) {
                        return sbalpha1.toString().compareTo(sbalpha2.toString());
                    } else {
                        return sbnum1.toString().compareTo(sbnum2.toString());
                    }
                } else {
                    return sbnum1.toString().compareTo(sbnum2.toString());
                }
            }
        });
        for (int j = 0; j < A.length; j++) {
            if (A[j].equals(CopyOfABeforeSort[j])) {
            } else {
                return false;
            }
        }
        return true;
    }
}
