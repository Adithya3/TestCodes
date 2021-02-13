package firstTry.interview.amazon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question0 {
    public int solution(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfsFill(grid, i, j);
                    count++;
                }
            }
        return count;
    }

    private void dfsFill(int[][] grid, int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;
            dfsFill(grid, i + 1, j);
            dfsFill(grid, i - 1, j);
            dfsFill(grid, i, j + 1);
            dfsFill(grid, i, j - 1);
        }
    }

    private void bfsFill(int[][] grid, int i, int j) {
        Queue<int[]> aQueue = new LinkedList<>();
        aQueue.add(new int[]{i, j});
        while (!aQueue.isEmpty()) {
            //add 1 on x
            if ((i + 1) < grid.length && (i + 1) > 0 && grid[i + 1][j] == 1) {
                aQueue.offer(new int[]{i + 1, j});
            }
            //add 1 on y
            if ((j + 1) < grid[0].length && (j + 1) > 0 && grid[i][j + 1] == 1) {
                aQueue.offer(new int[]{i, j + 1});
            }
            //subtract 1 on x
            if ((i - 1) < grid.length && (i - 1) > 0 && grid[i - 1][j] == 1) {
                aQueue.offer(new int[]{i - 1, j});
            }
            //subtract 1 on y
            if ((j - 1) < grid.length && (j - 1) > 0 && grid[i][j - 1] == 1) {
                aQueue.offer(new int[]{i, j - 1});
            }
            grid[i][j] = 0;
            aQueue.poll();
        }
    }

    public static void main(String[] args) {
        Stack<Integer[]> aStack = new Stack<Integer[]>();
    }
}
