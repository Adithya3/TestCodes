package firstTry.crackingCodingInterview.StringsArrays;

public class OneStepAway {

    public static boolean solution(String firstString, String secondString) {
        boolean isRepacable = false, isInsertable = false;
        String bigString, smallString;
        int replaceCount = 0, insertCount = 0, smallestSize, firstStringSize = firstString.length(), secondStringSize = secondString.length();
        smallestSize = (firstStringSize - secondStringSize > 0) ? firstStringSize : secondStringSize;
        bigString = (firstStringSize - secondStringSize > 0) ? firstString : secondString;
        smallString = (firstStringSize - secondStringSize <= 0) ? firstString : secondString;
        if (firstStringSize == secondStringSize) {
            for (int i = 0; i < smallestSize; i++) {
                if (firstString.charAt(i) != secondString.charAt(i)) {
                    replaceCount++;
                }
            }
            if (replaceCount <= 1) {
                isRepacable = true;
            }
        }
        if (firstStringSize - secondStringSize == 1 || firstStringSize - secondStringSize == -1) {
            int smallIndex = 0, index = 0;
            while (index < smallestSize) {
                if (smallString.charAt(smallIndex) != bigString.charAt(index)) {
                    replaceCount++;
                } else {
                    smallIndex++;
                }
                index++;
            }
            if (replaceCount <= 1) {
                isInsertable = true;
            }
        }
//        System.out.println("replace count" + replaceCount);
//        System.out.println("insert count" + insertCount);
//        System.out.println("isreplacable" + isRepacable);
//        System.out.println("isInsertable" + isInsertable);
        return isRepacable | isInsertable;
    }
}
