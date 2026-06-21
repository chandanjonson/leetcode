class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxElem = 0;
        for(var v : costs){
          maxElem = Math.max(maxElem, v);
        }
        int[]count = new int[maxElem+1];
        for(var v : costs){
            count[v]++;
        }
        int ans =0;
        for(int i=0;i <= maxElem;i++){
            while (count[i]!=0 && i <= coins) {
                ans++;
                coins -=i;
                count[i]--;
            }
        }
        return ans;
    }
}