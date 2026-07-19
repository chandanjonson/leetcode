class Solution {
    public long maximumValue(int n, int s, int m) {
        // u is up step for k step  =  s + k *m-(k-1)
        if (n== 1) return s;
        long u = n/2;

        long ans = s + u *m -(u -1);
        return ans;
    }
}