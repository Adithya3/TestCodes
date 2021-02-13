package firstTry.leetcode.may;

//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//        The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

public class May2 {

    //    O(n*2) solution
    public static int numJewelsInStones0(String J, String S) {
        int numberOfJewels = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    numberOfJewels++;
                }
            }
        }
        return numberOfJewels;
    }


    //    O(n) run time
    public static int numJewelsInStones1(String J, String S) {
        int numberOfJewels = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.contains(Character.toString(S.charAt(i)))) {
                numberOfJewels++;
            }
        }
        return numberOfJewels;
    }

    //    O(n) run time using indexOf
    public static int numJewelsInStones(String J, String S) {
        int numberOfJewels = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(Character.toString(S.charAt(i))) > -1) {
                numberOfJewels++;
            }
        }
        return numberOfJewels;
    }

//    Turns out String.contains is faster than string.indexOf. Would not have expected that.

    public static void main(String[] args) {

    }
}
