public class _Qs5 {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,47},{3,4,7,8},{1,4,12,33}};
        int m = arr.length, n = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int tempsum = 0;
            for (int j = 0; j < n; j++) {
                tempsum+=arr[i][j];
            }
            sum = Math.max(tempsum, sum);
        }
        System.out.print(sum);
    }
}
