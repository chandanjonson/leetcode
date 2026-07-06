class Solution {
    public int maxDigitRange(int[] nums) {
        //first find the digit range ans use map to store the num
        //
        int maxValue = Integer.MIN_VALUE;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(var v : nums){
            int diffValue = getDiff(v);
            maxValue = Math.max(maxValue, diffValue);
            map.computeIfAbsent(diffValue, k -> new ArrayList<>()).add(v);
        }
        int sum =0;
        for(var v : map.get(maxValue)){
            sum +=v;
        }
        return sum;


    }
    int getDiff(int num){
        int n = num;
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n !=0){
            int mod = n %10;
            max = Math.max(max, mod);
            min = Math.min(min, mod);
            n /=10;
        }

        return max - min;
    }
}