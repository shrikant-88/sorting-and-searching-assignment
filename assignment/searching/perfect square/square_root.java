import java.util.Scanner;

public class square_root {
    public static int findSquareRoot(int n) {
        int low =0,high =n,result =-1;
        int val;
        int mid;
        while (low<=high) {
           mid = (low +high)/2;
           val = mid*mid;
           if (val == n) {
            return mid;
           }  
           else if(val<n){
            result = mid;
            low = mid +1;
           }
           else{ 
            high = mid-1;
           }

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.print("enter a number to find its square square root : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = findSquareRoot(n);
        System.out.println("square root of "+ n + " = " + result);
    }
}
