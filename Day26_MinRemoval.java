/**
 * Problem: 
 * Find the minimum number of intervals to remove to make the rest non-overlapping.
 * 
 * Approach: 
 * 1. Sort the intervals by their end time to ensure we process the smallest end times first.
 * 2. Use a greedy algorithm to iterate through the intervals:
 *    - If an interval overlaps with the previous one, increment the removal count.
 *    - If there’s no overlap, update the end pointer to the current interval’s end.
 * 
 * Key Points:
 * - Sorting by end time is crucial for minimizing overlaps.
 * - The greedy approach ensures an optimal solution.
 * 
 * Complexity:
 * - Time Complexity: O(n log n) for sorting the intervals.
 * - Space Complexity: O(1), as no extra space is used beyond variables.
 */
class Solution {
    static int minRemoval(int intervals[][]) {
          int count = 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end)
                count++;
            else
                end = intervals[i][1];
        }


        return count;
    }
}
