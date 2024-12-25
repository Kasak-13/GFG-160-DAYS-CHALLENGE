/**
 * Problem:
 * Find the minimum element in an array. The array can contain positive and negative numbers.
 * 
 * Approach:
 * 1. Initialize a variable res to store the minimum value, starting with the first element of the array.
 * 2. Loop through the array from the second element to the last.
 * 3. In each iteration, compare the current element with res, updating res to the smaller value.
 * 4. After completing the loop, res will contain the minimum value in the array.
 * 
 * Key Points:
 * - Simple linear traversal to find the minimum value.
 * - The approach works for both positive and negative integers in the array.
 * 
 * Complexity:
 * - Time Complexity: O(n), where n is the number of elements in the array, as we traverse the array once.
 * - Space Complexity: O(1), as no extra space is used apart from the variable to store the result.
 */
class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = Math.min(res, arr[i]);
        }

        return res;
    }
}
