package leetcode.math;

public class FizzBuzz {
    public static void solution0(int value) {
        for (int n = 1; n <= value; n++) {
            if ((n % 3 == 0) && (n % 5 == 0)) {
                System.out.println("FizzBuzz");
                continue;
            } else if ((n % 3 == 0)) {
                System.out.println("Fizz");
                continue;
            } else if ((n % 5 == 0)) {
                System.out.println("Buzz");
                continue;
            } else {
                System.out.println(n);
            }
        }
    }

    public static void solution(int value){
        for (int n = 1; n <= value; n++) {
            boolean isDivisibleBy3= (n%3==0) ? true:false;
            boolean isDivisibleBy5= (n%5==0) ? true:false;
            if (isDivisibleBy3 && isDivisibleBy5) {
                System.out.println("FizzBuzz");
                continue;
            } else if (isDivisibleBy3) {
                System.out.println("Fizz");
                continue;
            } else if (isDivisibleBy5) {
                System.out.println("Buzz");
                continue;
            } else {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(15%5);
//        List<String> aList=new LinkedList<String>();
//        a
        solution(15);
    }
}
