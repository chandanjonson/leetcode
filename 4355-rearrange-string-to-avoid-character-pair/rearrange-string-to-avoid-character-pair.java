class Solution {
    public String rearrangeString(String s, char x, char y) {
        int[]count = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < s.length();i++){
            if(s.charAt(i) ==x ||  s.charAt(i) ==y){
                count[s.charAt(i)-'a']++;
            }else{
                sb.append(s.charAt(i));
            }
        }
        while(count[y-'a'] >0){
            sb.append(y);
            count[y-'a']--;
        }
         while(count[x-'a'] >0){
            sb.append(x);
            count[x-'a']--;
        }
        return sb.toString();
        
    }
}