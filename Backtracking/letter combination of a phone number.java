class Solution {
    
    public static void solve(int[] arr,int i, StringBuilder curr,String [] maps , ArrayList<String>ans ){
        if(i == arr.length){
            ans.add(curr.toString());
            return;
        }
        if (arr[i] == 0 || arr[i] == 1) {
            solve(arr, i + 1, curr, maps, ans);
            return;
        }

        
        String letters = maps[arr[i]];
        
        for(char c:letters.toCharArray()){
            curr.append(c);
            solve(arr,i+1,curr,maps,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public ArrayList<String> possibleWords(int[] arr) {
        // code here
        ArrayList<String>ans = new ArrayList<>();
        
        
        String [] maps = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"};
            
            StringBuilder curr = new StringBuilder();
            
            solve(arr,0,curr,maps,ans);
            return ans;
    }
}

                  // CHOICE DIAGRAM //
                               ""
                    arr[0] = 2
                  /     |     \
                 a      b      c
                /|\    /|\    /|\
               / | \  / | \  / | \
              d  e  f d  e  f d  e  f
              |  |  | |  |  | |  |  |
             ad ae af bd be bf cd ce cf
