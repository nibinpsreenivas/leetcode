class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]= new int[2];
        
        
        for(int i=0;i<2;i++)
        {
            result[i]=-1;
        }
        if(nums.length==0)
        {
            return result;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]== target)
            {
                if(result[0]==-1)
                {
                    result[0]=i;
                }
                else
                {
                    result[1]=i;
                }
            }
        }
        if(result[1]==-1)
        {
            result[1]=result[0];
        }
        return result;
    }
}
