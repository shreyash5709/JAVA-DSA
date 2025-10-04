public class _5_changeMatrixWithTranspose {
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
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7},{2,5,8},{3,6,9}};
        print(matrix);
        transpose(matrix);
        print(matrix);
    }
}
