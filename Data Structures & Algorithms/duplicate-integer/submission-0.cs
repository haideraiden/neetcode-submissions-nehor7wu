public class Solution {
    public bool hasDuplicate(int[] nums) {
        int counter = 0;
        for(int i = 0 ; i<nums.Length; i++)
        {
            for(int j=i+1; j<nums.Length; j++)
            {
            if(nums[i]== nums[j])
            {
                counter= counter+1;
                return true;
            }
            if (j+1==nums.Length)
             break;
            }

        }
        return false;
        
    }
}