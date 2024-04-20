class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }

        Map<Character, String> dial = new HashMap<>();
        dial.put('2', "abc");
        dial.put('3', "def");
        dial.put('4', "ghi");
        dial.put('5', "jkl");
        dial.put('6', "mno");
        dial.put('7', "pqrs");
        dial.put('8', "tuv");
        dial.put('9', "wxyz");

        StringBuilder sb = new StringBuilder("");
        combination(sb, dial, digits); // "", dial, 23

        return result;
    }

    private void combination(StringBuilder sb, Map<Character, String> dial, String digits) { 
        // "", dial, 23
        // "a", dial, 3
        if (digits.length() == 0) {
            result.add(sb.toString());
            return;
        }

        String str = dial.get(digits.charAt(0)); // 2 // 3
        for (int i=0; i<str.length(); i++) { // abc // def
            sb.append(str.charAt(i)); // "a" // "ad"
            combination(sb, dial, digits.substring(1)); // "a", dial, 3
            sb.deleteCharAt(sb.length()-1);
        }
    }
}