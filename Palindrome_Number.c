bool isPalindrome(int x){
   if(x<0)
   {
       return false;
   }
   int temp=x,d;
   long int sum=0;
   while(temp!=0)
   {
     d=temp%10;
     sum=sum*10+d;
     temp=temp/10;
   }
   if(sum==x)
      return true;
   else 
      return false;
}