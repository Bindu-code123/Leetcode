class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        int r1=mat.length;
        int c1=mat[0].length;
        if(r1*c1==r*c)
        {
            int a[][]=new int[r][c];
            int m[]=new int[r1*c1];
            int b=0;
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<mat[i].length;j++)
                {
                    m[b]=mat[i][j];
                    b++;
                }
            }
            b=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    a[i][j]=m[b];
                    b++;
                }
            }
            return a; 
        }
        return mat;  
        
    }
}