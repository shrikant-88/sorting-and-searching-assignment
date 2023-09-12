import java.util.Scanner;
//time complexity in worst case = O(n^2)
//time complexity in best case = O(n)
//space complexity = O(1)
public class insertion_sort {
    public static void Insertion_Sort(int arr[],int n) {
        for(int i =0;i<n;i++){
            int j =i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]= temp ;
                j--;
            }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        Insertion_Sort(arr, n);
        System.out.println();
        System.out.println("after appling insertion sorting algorithm  ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        
    }
}
