package firstTry.crackingCodingInterview.StringsArrays;

public class StringCompression {
    public static String solution(String aString) {
        StringBuilder newString = new StringBuilder();
        char current = aString.charAt(0);
        int count = 1;
        for (int i = 1; i < aString.length(); i++) {
            if (aString.charAt(i) == current) {
                count++;
            } else {
                if (count > 1) {
                    newString.append(current);
                    newString.append(count);
                } else {
                    newString.append(current);
                }
                count = 1;
            }
            current = aString.charAt(i);
        }
        if (count > 1) {
            newString.append(current);
            newString.append(count);
        } else {
            newString.append(current);
        }
        return newString.toString();
    }
}
