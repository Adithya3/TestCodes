package interview.microsoft;

public class Solution2 {
    public static int solution(int num) {
        //time complexity is O(n)
        int sign = Integer.signum(num);
        String resultString = "";
        if (sign >= 0) {
            String valueinString = String.valueOf(num);
            for (int i = 0; i < valueinString.length(); i++) {
                int n = Integer.parseInt(String.valueOf(valueinString.charAt(i)));
                if (5 > n) {
                    resultString = valueinString.substring(0, i) + "5" + valueinString.substring(i);
                    break;
                }
            }
            if (resultString.length() == 0) {
                resultString += "5";
            }
        } else {
            String valueinString = String.valueOf(Math.abs(num));
            for (int i = 0; i < valueinString.length(); i++) {
                int n = Integer.parseInt(String.valueOf(valueinString.charAt(i)));
                if (5 < n) {
                    resultString = valueinString.substring(0, i) + "5" + valueinString.substring(i);
                    break;
                }
            }

        }

        return sign == 0 ? Integer.parseInt(resultString) : Integer.parseInt(resultString) * sign;
    }

    public static int solution1(int num) {
        boolean isNegative = num < 0;
        String resStr = "";
        if (!isNegative) {
            String temp = String.valueOf(num);
            for (int i = 0; i < temp.length(); i++) {
                int n = Integer.parseInt(String.valueOf(temp.charAt(i)));
                if (5 > n) {
                    resStr = temp.substring(0, i) + "5" + temp.substring(i);
                    break;
                }
            }
            if (resStr.length() == 0) {
                resStr += "5";
            }
        } else {
            String temp = String.valueOf(num * -1);
            for (int i = 0; i < temp.length(); i++) {
                int n = Integer.parseInt(String.valueOf(temp.charAt(i)));
                if (5 < n) {
                    resStr = temp.substring(0, i) + "5" + temp.substring(i);
                    break;
                }
            }

        }

        return isNegative == true ? Integer.parseInt(resStr) * -1 : Integer.parseInt(resStr);
    }


    public static void main(String[] args) {
//        System.out.println(Integer.toString(Integer.signum(-99)));
        System.out.println(solution(0));
//        System.out.println(solution1(0));
    }
}
