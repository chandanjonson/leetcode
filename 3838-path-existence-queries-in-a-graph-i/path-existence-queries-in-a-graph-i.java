class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
   
        int[]comp = new int[n];
        for(int i=1;i <n;i++){
            if(nums[i] - nums[i-1] <= maxDiff){
                comp[i] = comp[i-1];
                
            }else{
                comp[i] = comp[i-1]+1;
            }
        }
        boolean[]ans = new boolean[queries.length];
        Arrays.fill(ans, false);
        int k =0;
        for(var v : queries){
           int start = v[0];
           int end = v[1];
           if(comp[start] == comp[end]){
             ans[k] = true;
           }
           k++;
        }
        return ans;

    }
    
}