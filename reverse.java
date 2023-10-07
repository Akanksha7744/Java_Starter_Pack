import java.util.Scanner;

public class reverse {
    public static void main(String args[])
    {
        System.out.print("Enter the n:");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int rev=0;
       for(int i=0;n>0;i++)
       {
        int l_digit=n%10;
        rev=(rev*10)+l_digit;
        n=n/10;  
       }
       System.out.println(rev);
    }
    
}
