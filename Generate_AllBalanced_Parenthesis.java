class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>res = new ArrayList<>();
    
        generate("",n,n,res);
        return res;
        
    }
    public void generate(String cur, int ob, int cb, List<String>res){
        if(ob == 0 && cb == 0){
            res.add(cur);
            return;
        }
        if(ob>0){
            generate(cur+"(",ob-1,cb,res);
        }
        if(cb>ob){
            generate(cur+")",ob,cb-1,res);
        }
    }
}
