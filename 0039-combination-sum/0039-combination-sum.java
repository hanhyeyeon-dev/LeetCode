class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        find(candidates, target, 0, new ArrayList<>());

        return result;        
    }

    private void find(int[] candidates, int target, int index, List<Integer> combination) {
        if(target == 0) {
            result.add(new ArrayList<>(combination));
            return ;
        }

        if(target < 0 || index>=candidates.length) return ;
        for (int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]);
            find(candidates, target-candidates[i], i, combination);
            combination.remove(combination.size()-1);
        }

    }
}