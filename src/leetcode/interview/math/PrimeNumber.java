package leetcode.interview.math;

import java.util.HashSet;

public class PrimeNumber {
    //    O(n*2)
    public static int solution0(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i / 2 < j) {
                    count++;
                    break;
                }
                if (i % j == 0) {
                    break;
                }
            }
        }
        return count;
    }


    //    Sieve of Eratosthenes
//    O(n)
    public static int solution(int n) {
        HashSet<Integer> compositeSet = new HashSet<Integer>();
        HashSet<Integer> primeSet = new HashSet<Integer>();
        for (int i = 2; i < n; i++) {
            if (compositeSet.contains(i)) {
                continue;
            } else {
//                System.out.println(i);
                primeSet.add(i);
                for (int j = i + 1; j < n; j++) {
                    if (j % i == 0) {
                        compositeSet.add(j);
                    }
                }
            }
        }
        return primeSet.size();
    }

//    Therefore, we only need to consider factors up to √n because, if n is divisible by some number p, then n = p × q and since p ≤ q, we could derive that p ≤ √n.

    public static void main(String[] args) {
        System.out.println(solution(499979));
    }
}
