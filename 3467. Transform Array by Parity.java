class Solution {
    public int[] transformArray(int[] nums) {
        int n=nums.length,temp;
        int[] nee= new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nee[i]=0;
            }
            else if(nums[i]%2==1){
                nee[i]=1;
            }
        }
      
         Arrays.sort(nee);
         return nee;
    }
}
