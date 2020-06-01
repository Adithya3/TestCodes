package interview.goldman.matrix;

public class SpiralOrder {
    public static void printInSpiralOrder(int[][] matrix) {
        int size, top, left, right, bottom, count = 0;
        size = matrix.length * matrix[0].length;
        top = 0;
        bottom = matrix.length - 1;
        left = 0;
        right = matrix[0].length - 1;
        while (count < size) {
            for (int i=left;i<=right;i++){
                System.out.println(matrix[top][i]);
                count++;
            }
            top++;
            for (int i=top;i<=bottom;i++){
                System.out.println(matrix[i][right]);
                count++;
            }
            right--;
            for (int i=right;i>=left;i--){
                System.out.println(matrix[bottom][i]);
                count++;
            }
            bottom--;
            for (int i=bottom;i>=top;i--){
                System.out.println(matrix[i][left]);
                count++;
            }
            left++;
        }
    }
}
