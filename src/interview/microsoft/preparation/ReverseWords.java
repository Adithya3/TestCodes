package interview.microsoft.preparation;

public class ReverseWords {
    public static String reverseWords(String s) {
        String current=s.trim(), reverse="", currentWord="" ;
        if (s.length()==0) return s;
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)==' '){
                currentWord=currentWord.trim();
                if (currentWord.length()==0) continue;
                reverse=currentWord+" "+reverse;
                currentWord="";
            }
            else {
                currentWord=currentWord+s.charAt(i);
            }
        }
        currentWord=currentWord.trim();
        reverse=currentWord+" "+reverse;

        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  a good     example"));
    }
}
