class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[]ans = new int[n+1];
        for(var v : bookings){
            int start = v[0];
            int end = v[1];
            int sz = v[2];
            for(int i = start;i <=end;i++){
                ans[i] +=sz;
            }
        }
        var op = Arrays.copyOfRange(ans, 1, n+1);
        return op;
    }
}