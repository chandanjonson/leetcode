class Solution {
    public int numberOfWays(int numPeople) {
        int m = 1000000007;

        int[]dp = new int[numPeople/2 +1];
        dp[0] =1;
        for(int i=1;i <= numPeople/2;i++){
            for(int j=0;j <i;j++){
                dp[i] +=((long)(dp[j]*1l *dp[i-j-1]))%m;
                dp[i]%=m;
            }
        }
        return dp[numPeople/2];
    }
}