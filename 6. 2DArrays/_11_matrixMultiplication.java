public class _11_matrixMultiplication {
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
    public static int[][] multiply(int[][] a, int[][] b){
        int m = a.length, n = b[0].length;
        int[][] c = new int[m][n];
        for(int i=0; i<c.length; i++){
            for (int j = 0; j < c[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] = a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3,},{4,5,6}}, b = {{1,2},{3,4},{5,6}};
        if(a[0].length != b.length){
            System.out.print("Multiplication not possible !");
        }
        
        int[][] c = multiply(a, b);
        
        print(a);
        print(b);
        print(c);
    }
}
