class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < s.length();i++){
            map.put(s.charAt(i), i);
        }
        int[]seen = new int[26];

        for(int i=0;i < s.length();i++){
            if((seen[s.charAt(i)-'a']) >0){
                continue;
            }

            while(!sb.isEmpty() && sb.charAt(sb.length()-1) > s.charAt(i) 
                                              && map.get(sb.charAt(sb.length()-1)) >i){
                seen[sb.charAt(sb.length()-1) - 'a']--;
                                                
                sb.deleteCharAt(sb.length()-1);
                
            }
            seen[s.charAt(i)-'a']++;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}