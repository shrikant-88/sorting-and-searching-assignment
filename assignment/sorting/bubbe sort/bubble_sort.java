import java.util.Scanner;

public class bubble_sort {
  
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
      for(int i=0;i<n;i++){
        boolean flag = true;
        for(int j =0; j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int tamp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tamp;
                flag = false;
            }
        }
        if(flag == true) break;
      }
      System.out.println();
      System.out.println("After sorting");
      for(int i = 0;i<n;i++){
        System.out.print(arr[i] + " ");
    }
        
    }
}
