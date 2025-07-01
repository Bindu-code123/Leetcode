class Solution {
    public String finalString(String s) 
    {
        StringBuilder sc=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='i')
            sc.reverse();
            else
            sc.append(c);
        }   
        return sc.toString();
    }
}