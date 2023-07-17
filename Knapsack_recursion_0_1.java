public class Knapsack_recursion_0_1 {
    public static void main(String[] args) {

        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapSack(W, weight, profit, n));
    }
    public static int knapSack(int W, int weight[] , int profit[], int n)
    {
        if(n==0 || W == 0)
            return 0;

        if(weight[n-1]>W)
            return knapSack(W, weight,profit,n-1);

        else {
            return Max(profit[n-1]+knapSack(W-weight[n-1], weight, profit, n-1), knapSack(W, weight,profit,n-1));
        }


    }

    public static int Max(int a, int b)
    {
        return Math.max(a, b);
    }
}
