class Solution {
    public long maxSum(int[] nums, int k, int mul) {
       Arrays.sort(nums);
        long totalSum =0l;
       int index = nums.length-k;
       for(int i = nums.length-1;i >=nums.length-k;i--){
         if(mul >0){
           totalSum +=nums[i]*1l*mul*1l;
           mul--;
        }else{
          totalSum +=nums[i];
        }
       }
       return totalSum;
    }
}