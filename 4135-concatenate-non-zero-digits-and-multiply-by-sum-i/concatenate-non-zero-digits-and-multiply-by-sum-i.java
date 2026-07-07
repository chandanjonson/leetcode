class Solution {
    public long sumAndMultiply(int n) {
        long ans =0l;
        for(var ch : String.valueOf(n).toCharArray()){
            if(ch !='0'){
                int val = (int)(ch -'0');
                ans = ans *10 + val;
            }
        }
        int rev = getDigit(n);
        int sum = getDigit(rev);
        return getDigitSum(n)*1l * sum;

    }
    long getDigitSum(int n){
        long sum = 0l;

        while(n !=0){
          int mod = n%10;
          sum +=mod;
          n /=10;
        }
        return sum;
    }
    int getDigit(int n){
        int sum = 0;
        while(n !=0){
          int mod = n%10;
          if(mod !=0)
          sum  = sum *10 + mod;
          n /=10;
        }
        return sum;
    }
}