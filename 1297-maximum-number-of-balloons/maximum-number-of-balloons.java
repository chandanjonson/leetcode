class Solution {
    public int maxNumberOfBalloons(String text) {
        //count the number of balloon if its
         int[] ch = new int[26];
        
        for(var v : text.toCharArray()){
            ch[v -'a']++;
        }

         int   min =Integer.MAX_VALUE;
         min = Math.min(min,ch[1]);//for char b;
         min = Math.min(min,ch[0]);
         min = Math.min(min,ch[11]/2);
         min = Math.min(min,ch[14]/2);
         min = Math.min(min,ch[13]);
        
        return min;
    }
}