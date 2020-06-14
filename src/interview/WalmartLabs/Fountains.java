package interview.WalmartLabs;

import java.util.List;

public class Fountains {
    public static int fountainActivation(List<Integer> locations) {
        // Write your code here
        int count = 1, size = locations.size();
        int[] interval = new int[size];


        // At each index we'll store the max right possible from this index.
        for (int i = 1; i <= size; i++) {
            int left = Math.max(i - locations.get(i - 1), 1);
            int right = Math.min(i + locations.get(i - 1), size);

            interval[left - 1] = right;
        }

        int right = interval[0];
        int currMax = right;
        for (int i = 1; i < size; i++) {
            currMax = Math.max(currMax, interval[i]);

            // If the last fountain can cover only this point, then update with next fountain.
            if (i == right) {
                count++;
                right = currMax;
            }
        }
        return count;
    }
}
