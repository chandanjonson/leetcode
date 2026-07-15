class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum =0;
        int evensum =0;
        for(int i=1;i <=2*1000;i++){
            if(i%2 ==0){
                evensum +=i;
            }else{
                oddsum +=i;
            }
            if(i ==2*n){
                break;
            }
        }
        return gcd(oddsum, evensum);
    }
    int gcd (int a,int b){
        if(a==0) return b;
        return gcd(b%a, a);
    }
}