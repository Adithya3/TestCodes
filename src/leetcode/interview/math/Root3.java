package leetcode.interview.math;

public class Root3 {
    public static boolean solution(int value) {
//        dont start at zero since it becomes a edge case here
        for (int i = 1; i <= Math.cbrt(value); i++) {
            if (i * i * i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(Math.cbrt(27));
        System.out.println(solution(10));
    }
}
