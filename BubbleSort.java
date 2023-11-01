import java.util.Scanner;

class BubbleSort{
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

        // Bubble Sort
        // Time Complexcity = O(n^2)
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    arr[j]=arr[j] ^ arr[j+1];
                    arr[j+1]=arr[j] ^ arr[j+1];
                    arr[j] =arr[j] ^ arr[j+1];
                }
            }
        }
        printArray(arr);
    }
}