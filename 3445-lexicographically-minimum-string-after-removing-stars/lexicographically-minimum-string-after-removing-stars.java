class Solution {
    public String clearStars(String s) {
        //brute force will be but it will give tle;
        //use pq store in min pq and delete from there if you see and rresult string will lexicographically
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]!=b[0] ? a[0]-b[0] : b[1]-a[1]);
        boolean[]removed = new boolean[s.length()];
        for(int i=0;i < s.length();i++){
            var ch = s.charAt(i);
            if(ch =='*' && !pq.isEmpty()){
               var item =  pq.poll();
                removed[item[1]] = true;
            }else{
                pq.add(new int[]{ch,i});
            }

        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < s.length();i++){
            if(s.charAt(i) =='*' || removed[i] == true){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}