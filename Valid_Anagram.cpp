class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) {
            return false;
        }
        
      
        int countS[26] = {0};
        int countT[26] = {0};
        
      
        for (int i=0;i<s.length();i++) {
            char c=s[i];
            countS[c - 'a']++;
        }
       
        for (int i=0;i<s.length();i++) {
            char c=t[i];
            countT[c - 'a']++;
        }
        
       
        for (int i = 0; i < 26; i++) {
            if (countS[i] != countT[i]) {
                return false;
            }
        }
        
        return true;
    }
};