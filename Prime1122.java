/*import java.util.*;
public class Prime1122
{
    public static void main(String atgs[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int count=0;

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
            {
                System.out.println("Prime No");
            }
            else
            {
                System.out.println("Not Prime No");
            }
    }
} */
import java.util.*;
public class Prime1122
 {
public static void main (String args[])
{
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number");
    n=sc.nextInt();
    int count=0;

    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        System.out.println("This is prime number");
    }
    else{
        System.out.println("This is not prime number");
    }
}
}
