package firstTry.interview.goldman.matrix;

import java.util.*;

public class MatrixMain {
    public static void main(String[] args) {
        int count=0;
        int[][] aMatrix=new int[3][4];

//        for(int i=0;i<aMatrix.length;i++){
//            for (int j=0; j<aMatrix[0].length;j++){
//                aMatrix[i][j]=count;
//                count++;
//            }
//        }
        List<List<Integer>> alist = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
                );


//        for (int[] arr:aMatrix){
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println(aMatrix[]);
//        System.out.println(ShortestPath.calculate(aMatrix, new int[]{0,0},new int[]{3,2}));

        System.out.println(alist.get(1).set(1, 99));
        for (List<Integer> list : alist) {
            System.out.println(list.toString());
        }

    }
}
