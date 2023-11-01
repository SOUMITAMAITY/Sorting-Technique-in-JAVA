import java.util.Scanner;

public class SelectionSort {
   public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        //int arr[] = {3,2,8,1,9};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements to store:");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // Selection Sort
        // Time Complexcity = O(n^2)
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[small]>arr[j]){
                small = j;
               }
            }
            int temp = arr[i];
            arr[i]= arr[small];
            arr[small]=temp;
        }
        
        printArray(arr);
    }  
}
