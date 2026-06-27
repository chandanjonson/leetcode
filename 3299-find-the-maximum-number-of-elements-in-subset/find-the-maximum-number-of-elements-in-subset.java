class Solution {
    public int maximumLength(int[] nums) {
      //  we can use hashset and store all the elements of nums in set
      //  then for each elem we will check whether there sqaure in present in set or not
      //  if yes inc the len
      HashMap<Long,Integer> map = new HashMap<>();
      for(var v : nums){
        map.put((long)v, map.getOrDefault((long)v, 0)+1);
      }
      int maxLen =0;
      for(var x : map.keySet()){
        //special case for x ==1;
        if(x ==1){
          maxLen = Math.max(maxLen, map.get(x)%2 ==0 ? map.get(x) -1 :  map.get(x));
          continue;
        }
        int len =0;
        long cur = x;
        while(map.getOrDefault((long)cur, 0) >=2){
         len +=2;
         cur = cur*cur;
         if(cur > 1_000_000_000L) break; 
        }
         if(map.getOrDefault((long)cur, 0) >=1){
         len++;
        }else{
            len--;
        }
        if(len == 2 && !map.containsKey(cur)) len = 1;
        maxLen = Math.max(maxLen, len);

      }
      return maxLen;

    }
}