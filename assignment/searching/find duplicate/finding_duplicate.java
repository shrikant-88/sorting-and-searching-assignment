public class finding_duplicate {
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,2,5,3,7,8};
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j])
                System.out.println("duplicate element = " + arr[i] + "  at index "+ j );
            }
        }
    }
}
