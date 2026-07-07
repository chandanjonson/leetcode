class Solution {
    public int maxValidPairSum(int[] nums, int k) {
       int ans =0;
       int best =0;
       for(int i=k;i < nums.length;i++){
         best  = Math.max(best, nums[i-k]);
         ans = Math.max(ans, Math.max(best, best + nums[i]));
       }

       return ans;

    }
}