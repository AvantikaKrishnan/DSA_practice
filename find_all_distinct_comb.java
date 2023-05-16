import java.util.*;
public class find_all_distinct_comb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        helper(arr,k,a,b,0 );
    }
    public static void helper(int arr[],int n, ArrayList<Integer> l , ArrayList<Integer> f,int i)
    {
        if(arr.length == 0)
            return;
        if(n == 0) {
            f.addAll(l);
            System.out.println(f);
            f.clear();
            return;
        }
        else {
            for(int j =i;j<arr.length;j++)
            {
                l.add(arr[j]);
                helper(arr,n-1,l,f,j+1);
                l.remove(l.size()-1);
            }
        }





    }

}
