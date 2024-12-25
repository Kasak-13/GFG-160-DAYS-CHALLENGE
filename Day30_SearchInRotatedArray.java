/**
 * Problem:
 * Search for a target element in a rotated sorted array. The array is initially sorted, but then rotated at some unknown pivot.
 * 
 * Approach:
 * 1. Perform a modified binary search with two pointers: low and high.
 * 2. Calculate the mid index, and check if the element at mid matches the target (key).
 * 3. If the left part of the array is sorted:
 *    - Check if the target lies within the sorted left part. If yes, adjust high to narrow the search range.
 *    - Otherwise, adjust low to search in the right part.
 * 4. If the right part of the array is sorted:
 *    - Check if the target lies within the sorted right part. If yes, adjust low to narrow the search range.
 *    - Otherwise, adjust high to search in the left part.
 * 5. Repeat the process until the element is found or the pointers cross, indicating that the element is not present in the array.
 * 6. If the target is not found, return -1.
 * 
 * Key Points:
 * - Binary search is adapted to handle rotated arrays.
 * - Efficient approach with a time complexity of O(log n), reducing the search time compared to linear search.
 * - Handles both sorted and rotated sections of the array effectively.
 * 
 * Complexity:
 * - Time Complexity: O(log n), as the array is halved in each iteration.
 * - Space Complexity: O(1), as no extra space is used aside from pointers.
 */
class Solution {
    int search(int[] arr, int key) {
         int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] >= arr[low]) {
              
                if (key >= arr[low] && key < arr[mid])
                    high = mid - 1;
            
                else
                    low = mid + 1;
            }
          
            else {
             
                if (key > arr[mid] && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1; 
    }
