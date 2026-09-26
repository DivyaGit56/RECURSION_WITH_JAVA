class Solution {
   static List<List<Integer>>ans;

public static void permutation(List<Integer>newIp,List<Integer>newOp){
   HashSet<Integer>set = new HashSet<>();
    if(newIp.size() == 0){
        ans.add(new ArrayList<>(newOp));
        return;

    }

    for(int i = 0; i<newIp.size(); i++){
        int element = newIp.get(i);

        if(set.contains(element)){
            continue;
        }
        set.add(element);

    List<Integer>nextIp = new ArrayList<>(newIp);
    nextIp.remove(i);
    List<Integer>nextOp = new ArrayList<>(newOp);
    nextOp.add(element);

    permutation(nextIp,nextOp);

    }

}
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        ans.clear();
        List<Integer>ip = new ArrayList<>();
        List<Integer>op = new ArrayList<>();

        for(int x:nums){
            ip.add(x);
        }

        permutation(ip,op);

        return ans;

        
        
    }
}
