/**
 * Problem:
 * Count the number of occurrences of a given target element in an array.
 * 
 * Approach:
 * 1. Initialize a variable res to 0, which will store the count of target occurrences.
 * 2. Loop through the array from the first to the last element.
 * 3. In each iteration, check if the current element equals the target.
 * 4. If a match is found, increment res.
 * 5. After the loop completes, return res, which holds the total number of occurrences of the target.
 * 
 * Key Points:
 * - Linear traversal of the array to count the occurrences.
 * - Simple and straightforward approach for counting elements in an array.
 * 
 * Complexity:
 * - Time Complexity: O(n), where n is the number of elements in the array, as each element is checked once.
 * - Space Complexity: O(1), as no extra space is used apart from the variable to store the result.
 */
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
         int res = 0;
        for (int i = 0; i < arr.length; i++) {
         
            if (arr[i] == target)
                res++;
        }
      
        return res;
    }
}
