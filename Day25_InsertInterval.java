/**
 * Problem:
 * Insert a new interval into a list of non-overlapping intervals and merge overlapping intervals if necessary.
 * 
 * Approach:
 * 1. Traverse the intervals in three phases:
 *    - Add all intervals that come before the new interval (non-overlapping).
 *    - Merge all intervals that overlap with the new interval by adjusting the start and end points.
 *    - Add all intervals that come after the new interval.
 * 2. Use an ArrayList to store the resulting intervals.
 * 
 * Key Points:
 * - The merging step ensures overlapping intervals are combined into one.
 * - Traversal is straightforward, making the approach efficient and easy to understand.
 * 
 * Complexity:
 * - Time Complexity: O(n), as we traverse the intervals once.
 * - Space Complexity: O(n), for the result list.
 */
class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }
        return res;
    }
}
