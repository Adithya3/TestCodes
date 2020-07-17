package leetcode.amazon.random;

public class ReverseInteger {
    public static int  reverse(int original){
        int reverse=0,pop;
        while(original!=0){
            pop=original%10;
            if ((reverse>(Integer.MAX_VALUE/10))||((Integer.MAX_VALUE/10==reverse)&&(pop>7))) return 0;
            if ((reverse<(Integer.MIN_VALUE/10))||((Integer.MIN_VALUE/10==reverse)&&(pop<-8))) return 0;
          reverse=(reverse*10)+pop;
          original=original/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int a = -798;
//        System.out.println(Integer.MAX_VALUE%10);
//        System.out.println(Integer.MIN_VALUE%10);
        System.out.println(reverse(a));

    }
}
