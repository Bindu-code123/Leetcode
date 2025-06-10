import java.util.*;
class Solution {
    public int maxDifference(String s) 
    {
        int a=0,b=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            int c=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                c++;
            }
            if(c%2==1 && c>a)
            a=c;
            else if(c%2==0 && c<b)
            b=c;
        }
        return a-b;
    }
}
