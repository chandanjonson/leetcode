class Solution {
    public int minScore(int n, int[][] roads) {
        //first form the graph
        //find the all path from 1to n  and check if there min value in it
        //return the min value
        List<List<int[]>> g = new ArrayList<>();
        for(int i=0;i <=n;i++){
            g.add(new ArrayList<>());
        }
        int ans = Integer.MAX_VALUE;
        for(var road : roads){
            int u = road[0];
            int v = road[1];
            int w = road[2];
            g.get(u).add(new int[]{w,v});
            g.get(v).add(new int[]{w,u});
        }

        boolean[]visit = new boolean[n+1];
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0,1});
        visit[1] = true;
        while (!q.isEmpty()) {
            var elem = q.poll();
            int w = elem[0];
            int v = elem[1];
            for(var edge : g.get(v)){
                int nextv = edge[1];
                int we = edge[0];
                ans = Math.min(ans, we);
                if(!visit[nextv]){
                    visit[nextv] = true;
                    q.add(new int[]{we,nextv});
                }
            }
        }
        return ans;
    }
}