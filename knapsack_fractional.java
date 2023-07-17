import java.util.*;

class knapsack_fractional{

    public static class Items{
        double profit;
        double weight;
        Items(int p, int w)
        {
            this.profit = p;
            this. weight= w;
        }

    }
    public static void main(String[] args) {
        Items[] arr = { new Items(30,5), new Items(40,10), new Items(45,15), new Items(77,22), new Items(90,25) };

        //(5, 10, 15, 22, 25)
        //
        // (30, 40, 45, 77, 90)

        Arrays.sort(arr, new Comparator<Items>() {
            @Override
            public int compare(Items item1, Items item2) {
                double val1 = (double)item1.profit/(double)item1.weight;
                double val2 = (double) item2.profit/(double)item2.weight;

                if(val1< val2)
                {
                    return 1;
                }
                else return -1;
            }
        });
//        for(int i =0;i<arr.length;i++)
//        {
//            System.out.println(arr[i].profit);
//        }

        int capacity = 60;

        System.out.println(Max(arr,capacity));
    }
    public static double Max(Items arr[] , int capacity)
    {

        double cur_profit = 0.0;
        double cur_weight = capacity;

        for(int i =0;i<arr.length;i++)
        {
            if(cur_weight - arr[i].weight>=0)
            {
                cur_profit += arr[i].profit;
                cur_weight -= arr[i].weight;
            }
            else {
                double frac = cur_weight/arr[i].weight;
                cur_weight -= arr[i].weight*frac;
                cur_profit += arr[i].profit*frac;
                break;

            }
        }
        return cur_profit;
    }
}