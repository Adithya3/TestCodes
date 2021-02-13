package firstTry.crackingCodingInterview.StringsArrays;

public class Urlize {
    //Copying into a new string
    public static String urlize(String aString) {
        StringBuilder astringBuilder = new StringBuilder();
        char locationChar;
        for (int i = 0; i < aString.length(); i++) {
            locationChar = aString.charAt(i);
            if (locationChar == ' ') {
                astringBuilder.append("%20");
            } else {
                astringBuilder.append(locationChar);
            }
        }
        return astringBuilder.toString();
    }

    //without using a different structure. from start of the string
    public static String urlize1(String aString, int actuallength) {
        char[] charArray = aString.toCharArray();
        for (int i = 0; i < actuallength; i++) {
            if (charArray[i] == ' ') {
                for (int j = charArray.length - 3; j > i + 1; j--) {
                    charArray[j] = charArray[j - 2];
                    charArray[j - 1] = charArray[j - 3];
                }
                charArray[i] = '%';
                charArray[i + 1] = '2';
                charArray[i + 2] = '0';
                if (actuallength + 2 < charArray.length) {
                    actuallength = actuallength + 2;
                }
            }
        }
        return new String(charArray);
    }

    public static String urlize(String astr, int actualValue){
        char[] charArray=astr.toCharArray();
        for (int i=actualValue;i>=0;i--){
            if (charArray[i]==' '){
                charArray[i]='%';
                charArray[i+1]=' ';
            }
        }
        return new String(charArray);
    }

}
