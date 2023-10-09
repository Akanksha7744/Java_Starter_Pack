import java.util.*;
public class leap_year {
    public static void main(String args[]){
        int year;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the year");
        year=sc.nextInt();

        if(year%4==0)
        {
            if(year%100!=0 || year%400==0)
            {
                 System.out.println("Leep Year");
            }
        }
            else{
                System.out.println("Not Leap Year");
            }
    }
}
