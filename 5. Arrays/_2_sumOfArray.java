public class _2_sumOfArray {
    public static void main(String[] args) {
        int []arr = {81,17,45,36,31,100,60};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.print("Sum of Array's element : " + sum);
    }
}
