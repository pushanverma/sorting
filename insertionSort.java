import java.util.*;

public class insertionSort {
    
    public static int[] insertion(int arr[])
    {
        // since we assume that 0th position is sorted , we began our loop from 1 position
            for(int i=1;i<arr.length;i++)
            {
                for(int j =i-1;j>=0;j--)
                {
                    // if we find element which is bigger and present in the sorted box then we will swap with the element outside it 
                    if(arr[j]>arr[j+1])
                    {
                        int temp =arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                    else
                    {
                        break;
                    }
                }
            }
    return arr;
    }
    public static void printarray(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int []arr =new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        insertion(arr);
        System.out.println("sorted array ->");
        printarray(arr);
    }
}
