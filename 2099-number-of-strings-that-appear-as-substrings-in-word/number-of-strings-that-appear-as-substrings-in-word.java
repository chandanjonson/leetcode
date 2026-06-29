class Solution {
    public int numOfStrings(String[] patterns, String word) {
       int count =0;
       for(var pat : patterns){
         if(word.contains(pat)){
            count++;
        }
       }
       return count; 
    }
}