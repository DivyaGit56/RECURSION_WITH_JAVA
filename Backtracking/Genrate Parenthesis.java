class Solution {
    
    public static void genrate(String curr, int ob, int cb, ArrayList<String>res){
        if(ob == 0 && cb == 0){
            res.add(curr);
            return;
        }
        
        if(ob>0){
            genrate(curr+"(",ob-1,cb,res);
        }
        
        if(cb>ob){
            genrate(curr+")",ob,cb-1,res);
        }
    }
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String>res = new ArrayList<>();
        
        genrate("",n,n,res);
        return res;
    }
}

                               //choice tree diagram //

                                       ""
                                       |
                                      "("
                                       |
                              ┌────────┴────────┐
                              |                 |
                             "(("              "()"
                              |                 |
                       ┌──────┴──────┐         "()("
                       |             |        /    \
                     "((("          "(()"    "()((" "()()"
                       |             |          |      |
                     "((()"         "(()("     "()(()) "()()("
                       |            /    \                |
                   "((()))"       "(()(("  "(())"       "()()()"
                                    |        |
                                  "(()()"  "(())("
                                    |        |
                                  "(()())  "(())()"

    
