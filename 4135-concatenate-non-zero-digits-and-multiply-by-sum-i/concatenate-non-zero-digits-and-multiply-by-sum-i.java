class Solution {
    public long sumAndMultiply(int n) {
        long ans =0l;
        for(var ch : String.valueOf(n).toCharArray()){
            if(ch !='0'){
                int val = (int)(ch -'0');
                ans = ans *10 + val;
            }
        }
        
        return ans * getDigitSum(n);


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
}