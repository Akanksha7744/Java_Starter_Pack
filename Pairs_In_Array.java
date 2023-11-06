import java.util.*;
public class Pairs_In_Array {
public static void Print_Pairs(int nums[])
{
    int tp=0;
    for(int i=0;i<nums.length;i++){
        int curr=nums[i];
        for(int j=i+1;j<nums.length;j++){
            System.out.print("(" +curr +"," +nums[j] +")");
            tp++;
        }
        System.out.println();
    }
    System.out.println("Total Piars:"+tp);

}
    public static void main(String args[]){
        int nums[]={2,4,6,8,10};
        Print_Pairs(nums);
    }
    
}
