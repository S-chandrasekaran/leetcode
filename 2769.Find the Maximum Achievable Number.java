class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int s=num+t;
        if(t==1){
            s++;
            return s;
        }
        else{
            for(int i=1;i<=t;i++){
                s++;
            }
            return s;
        }
    }
}
