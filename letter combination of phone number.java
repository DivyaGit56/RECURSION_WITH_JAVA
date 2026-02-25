class Solution {
    private void solve(List<String>res,String[]map,String digits,int i,StringBuilder curr){
        // BC
        if(i == digits.length()){
            res.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(i)-'0'];
        for(char c:letters.toCharArray()){
            curr.append(c);
            solve(res,map,digits,i+1,curr);
            curr.deleteCharAt(curr.length()-1); //backtrack
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>res = new ArrayList<>();
        if(digits == null || digits.length() == 0 )
        return res;

        String []map = {
            " ", //0
            " ",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz" //9
        };

        solve(res,map,digits,0, new StringBuilder());
        return res;

        
    }
}
