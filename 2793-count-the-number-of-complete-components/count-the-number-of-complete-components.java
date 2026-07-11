class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        //if we need to check each componenet is connected we need comp count if count  >=n then all components are connected
        //if its less thne not connected 
        List<Integer>[]g = new ArrayList[n];
        for(int i=0;i <n;i++){
            g[i] = new ArrayList<>();
        }
        for(var edge :  edges){
            int u = edge[0];
            int v = edge[1];
            g[u].add(v);
            g[v].add(u);
        }
        boolean[]visit = new boolean[n];
    
        int ans =0;
        for(int i=0;i <n;i++){
            if(visit[i] == false){
              if(bfs(i,g,visit,n)){
                ans +=1;
              }
              visit[i] =true;
            }
        }
        return ans;

    }
    boolean bfs(int start,List<Integer>[]g, boolean[]visit,int n){
        int count =0;
        Queue<Integer> q = new ArrayDeque<>();
        //List<List<Integer>> lst = new ArrayList<>();
        List<Integer>[]ls = new ArrayList[n];
        //lst.add(new ArrayList<>());
        List<Integer> comp = new ArrayList<>();


        q.add(start);
        visit[start] = true;
        while(!q.isEmpty()){
            int elem = q.poll();
            comp.add(elem);
            count++;
            for(var dest : g[elem]){
               if(visit[dest] == false){
                q.add(dest);
                visit[dest] = true;
               }
            }
        }
        for(var v : comp){
          if(g[v].size() != count-1){
            return false;
          }
        }
        return true;
    }
}