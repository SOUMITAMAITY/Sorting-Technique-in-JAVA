import java.util.Scanner;

public class InsertionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
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

        // Insertion Sort
        // Time Complexcity = O(n^2)
        
        for(int i=1;i<arr.length;i++){
           int current = arr[i];
           int j=i-1;
           while(j>=0 && current<arr[j]){
            arr[j+1]=arr[j];
            j--;
           }
           //placement
           arr[j+1]=current;
        }
        printArray(arr);
    }
}
