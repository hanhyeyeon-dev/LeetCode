class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        
        int target = nums[start];
        
        while( start <= end ){
            int mid = start + (end - start)/2;
            
            if (nums[mid] < target) {
                target = nums[mid];
                
            } else if (nums[start] < nums[end]) {
                if (nums[start] < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < nums[end]) { // 5,4,1,2,3 => 1 < 3
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return target;
    }
}