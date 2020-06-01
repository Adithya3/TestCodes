package interview.goldman.matrix;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ShortestPath {
    public static int calculate(int[][] matrix, int[] startPosition, int[] endPosition) {
        Queue<int[]> queue = new LinkedList<int[]>();
        Set<String> visited = new HashSet<String>();
        int[] currentNodeArray;
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        queue.add(new int[]{startPosition[0], startPosition[1], 0});
        while (!queue.isEmpty()) {
            currentNodeArray = queue.poll();
//            System.out.println(currentNodeArray[0]+""+currentNodeArray[1]);
            visited.add(currentNodeArray[0] + "" + currentNodeArray[1]);
            if (currentNodeArray[0] == endPosition[0] && currentNodeArray[1] == endPosition[1]) {
                return currentNodeArray[2];
            }
            for (int[] direction : directions) {
                int newX = currentNodeArray[0] + direction[0];
                int newY = currentNodeArray[1] + direction[1];
//                System.out.println(newX+""+newY);
                if (newX >= 0 && newX < matrix[0].length && newY >= 0 && newY < matrix.length) {
//                    System.out.println(newX+"/"+newY);
                    if (!visited.contains(newX + "" + newY)) {
//                        System.out.println("here");
                        queue.add(new int[]{newX, newY, currentNodeArray[2] + 1});
                    }
                }
            }
        }
        return -1;
    }
}
