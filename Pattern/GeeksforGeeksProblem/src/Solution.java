

//Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,5,6,6,8,9};
        int target = 6;
        searchRange(nums,target);

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    static int search(int[] nums, int target, boolean isStart){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;

            }
            else {
                ans = mid;
                if(isStart){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}