package crackingCodingInterview.StringsArrays.matrix;

import java.util.LinkedList;
import java.util.List;

public class ZeroRowColumn {
    public static void putZeros(int[][] initialMatrix) {
        int rows = initialMatrix.length, column = initialMatrix[0].length;
        List<int[]> zeros = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (initialMatrix[i][j] == 0) {
                    zeros.add(new int[]{i, j});
                }
            }
        }
        for (int[] value : zeros) {
            for (int i = 0; i < column; i++) {
                initialMatrix[value[0]][i] = 0;
            }
            for (int i = 0; i < rows; i++) {
                initialMatrix[i][value[1]] = 0;
            }
        }
    }
}
