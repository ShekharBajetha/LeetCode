/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

# Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

*/
class Solution {
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public void sortColors(int[] nums) {

        int mid = 0, low = 0, high = nums.length - 1;

        while (mid <= high) {

            switch (nums[mid]) {
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high);
                    high--;

            }
        }
    }
}
