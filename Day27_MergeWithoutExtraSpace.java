/**
 * Problem:
 * Merge two sorted arrays into two sorted arrays.
 * 
 * Approach:
 * 1. Initialize two pointers i and j, where i starts from the end of array a[]
 *    and j starts from the beginning of array b[].
 * 2. Compare elements at a[i] and b[j].
 * 3. If a[i] is greater than or equal to b[j], swap the elements and move the pointers.
 * 4. Repeat the process until one of the arrays is fully traversed.
 * 5. Once the loop completes, sort both arrays a[] and b[].
 * 
 * Key Points:
 * - Efficient element swapping between the two sorted arrays.
 * - Sorting the arrays at the end ensures the final arrays are sorted.
 * 
 * Complexity:
 * - Time Complexity: O(n log n) due to the sorting step after the merging process, where n is the number of elements in each array.
 * - Space Complexity: O(1), as no extra space is used apart from the swapping mechanism and sorting.
 */
class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
         int i = a.length - 1, j = 0;
        while (i >= 0 && j < b.length) {
            if (a[i] < b[j])
                i--;
            else {
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
