class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0;i<arr.length-2;i++){
           // for(int j=1;j<arr.length-2;j++){
                if((arr[i]%2!=0) && (arr[i+1]%2!=0) && (arr[i+2]%2!=0)){
                    return true;
                }
           // }
       }
    return false;
    }
}
