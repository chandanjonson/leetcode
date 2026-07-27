class Solution {
    public int maxProduct(int[] nums) {
        int firstelem =0;
        int secondelem =0;
        for(int i=0;i< nums.length;i++){
            var v = nums[i];
            if(v  >= firstelem){
                secondelem = firstelem;
                firstelem = Math.max(firstelem, v);
            }else if(secondelem <=v){
                secondelem = v;
            }
            
        }
        return (firstelem-1) * (secondelem-1);
    }
}