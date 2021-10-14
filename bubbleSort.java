import java.util.*;

public class bubbleSort
{
    public static int[] bubble (int arr[])
    {
        // outer loop is for iteration
        for(int i=0;i<=arr.length-1;i++)
        {
        // inner loop for comparing and swaping numbers 
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
     return arr;
    }
    public static void main(String [] args) throws Exception
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int []arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int []arr1=new int[n];
        bubble(arr);  
        // for prrinting the sorted array 
        for(int j =0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}