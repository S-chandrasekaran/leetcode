class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int newlength=2*n;
        int[] ans= new int[newlength];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
