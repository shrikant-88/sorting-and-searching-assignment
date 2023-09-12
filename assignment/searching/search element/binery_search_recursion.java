import java.util.Scanner;

public class binery_search_recursion {
    public static int binery(int arr[],int low,int high,int target){
        int mid = (low + high)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]<target){
            return binery(arr, mid+1, high, target);
        }
        else{
            return binery(arr, low, mid-1, target);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array : ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int low = 0;
        int high = arr.length -1;
        
        System.out.print("enter target element : ");
        int target = sc.nextInt();
        int result = binery(arr, low, high, target);
        System.out.println("target element found at " + result );
    }
}
