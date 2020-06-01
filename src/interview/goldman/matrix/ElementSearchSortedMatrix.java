package interview.goldman.matrix;

public class ElementSearchSortedMatrix {
    public static boolean search(int[][] matrix, int value) {
        int top, bottom, left, right;
        top = 0;
        left = 0;
        right = matrix[0].length - 1;
        bottom = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            top = i;
            if (value > matrix[i][left] && value < matrix[i][right]) {
                break;
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            left = i;
            if (value == matrix[top][i]) {
                return true;
            }
        }
        return false;
    }
}
