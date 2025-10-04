class Solution {
    public int josephus(int n, int k) {
        // code here
        if(n==1)return 1;  //when 0-based index,it return 0;
        return((josephus(n-1,k)+k-1)%n) + 1; //when 0-based index,return( josephus(n-1,k)%n)
    }
}
