package firstTry.interview.wellsFargo;

public class FindNumberOfTimes {
    public static String solution(String findValue, String upperLimit) {
        int upperLimitInt = Integer.parseInt(upperLimit), difference;
        String withoutReplacement, withReplacement;
        StringBuilder stringBuilderWithEntireLetters = new StringBuilder();
        for (int i = 0; i <= upperLimitInt; i++) {
            stringBuilderWithEntireLetters.append(i);
        }
        withoutReplacement = stringBuilderWithEntireLetters.toString();
        withReplacement = stringBuilderWithEntireLetters.toString().replaceAll(findValue, "");
        difference = withoutReplacement.length() - withReplacement.length();
        return Integer.toString(difference);
    }
}
