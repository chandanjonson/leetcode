class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        List<int[]> res = new ArrayList<>();
        for(var v :  restrictions){
            res.add(new int[]{v[0],v[1]});
        }
        res.add(new int[]{1,0});
        res.sort((a,b)-> Integer.compare(a[0], b[0]));
        if(res.get(res.size()-1)[0] !=n){
            res.add(new int[]{n,n-1});
        }

        //forward pass where we calculate the hieighr 
        for(int i=1;i < res.size();i++){
         int dest = res.get(i)[0] - res.get(i-1)[0];
         res.get(i)[1] = Math.min(res.get(i)[1], res.get(i-1)[1] + dest);
        }
        //backward pass to compute the height
        for(int j=res.size()-2;j >=0;j--){
          int dist =  res.get(j+1)[0] - res.get(j)[0];
          res.get(j)[1] = Math.min(res.get(j)[1], res.get(j+1)[1] + dist);
        }

       //calculate the best dist like going from left to peak and going fron right to peak
       int ans =0;
       for(int i=0;i < res.size()-1;i++){
         int dist = res.get(i+1)[0] - res.get(i)[0];
         int best = (res.get(i+1)[1]+ res.get(i)[1] + dist)/2;
         ans = Math.max(ans, best);
       }
       return ans;

    }
}