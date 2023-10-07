import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String args[])
    {
        float r;
       Scanner sc=new Scanner(System.in);
       System.out.println("Area Of Circle");
       r=sc.nextFloat();
       float area=3.14f*r*r;
       System.out.println(area);

    }
}
