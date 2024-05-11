import java.util.*;
class two_sum {
    public int[] twoSum(int[] nums, int target) 
    {
          
       int temp[] = new int[2];
       int n = nums.length;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i!=j)
               {
                   if((nums[i]+nums[j])==target)
                   {
                       temp[0]=i;
                       temp[1]=j;
                       
                   }
               }
           }     
       } 
       System.out.println("numbers is ["+ temp[1] +","+temp[0]+"]");
       return temp;
    }
    public static void main(String args[])
    {
      two_sum obj = new two_sum();
      Scanner in = new Scanner(System.in);
      System.out.println("enter how many numbers");
      int n = in.nextInt();
      
      int a[]= new int[n];
      
      for(int i=0;i<n;i++)
      {
           a[i] = in.nextInt();
      }
      System.out.println("enter traget numbers");
      int t = in.nextInt();
   obj.twoSum(a,t);  
   }  
}
