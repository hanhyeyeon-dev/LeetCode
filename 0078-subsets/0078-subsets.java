class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        find(nums, 0, new ArrayList<>());

        return result;
    }

    void find(int[] nums, int index, List<Integer> subsets) {
        result.add(new ArrayList<>(subsets));

        for (int i=index; i<nums.length; i++) {
            subsets.add(nums[i]);
            find(nums, i+1, subsets); 
            subsets.remove(subsets.size()-1);
        }

    }
}