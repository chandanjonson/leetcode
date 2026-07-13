class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        //here brute force will give tle 
        List<Integer> ans = new ArrayList<>();
        var str = String.valueOf(123456789);
        for(int i=2;i <=9;i++){
          for(int j=0;j <= 9-i;j++){
            var val = str.substring(j,j+i);
            if(!val.isEmpty()){
             var intVlaue = Integer.parseInt(val);
                
                if(intVlaue >= low && intVlaue <= high){
                ans.add(intVlaue);
                }
            }
          }
        }
        return ans;
    }
}