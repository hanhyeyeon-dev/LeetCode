class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        
        for (int i=0; i<matrix.length; i++) {
            int start = matrix[i][0];
            int end = matrix[i][matrix[i].length-1];
            
            if (start <= target && target <= end) {
                result = binarySearch(matrix[i], target);
            }
        }
        
        return result;
    }
    
    boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right-left)/2; // 1
            
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1; //1
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}