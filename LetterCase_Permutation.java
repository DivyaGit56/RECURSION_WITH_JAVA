class Solution {
  private void  genePermu( String s, int i, String curr ,List<String>res){
        if(i == s.length()){
            res.add(curr);
            return ;
        }
        char c = s.charAt(i);

        if (Character.isLetter(c)) {
         genePermu(s,i+1,curr+Character.toLowerCase(c), res);
        
        genePermu(s,i+1,curr+Character.toUpperCase(c), res);
        }else{
             genePermu(s, i + 1, curr + c, res);
        }
    }
    public List<String> letterCasePermutation(String s) {
    
        List<String>res = new ArrayList<>();
        genePermu(s, 0, "", res);
        return res;
    }
}
