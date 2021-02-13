package firstTry.leetcode.may;

//You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
//
//        Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
//
//        You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

public class BadVersion {

    public static int solution(int n) {
//        There may be a overflow issue when we are calculating the mid value the regular way. so instead do it this way.
//            mid = bottom + (top-bottom)/2
        int top = n, bottom = 1, mid = (top + bottom) / 2;
        while (bottom != mid) {
            if (isBadVersion(mid)) {
                top = mid;
            } else {
                bottom = mid;
            }
            mid = (top + bottom) / 2;
        }
        return isBadVersion(bottom) ? bottom : top;
    }

    public static boolean isBadVersion(int value) {
        return true;
    }

    public static void main(String[] args) {
        solution((4 + 5) / 2);
//        System.out.println((4+5)/2);
    }
}
