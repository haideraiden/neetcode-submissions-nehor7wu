class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int k = 2*n;
        int [] arr = new int[k];
        for(int i = 0;i<nums.length; i++)
        {
            arr[i]=nums[i];
        }

        int i = n;
        int l = 0;

         while(i<k && l<nums.length)
         {
            arr[i]=nums[l];
            i++;
            l++;
         }

         return arr;

        
        
    }
}