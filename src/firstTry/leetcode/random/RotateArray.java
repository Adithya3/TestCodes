package firstTry.leetcode.random;

public class RotateArray {
    public static int[] solution0(int[] inititalArray, int rotations) {
        int[] returnArray = new int[inititalArray.length];
        for (int i = rotations; i < inititalArray.length; i++) {
            returnArray[i] = inititalArray[i - rotations];
        }
        for (int i = 0; i < rotations; i++) {
            returnArray[i] = inititalArray[inititalArray.length - rotations + i];
        }
        return returnArray;
    }
}
