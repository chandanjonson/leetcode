class Solution {
    public int numberOfSubstrings(String s) {
        //brute force will work
        int ans =0;
        int []count = new int[3];
        int left =0;
        int right =0;
        int len = s.length();
        while(right < s.length()){
            count[s.charAt(right)-'a']++;

            while(isTrue(count)){
                ans += len - right;
                count[s.charAt(left)-'a']--;
                left++;
            }
            right++;
            
        }
        return ans;
    }

    public boolean isTrue(int[] count){
        return count[0] >0 && count[1] >0 && count[2] >0;
    }
}