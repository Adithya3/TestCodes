package interview.goldman;

public class PowerOff {
    public static boolean powerOff(int value, int powerOff){
        while (value>1){
//            System.out.println(value);
            if ((value%powerOff)!=0){
                return false;
            }
            value=value/powerOff;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(powerOff(256, 2));
    }
}
