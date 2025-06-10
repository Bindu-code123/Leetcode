class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) 
    {
        int p=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(j<matrix[i].length-1 && i<matrix.length-1)
                {
                    if(matrix[i][j]==matrix[i+1][j+1])
                    p++;
                }
            }
        } 
        int q=(matrix.length-1)*(matrix[0].length-1);
        System.out.print(p+" "+q);
        if(p==q)
        return true;
        return false;  
    }
}