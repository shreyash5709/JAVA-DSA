public class _6_clockWiseRotate {
    public static void print(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        return matrix;
    }
    public static int[][] clockWiserotate(int[][] matrix) {
        int m = matrix.length;
        matrix = transpose(matrix);
        print(matrix);
        for (int i = 0; i < m; i++){
            int a=0, b=m-1;
            while (a<b) {
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = temp;
                a++; b--;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        print(matrix);
        clockWiserotate(matrix);
        print(matrix);
    }
}
