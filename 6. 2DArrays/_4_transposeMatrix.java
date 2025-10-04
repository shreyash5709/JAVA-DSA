public class _4_transposeMatrix {
    public static void print(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] tMatrix = new int[n][m];
        for(int j=0; j<n; j++){
            for(int i=0; i<m; i++){
                tMatrix[j][i] = matrix[i][j]; 
            }
        }
        return tMatrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7},{2,5,8},{3,6,9}};
        print(matrix);
        System.out.println();
        int[][] tMatrix = transpose(matrix);
        print(tMatrix);
    }
}
