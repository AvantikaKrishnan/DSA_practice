import java.util.*;
public class Cyclic_Shift {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();

                while(t != 0)
                {
                    int x = sc.nextInt();
                    long k  = sc.nextInt();
                    String A = sc.next();
                    String B =A;
                    String max = "";
                    int c = -1;
                    int r= 0;
                    for(int i =0;i<x;i++)
                    {

                        if(B.compareTo(max)>0 )
                        {

                            r=i;
                            max = B;

                        }
                        else if(B.equals(max))
                        {
                            c =i-r;
                            break;
                        }

                        B = B.substring(1) + B.substring(0,1);
                    }
                    if(c == -1)
                        System.out.println(r + (k-1)*x);
                    else
                        System.out.println(r + (k-1)*c);

                    t--;


                }
            }
        }
