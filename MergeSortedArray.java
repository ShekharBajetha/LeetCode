/*

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. 
You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

*/
Approach1: with Extra Space

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                k++;
                i++;
            } else {
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < m) {
            arr[k++] = nums1[i++];
        }
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        for (int ind = 0; ind < m + n; ind++) {
            nums1[ind] = arr[ind];
        }
    }
}
