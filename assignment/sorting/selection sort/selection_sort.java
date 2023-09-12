import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("before sorting");
        for(int i = 0;i<n;i++){
          System.out.print(arr[i] + " ");
        }
        for(int i =0;i<n;i++){
            int min = i;
            for(int j = i+1; j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min!=i){
                int tamp = arr[min];
                arr[min]= arr[i];
                arr[i]=tamp;

            }
        }
        System.out.println();
        System.out.println("after appling selection sort algorithm ");
        for(int i = 0;i<n;i++){
          System.out.print(arr[i] + " ");
        }

    }
}
