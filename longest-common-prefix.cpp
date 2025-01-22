class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int count =0;
        string newString="";
        int small=getSmallCount(strs);
        while(count<small)
        {
           char c=' ';
            for(int i=0;i<strs.size();i++)
            {
                if(i==0)
                {
                    c=strs[i][count];
                }
                else {
                    if(c!=strs[i][count])
                    {
                        c='!';
                    }
                }
            }
            if(c=='!')
            {
                break;
            }
            newString+=c;
            count++;
        }
        return newString;
    }
    int getSmallCount(vector<string>strs)
    {
        int count=strs[0].length();
        for(int i=0;i<strs.size();i++)
        {
            if(count>strs[i].length())
            {
                count=strs[i].length();
            }
        }
      return count;
    }
};
