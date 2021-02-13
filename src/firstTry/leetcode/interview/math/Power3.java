package firstTry.leetcode.interview.math;

public class Power3 {
    public static boolean solution(int n) {
        if (n < 0) return false;
        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return true;
    }

    //    finding out the largest power of 3 for the int and seeing if it is divisible.
//    i.e 3^19%given_value should give 0
    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(0));
//        System.out.println(3 / 3);
    }
}
