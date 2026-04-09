class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> check=new ArrayList<>();
        for (int num : nums){
            if(check.contains(num)){
                return true;
            }
            else{
                check.add(num);
            }
        }
        return false;
    }
}