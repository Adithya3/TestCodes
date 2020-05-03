package leetcode.may;

//Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
//Each letter in the magazine string can only be used once in your ransom note.

public class May3 {

//    O(n)
//    you can optimise the code using character array but it will still be O(n)
    public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            String ransomStringLetter=Character.toString(ransomNote.charAt(i));
            if (magazine.contains(ransomStringLetter)){
                magazine=magazine.replaceFirst(ransomStringLetter, "");
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
