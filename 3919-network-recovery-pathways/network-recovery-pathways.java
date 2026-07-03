class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        //if with w mid we can tarnverse from 0 to n-1 we we can traverse with less mid also so explore large threshold
        List<List<int[]>> g = new ArrayList<>();
        int n =online.length;

        
        for(int i=0;i <n;i++){
            g.add(new ArrayList<>());
           
        }
        int l = Integer.MAX_VALUE;
        int h = Integer.MIN_VALUE;
        for(var edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if(online[v]== false || online[u] == false){
                continue;
            }
            g.get(u).add(new int[]{w,v});//
            l = Math.min(l, w);
            h = Math.max(h, w);

        }
        if(!check(g, l, k, n)){
            return -1;
        }
        int ans =-1;
        while(l <=h){
            int mid = (l+h)/2;
            if(check(g, mid, k, n)){
                ans = mid;
                l  = mid+1;
            }else{
                h = mid-1;
            }
        }
        return ans;
    }
    boolean check(List<List<int[]>> g, int mid,long k,int n){
        long[]dis = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b)-> Long.compare(a[0], b[0]));
        dis[0] = 0l;
        pq.add(new long[]{0l,0l});
        while(!pq.isEmpty()){
            var node = pq.poll();
            long d  = node[0];
            int u = (int) node[1];
             if(d >k){
                return false;
            }
            if(dis[u] <d){
                continue;
            }
            if(u ==n-1){
                return true;
            }
           
            for(var v : g.get(u)){
                int w = v[0];
                int nextv = v[1];
                if(mid >w){
                  continue;
                }
                if(dis[nextv] > w + dis[u]){
                   dis[nextv] = w + dis[u];
                   pq.offer(new long[]{dis[nextv],nextv});
                }

            }


        }
        return false;
    }

}