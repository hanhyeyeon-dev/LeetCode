class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1; // 3
        
        while(start <= end) {
            int mid = start + (end - start)/2; // 1
            if (nums[mid] == target) { // 3 != 5, false
                return mid;
            } else if (nums[mid] < target) { // 3 < 5, true
                start = mid + 1; // 1
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}