import java.util.*;
public class Reverse_Array {
    public static void reverse(int arr[])
    {
        int first=0,last=arr.length-1,temp;
        while(first<last)
        {
            temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;

        }


    }
    public static void main(String args[])
    {
        int arr[]={8,6,4,2};
        reverse(arr);
        System.out.print("Reverse Array:");
        for(int i=0;i<arr.length;i++)
        {
             System.out.print(arr[i]);
        }

    }
    
}
