package firstTry.interview.vonage;

public class AbeforeB {
    public static boolean solution(String S) {
        int firstBOccurance = Integer.MAX_VALUE;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'b') {
                firstBOccurance = i;
            } else if (i > firstBOccurance) {
                return false;
            }
        }
        return true;
    }

    ;
}
