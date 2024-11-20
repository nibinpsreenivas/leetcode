class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                temp=temp+1;
            }
            else
            {
                if(count<temp)
                {
                    count=temp;
                }
                temp=0;
            }

            if((i+1)==nums.length && nums[i]==1){
               
                
                if(count<temp)
                {
                    count=temp;
                }
                temp=0;
            }
        }
         return count;
    }
    
}
