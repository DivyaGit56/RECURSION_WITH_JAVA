class Solution {

    ArrayList<String> permutation(String s) {
        // Code Here
       ArrayList<String>res = new ArrayList<>();
       if(s == null || s.length() == 0) return res;
        generPermu(s,1,"" +s.charAt(0),res);
        return res;
    }
    
     public static void generPermu(String s, int i, String curr, ArrayList<String>res){
        if(i == s.length()){
            res.add(curr);
            return;
        }
        generPermu(s,i+1,curr+" "+s.charAt(i),res);
        generPermu(s,i+1,curr+s.charAt(i),res);
        
    }
}
