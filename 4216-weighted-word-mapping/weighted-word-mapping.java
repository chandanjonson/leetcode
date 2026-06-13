class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Integer,Character> map = new HashMap<>();
        for(int i=25;i >=0;i--){
           map.put(i, (char)((25-i)+'a'));
        }
        StringBuilder sb = new StringBuilder();
        for(var word : words){
            int total = 0;
            for(var ch : word.toCharArray()){
                total +=weights[ch-'a'];
            }
            total %=26;
            sb.append(map.get(total));
        }
        return sb.toString();
    }
}