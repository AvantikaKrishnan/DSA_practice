public class Saddle_point {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int n = 3;
        if (findSaddlePoint(mat, n) == false)
            System.out.println("No Saddle Point ");
    }
    public static boolean findSaddlePoint(int mat[][], int n)
    {
        for(int i =0;i<n;i++)
        {
            int min = mat[i][0];
            int col = 0;
            for(int j = 0;j<n;j++)
            {
                if(min>mat[i][j])
                {
                    min = mat[i][j];
                    col = j;
                }

            }
             int k;
            for( k = 0;k<n;k++ )
            {
                if(min<mat[k][col])
                    break;


            }
            if(k == n) {
                System.out.println("Saddle Point : " + min);
                return true;
            }
        }
        return false;
    }
}
