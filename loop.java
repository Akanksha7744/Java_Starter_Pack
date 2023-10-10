import java.util.*;
public class loop {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2)
        {
            System.out.println("n is prime");
        }else{
            boolean isPrime =true;
            for(int i=2;i<=n-1;i++)
        {
            if(n%i==0){
                isPrime = false;
            } 
        }
            if(isPrime == true)
            {
                System.out.println("n is prime");
            }
            else
            {
                System.out.println("n is not prime");
            }      
        }
    }
}
/*  ------Printed Hello World 100 Times-------
int counter=0;
    while(counter<100)
    {
        System.out.println("Hello World");
        counter++;
    }
    System.out.println("Printed Hello World 100 Times");
    ------------------------------------------------------
    1 to 10 number print
    int counter=1;
    while(counter<=10)
    {
        System.out.println(counter);
        counter++;
    } 
    print number 1 to n number
     Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();

    int counter=1;
    while(counter<=range)
    {
        System.out.println(counter+"");
        counter++;
    }
    ----------------------------------------
    Sum of First natural numbers
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int i=1;
    while(i<=n)
    {
        sum+=i;
        i++;
    }
    System.out.println("sum is:"+sum);
    -------------------------------------
    print 1 to 10 using for loop
    for(int i=1;i<=10;i++)
    {
        System.out.println("Hello World");
    }
    -------------------------------------
    print squre pattern
    for(int line=1;line<=4;line++)
    {
        System.out.println("****");
    }
    ------------------------------------
    print reverse number
     int n=1998;
        while(n>0)
    {    int lastdigit = n%10;
        System.out.println(lastdigit);
        n=n/10;
    }
    --------------------------------
    Hello World print using do while loop
    int counter=1;
        do{
            System.out.println("Hello World");
            counter++;
        }
        while(counter<=10);
        --------------------------------
        break statement

for(int i=1;i<5;i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
        --------------------------------------
        do{
            System.out.println("enter your number:");
            int n=sc.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);

        }while(true);
        ---------------------------------------------
        continue loop
         for(int i=1;i<5;i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
        -------------------------------------------------
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter your number:");
            int n=sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println("number was:"+ n);
        }while(true);*/