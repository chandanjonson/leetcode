class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        //sort the aaray first
        //than maximum elem will after checking with adj elem and inc with 1 if ts dioff >1
        //
        Arrays.sort(arr);
        arr[0] =1;
        int ans =arr[0];
        for(int i=1;i < arr.length;i++){
           arr[i] = Math.min(arr[i], arr[i-1]+1);
        }

        return arr[arr.length-1];
    }
}