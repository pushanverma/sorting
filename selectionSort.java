import java.util.*;


public class selectionSort {

    public static int[] Selection(int arr[])
    {
        // loop to check iteration 
        for(int i =0;i<arr.length-1;i++)
        {
            int min=i;
            // loop to compare min 
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min] ) 
                {
                min =j;  
                }
                
            }
            // since we have taken the min initally as i , so we have to swap with i and not j , thats why here 
                int temp =arr[min];
               arr[min]=arr[i];
                arr[i]=temp; 
            
        }
        return arr;
    }
    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        Selection(arr);
        System.out.println("sorted array->");
// for printing the sorted array 
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
