class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        //use brute force
        //here in sorting a > c nd for end we will comapre d >b
        Arrays.sort(intervals,(a,b)-> {
            if(a[0] != b[0]){
                return a[0] - b[0];
            }else return b[1] -a[1];
        });
        int prev = 0;
        int count =0;
         int end = 0;
        for(var v : intervals){
            end = v[1];
            if(end > prev){
                prev = end;
                count++;
            }
        }
        return count;
    }
}