public class _6_dublet {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int x = 10;
        int[] arr = {0,10,8,-12,2,6,22,3};
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + x);
                }
            }
        }
    }
}