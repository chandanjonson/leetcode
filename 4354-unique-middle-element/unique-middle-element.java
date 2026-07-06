class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        if(n <=1) return true;
        int mid = n/2;
        for(int i=0;i <n;i++){
            if(i != mid && nums[i] == nums[mid]){
                return false;
            }
        }
        return true;
    }
}