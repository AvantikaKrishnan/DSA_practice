public class Knapsack_dp_0_1 {
    public static void main(String[] args) {
        int profit[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };

        int W = 50;
        int N = profit.length;

        int dp[][] = new int[N+1][W+1];

        for(int i =0;i<N+1;i++)
        {
            for(int j = 0; j<W+1;j ++)
            {
                dp[i][j] = -1;
            }
        }

        System.out.println(knapSack(W, weight, profit, N, dp));
    }
    public static int knapSack(int W, int weight[] , int profit[], int N, int dp[][])
    {
        if(N==0 || W == 0)
            return 0;

        if (dp[N][W] != -1)
            return dp[N][W];

        if(weight[N-1]>W)
        {
            return dp[N][W] = knapSack(W,weight,profit,N-1,dp);
        }
        else {
            return dp[N][W] = Math.max(profit[N-1]+knapSack(W-weight[N-1], weight, profit, N-1,dp), knapSack(W, weight, profit, N-1, dp));
        }

    }


}

