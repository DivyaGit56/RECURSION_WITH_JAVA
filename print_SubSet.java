class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>curr = new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        
        generateSubset(nums,0,curr,result);
        return result;
    }
    private static void generateSubset(int nums[], int i,List<Integer>curr,List<List<Integer>>result){
        if(i == nums.length){
            result.add(new ArrayList<>(curr)); // add copy of current subset
            return;
        }
        curr.add(nums[i]);
        generateSubset(nums,i+1,curr,result);

        curr.remove(curr.size() -1);
        generateSubset(nums,i+1,curr,result);


    }
}
