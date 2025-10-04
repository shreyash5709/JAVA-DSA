public class _2_largestEle {
    public static void main(String[] args) {
        int[][] arr = {{1,5,8},{2,6,9},{4,7,3}};
        int m = arr.length;
        int n = arr[0].length;
        int le = Integer.MIN_VALUE;
        int sum = 0;
        int pruduct = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                le = Math.max(le, arr[i][j]);
                sum += arr[i][j];
                pruduct *= arr[i][j];
            }
        }
        System.out.println("Max is : " + le);
        System.out.println("Sum is : " + sum);
        System.out.println("Product is : " + pruduct);
    }
}
