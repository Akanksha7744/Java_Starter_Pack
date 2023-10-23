import java.util.*;
public class BasicsOfStrings {
    public static void print(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        // char arr[]={'a', 'b', 'c', 'd'};
        // String str="abcd";
        // String str1=new String("xyz");
        //System.out.println(str);
        //System.out.println(str1);

        //Strings Are IMMUTABLE in java means Strings are not changable.

        // Scanner sc=new Scanner(System.in);
        // String name;

        //name=sc.next(); It can contain only word.
        // name =sc.nextLine(); //It can contain Whole line of stings.
        // System.out.println(name);


        //----------------String length Calculate----------------
        // String fullName="Tony Stark";
        // System.out.println(fullName.length());


        String StartName="Tony";
        String LastName="Stark";
        String fullName=StartName+ " " +LastName;
        //System.out.println(fullName.charAt(1));
        print(fullName);

        
    }
    
}
