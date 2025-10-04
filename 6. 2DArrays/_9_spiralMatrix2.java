import java.util.Scanner;

public class _9_spiralMatrix2 {
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
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int minr=0, maxr=n-1;
        int minc=0, maxc=n-1;
        int a = 1;
        while(minr<=maxr && minc<=maxc){
            for(int j = minc; j<=maxc; j++){
                arr[minr][j] = a;
                a++;
            }
            minr++;

            if(minr>maxr || minc>maxc) break;
            for(int i=minr; i<=maxr; i++){
                arr[i][maxc] = a;
                a++;
            }
            maxc--;

            if(minr>maxr || minc>maxc) break;
            for(int j = maxc; j>=minc; j--){
                arr[maxr][j] = a;
                a++;
            }
            maxr--;
            
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr; i>=minr; i--){
                arr[i][minc] = a;
                a++;
            }
            minc++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the matrix type n*n = ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        arr = generateMatrix(n);
        print(arr);
        sc.close();
    }
}