class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        find(s, new ArrayList<>());
        return result;
    }
    
    void find(String s, List<String> combination) {
        if (s.length() == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        
        for (int i=0; i<s.length(); i++) {
            String prefix = s.substring(0, i+1);
            String suffix = s.substring(i+1);
            
            if (palindrome(prefix)) {
                combination.add(prefix);
                find(suffix, combination);
                combination.remove(combination.size()-1);
            }
            
        }
    }
        
    boolean palindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while(left<right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}