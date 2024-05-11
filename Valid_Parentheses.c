bool isValid(char * s){
    int n=strlen(s);
    int set=0;
    char stack[n];
    int back=-1;
    int w=0;

    for(int i=0;i<n;i++)
    {
        if(s[i]=='(')
        {
           set=1;
               stack[++back]='(';
           
        
        }
        else if(s[i]=='[')
        {
              set=1;
               stack[++back]='[';
           
        }
        else if(s[i]=='{')
        {
              set=1;
              stack[++back]='{';
           
        }
          else if(s[i]==')' )
        {
          if(back!=-1)
          {
             if(stack[back]=='(' )
               back--;
            else
               w=1;
          }
          else
            w=1;
           
           
        }
          else if(s[i]==']')
        {
           if(back!=-1)
          {
             if(stack[back]=='[' )
               back--;
              else
               w=1;
          }
          else
            w=1;
           
        }
          else if(s[i]=='}')
        {
          if(back!=-1)
          {
             if(stack[back]=='{' )
               back--;
            else
               w=1;
          }
          else
            w=1;
        }
      
       
    }
    
  if(back==-1 && set==1)
  { 
   if(n%2==0 && w==0)
    return true;
  }
       
return false; 
}
