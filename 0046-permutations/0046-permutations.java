class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        find(nums, new ArrayList<>());
        return result;
    }

    private void find(int[] nums, List<Integer> combination) {
        if(nums.length == combination.size()) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = 0; i<nums.length; i++) {
            if(combination.contains(nums[i])) continue;
            combination.add(nums[i]);
            find(nums, combination);
            combination.remove(combination.size()-1);
        }
    }
}