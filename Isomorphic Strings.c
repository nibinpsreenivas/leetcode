bool isIsomorphic(char * s, char * t){

     int n= strlen(s);
     int m= strlen(t);
    
     for(int i=0;i<n;i++)
     {
         char c =t[i];
          for(int j=i+1;j<m;j++)
          {
             if(c==t[j])
             {
                 if(s[j]!=s[i])
                 {
                     
                     return false;
                 }
             }
             if(s[i]==s[j]&&i!=j)
             {
                 if(t[j]!=t[i])
                 {
                    
                     return false;
                 }
             }  
          }
     }
    
    
   return true;

}