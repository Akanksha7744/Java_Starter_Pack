import java.util.*;
public class Overloading1 {
    //function to calculate sum of 2 integer numbers
    public static int sum(int  a,int b)
    {
        return a+b;
    }
    //function to calculate sum of 2 float numbers
    public static float sum(float a,float b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f, 4.8f));

    }
    
}
/*---------------------------------------------------------
Overloading using parameters
 //function to calculate sum of 2 numbers
    public static int sum(int  a,int b)
    {
        return a+b;
    }
    //function to calculate sum of 3 numbers
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));

    }
---------------------------------------------
 Overloading using Datatypes
  public static int sum(int  a,int b)
    {
        return a+b;
    }
    //function to calculate sum of 2 float numbers
    public static float sum(float a,float b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println(sum(3,5));
        System.out.println(sum(3.2f, 4.8f));

    }
    
}*/