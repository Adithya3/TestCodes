package firstTry.crackingCodingInterview.StringsArrays.matrix;

public class Rotate90 {
    public static int[][] antiClock90(int[][] initialMatrix) {
        int[][] newMatrix = new int[initialMatrix[0].length][initialMatrix.length];
        for (int i = 0; i < initialMatrix.length; i++) {
            for (int j = 0; j < initialMatrix[0].length; j++) {
                newMatrix[initialMatrix[0].length - (1 + j)][i] = initialMatrix[i][j];
            }
        }
        return newMatrix;
    }

    public static int[][] clock90(int[][] initialMatrix) {
        int[][] newMatrix = new int[initialMatrix[0].length][initialMatrix.length];
        for (int i = 0; i < initialMatrix.length; i++) {
            for (int j = 0; j < initialMatrix[0].length; j++) {
//                System.out.println(initialMatrix[0].length - (1 + i));
                newMatrix[j][initialMatrix.length - (1 + i)] = initialMatrix[i][j];
            }
        }
        return newMatrix;
    }
}
