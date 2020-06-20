package crackingCodingInterview.StringsArrays.matrix;

import java.util.Arrays;

public class MatrixMain {
    public static void main(String[] args) {
        int[][] aMatrix = new int[4][4];
        aMatrix[0] = new int[]{1, 2, 3, 4, 5};
        aMatrix[1] = new int[]{6, 7, 8, 9, 10};
        aMatrix[2] = new int[]{11, 12, 13, 14, 15};
        aMatrix[3] = new int[]{16, 17, 18, 19, 20};
        int[][] newMatrix = Rotate90.antiClock90(aMatrix);
        for (int[] aRow : newMatrix) {
            System.out.println(Arrays.toString(aRow));
        }
//        for (int i = 0; i < aMatrix.length; i++) {
//            System.out.println(aMatrix[i][0]);
//        }
    }
}
