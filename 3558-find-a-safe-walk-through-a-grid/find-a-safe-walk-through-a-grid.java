class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        int[][]dis = new int[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]- b[0]);
        for(int i=0;i < m;i++){
            Arrays.fill(dis[i], -1);

        }
        int[][]dir = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
        pq.add(new int[]{grid.get(0).get(0),0,0});
        while(!pq.isEmpty()){
            var cur = pq.poll();
            int val = cur[0];
            int r = cur[1];
            int c = cur[2];
            //already visited
            if(dis[r][c] >=0){
                continue;
            }
            //assigning the min val
            dis[r][c] = val;
            for(var d : dir){
              int nr = r+d[0];
              int nc = c + d[1];
              if(nr <0 || nc <0 ||nr >=m || nc >= n){
                continue;
              }
              if(dis[nr][nc] >=0){
                continue;
              }
              pq.add(new int[]{val + grid.get(nr).get(nc),nr,nc});
            }

        }
        return dis[m-1][n-1] <health;

        
    }
}