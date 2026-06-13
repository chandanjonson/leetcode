class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(var word : words){
            int total = 0;
            for(var ch : word.toCharArray()){
                total +=weights[ch-'a'];
            }
            total %=26;
            sb.append((char)((25-total) +'a'));
        }
        return sb.toString();
    }
}