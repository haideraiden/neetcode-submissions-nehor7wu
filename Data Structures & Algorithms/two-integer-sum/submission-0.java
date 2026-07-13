class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> indices = new HashMap<>();

        for(int i = 0 ; i<nums.length ; i++)
        {
            indices.put(nums[i],i);

        }

        for(int i = 0 ; i<nums.length ; i++)
        {
            int diff = target-nums[i];
            if(indices.containsKey(diff) && indices.get(diff)!=i)
            {
                int arr[] = new int[2];
                arr[0]= i;
                arr[1]= indices.get(diff);
                return arr;
            }
           
        }

         return new int[0];
    }
}
