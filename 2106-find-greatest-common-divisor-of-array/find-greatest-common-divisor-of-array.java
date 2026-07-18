class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for(var v :  nums){
            small = Math.min(small, v);
            large = Math.max(large,v);
        }
        return gcd(small,large);
    }
    int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a, a);
    }
}