class Solution {
    public long gcdSum(int[] nums) {
        long []prefixgcd = new long[nums.length];
        int max = 0;
        for(int i=0;i < nums.length;i++){
            max = Math.max(max, nums[i]);
            prefixgcd[i] = gcd(max, nums[i]);
        }
        long sum =0l;
        int low=0;
        int high = prefixgcd.length-1;
        Arrays.sort(prefixgcd);

        while(low < high){
            sum +=gcd(prefixgcd[low], prefixgcd[high]);
            low++;
            high--;
        }
        return sum;
    }
    long gcd(long a,long b){
        if(a ==0) return b;
        return gcd(b%a, a);
    }
}