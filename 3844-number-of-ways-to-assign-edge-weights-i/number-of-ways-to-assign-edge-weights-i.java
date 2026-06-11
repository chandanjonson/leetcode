class Solution {
    public int assignEdgeWeights(int[][] edges) {
        //first find the depth
        //the find the x where x is odd cost
        //then find the perumation of all number which contribute the cost
        //
       // List<Integer>[]graph = new ArrayList[edges.length+1];
       HashMap<Integer,List<Integer>> map = new HashMap<>();
       for(var edge : edges){
         int u = edge[0];
         int v = edge[1];
         map.computeIfAbsent(u, k-> new ArrayList<>()).add(v);
         map.computeIfAbsent(v, k-> new ArrayList<>()).add(u);
       }

       int depth = findDepth(map);
       return getpower(depth-1, 2);
        

    }
    int getpower(int d, int base) {
      long res = 1;
      for (int i = 0; i < d; i++) {
          res = (res * base) % 1000000007;
      }
      return (int) res;
    }
    int findDepth(HashMap<Integer,List<Integer>> map ){
        Queue<int[]> q = new ArrayDeque<>();
        HashSet<Integer> visit = new HashSet<>();

        q.add(new int[]{1,0});
        visit.add(1);
        int maxdepth = 0;
        while(!q.isEmpty()){
          int sz = q.size();
          for(int i=0;i < sz;i++){
            var item = q.poll();
            maxdepth = Math.max(maxdepth, item[1]);
                for(var v :  map.getOrDefault(item[0], new ArrayList<>())){
                    if(!visit.contains(v)){
                     visit.add(v);   
                    q.add(new int[]{v,item[1]+1});
                }
            }
          }
        }
        return maxdepth;
    }

}