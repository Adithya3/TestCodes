//package interview.WalmartLabs;
//
//import java.util.*;
//
//public class MaxOFmin {
//    public static int maximumOfList(List<Integer> aList) {
//        int maximum = Integer.MIN_VALUE, currentValue;
//        for (int i = 0; i < aList.size(); i++) {
//            currentValue = aList.get(i);
//            if (currentValue > maximum) {
//                maximum = currentValue;
//            }
//        }
//        return maximum;
//    }
//
//    public static int minimumOfList(List<Integer> aList) {
//        int minimum = Integer.MAX_VALUE, currentValue;
//        for (int i = 0; i < aList.size(); i++) {
//            currentValue = aList.get(i);
//            if (currentValue < minimum) {
//                minimum = currentValue;
//            }
//        }
//        return minimum;
//    }
//
//    public static int segment(int x, List<Integer> space) {
//        Deque<Integer> qi = new ArrayDeque<Integer>();
//        int i;
//
//        for (i=0 ; i < x ; i++) // The first window of the array
//        {
//            while ((qi.Count > 0) && (space.get(i) >= space[qi.PeekBack()]))
//            {
//                qi.pollLast();
//            }
//            qi.addLast(i);
//        }
//
//        for(i=k ; i < n ; ++i)
//        {
//            Console.WriteLine(arr[qi.PeekFront()]); // the first item is the largest element in previous window. The second item is its index.
//
//            while (qi.Count > 0 && qi.PeekFront() <= i - x)
//            {
//                qi.PopFront(); //When it's out of its window k
//            }
//            while (qi.Count>0 && arr[i] >= arr[qi.PeekBack()])
//            {
//                qi.PopBack();
//            }
//            qi.PushBack(i);
//        }
//        Console.WriteLine(arr[qi.PeekFront()]);
//    }
//}
