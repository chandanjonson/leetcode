class Solution {
    public int[] arrayRankTransform(int[] arr) {
        //Use the counting sort
       //Use the treemap
       Map<Integer,Integer> map = new HashMap<>();
       Set<Integer> set = new TreeSet<>();
       for(var v : arr){
        set.add(v);
       }
       int count =1;
       for(var v : set){
        map.put(v, count++);
       }
       int[] ans = new int[arr.length];
       int k =0;
       for(var v : arr){
        ans[k++] = map.get(v);
       }
       return ans;

       
        

    }
}