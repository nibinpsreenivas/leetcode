class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     int len=0;
     Arrays.sort(nums1);
     Arrays.sort(nums2);
     int count=0;
     int set=0;
     if(nums1.length>nums2.length)
     {
        len=nums2.length;

     }
     else
     {
        len=nums1.length;
     }   
    int inn[] = new int[len];
    for(int i=0;i<nums1.length;i++)
    {
        for(int j=0;j<nums2.length;j++)
        {
           if(nums1[i]==nums2[j])
           {
              if(count==0)
              {
                inn[count++]=nums1[i];
              }
              else
              {
                set=0;
                for(int k=0;k<count;k++)
                {
                    if(inn[k]==nums1[i])
                    {
                        set=1;
                    }
                }
                if(set==0)
                {
                    inn[count++]=nums1[i];
                }
              }
           }
        }
    }
    int arr[]= new int[count];
    for(int i=0;i<count;i++)
    {
        arr[i]=inn[i];
    }
    return arr;

    }
}
