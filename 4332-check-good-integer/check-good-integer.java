class Solution {
    public boolean checkGoodInteger(int n) {
        return getsquaresum(n) - getsum(n) >=50;
    }
    int getsum(int n){
        var sum =0;
        while(n >0){
            sum +=n%10;
            n/=10;
        }
        return sum;
    }
    int getsquaresum(int n){
        var sum =0;
        while(n >0){
            int rem = n %10;
            rem = rem *rem;
            sum +=rem;
            n/=10;
        }
        return sum;
    }

}