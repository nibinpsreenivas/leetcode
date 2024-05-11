class Solution {
    public boolean isPerfectSquare(int num) {
        int flag;
        int i=0;
        if(num>10)
        {
        for(i=1;i<=num/3;i++)
        {
            if((i*i)==num)
            {
                return true;
            }
        }
        }
        else
        {
            for(i=1;i<=num/2;i++)
            {
            if((i*i)==num)
            {
                return true;
            }
           }
           if(num==1)
             return true;
        }
        return false;
    }
}