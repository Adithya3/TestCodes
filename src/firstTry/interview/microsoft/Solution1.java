package firstTry.interview.microsoft;

public class Solution1 {

    public String solution(String S){
        boolean[] uppers = new boolean[26];
        boolean[] lowers = new boolean[26];
        char[] arr = S.toCharArray();
        for (char cur: arr) {
            if (Character.isLowerCase(cur)) lowers[cur-'a'] = true;
            if(Character.isUpperCase(cur)) uppers[cur-'A'] = true;
        }
        // visit from uppercase's high index
        for (int i=25; i>=0; i--) {
            // check both its uppercase and lowercase exist or not
            if (uppers[i]&&lowers[i]) {
                return (char)(i+'A')+"";
            }
        }
        return "NO";
    }


    public static void main(String[] args) {

    }
}
