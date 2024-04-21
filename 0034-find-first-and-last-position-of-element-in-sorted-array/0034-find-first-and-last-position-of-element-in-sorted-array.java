class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        result[0] = binarySearch(nums, target, true);
        result[1] = binarySearch(nums, target, false);
        
        return result;
    }
    int binarySearch(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        
        int index = -1;
        
        while( start <= end ) {
            int mid = start + (end - start)/2;
            
            if (nums[mid] == target) {
                index = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return index;
    }
}