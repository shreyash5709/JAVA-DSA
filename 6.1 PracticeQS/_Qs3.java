public class _Qs3 {
    public static void print(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] < 10){
                    System.out.print(arr[i][j] + "  ");
                }else{
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int getSumOfRactangle(int[][] arr, int l1, int l2, int r1, int r2){
        int total = 0;
        int top = Math.min(l1, l2);
        int bottom = Math.max(l1, l2);
        int left = Math.min(r1, r2);
        int right = Math.max(r1, r2);

        for(int i=top; i<=bottom; i++){
            for (int j = left; j <= right; j++){
                total += arr[i][j];
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};
        int l1=1, l2=3, r1=2, r2=3;
        print(arr);
        int total = getSumOfRactangle(arr, l1, l2, r1, r2);
        System.out.print(total);
    }
}
