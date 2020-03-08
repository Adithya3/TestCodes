package interview;

public class LongestSubString {

    public static String getLongestString(String inputString) {
        String longestString = "";
        int maxLength = 0, currentPosition = 0;
        longestString = String.valueOf(inputString.charAt(0));
        for (int i = 1; i < inputString.length(); i++) {

        }
        return longestString;
    }

    public static void main(String[] args) {
        System.out.printf(getLongestString("ABDEFGABEF"));
    }

}
