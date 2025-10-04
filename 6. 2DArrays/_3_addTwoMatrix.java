public class _3_addTwoMatrix {
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
    public static int[][] addMatrix(int[][] arr1, int[][] arr2){
        int m1 = arr1.length;
        int n1 = arr1[0].length;
        int m2 = arr2.length;
        int n2 = arr2[0].length;
        if(m1!=m2 && n1!=n2){
            System.out.print("Addition of matrices are not possible !");
        }
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[][] arr1 = {{1,4,7},{2,5,8},{3,6,9}};
        int[][] arr2 = {{9,6,3},{8,5,2},{7,4,1}};
        // int[][] ans = addMatrix(arr1, arr2);
        addMatrix(arr1, arr2);
        print(arr1);
    }
}