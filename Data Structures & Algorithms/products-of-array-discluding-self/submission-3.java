class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int ans[]=new int[l];
        for(int i=0;i<l;i++){
            int prod=1;
            for(int j=0;j<l;j++){
                if(i!=j){
                prod=prod*nums[j];
                }
            }
            ans[i]=prod;
        }
        return ans;
    }
}  
