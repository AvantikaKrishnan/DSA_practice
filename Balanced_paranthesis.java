import java.util.*;
public class balanced_paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        helper("",n,0,0);


    }
    public static void helper(String s, int n,int right,int left)
    {
        if(s.length() == n && right == left)
        {
            System.out.println(s);
            return;
        }
        if(right<n)
        {
            helper(s+"(",n,right+1,left);
        }
        if(left<right)
        {
            helper(s+")",n,right,left+1);
        }

    }
}
