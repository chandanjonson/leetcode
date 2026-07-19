class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        //0 1 1 2
        //2 1 1 0
        //0 2 1 1 //after 3 swap
        //0 12 1
        //0 1 1 2 5th
        int[] count = new int[nums.length];
        int [] freq = new int[3];
        for(int i=0;i < nums.length;i++){
            if(nums[i] <a && nums[i] <b){
                nums[i] =0;
            }else if(nums[i] >=a && nums[i] <=b){
                nums[i] =1;
            }else{
                nums[i] =2;
            }
        }
        int ans =0;
        int one =0;
        int two =0;

        for(var v : nums){
            if(v ==0){
                ans = (ans + one + two)%1000000007;
            }else if(v ==1){
                ans = (ans + two)%1000000007;
                one++;
            }else{
                two++;
            }
        }
        return ans%1000000007;
    }
}