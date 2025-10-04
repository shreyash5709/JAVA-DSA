public class _13_searchTargetValue {
    public static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i=m-1, j=0;
        while(i>=0 && j<n) {
            if(arr[i][j]==target) return true;
            else if(arr[i][j]>target) i--;
            else j++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        boolean flag = searchMatrix(arr, target);
        if(flag == true) System.out.print("Element foud in given Array !");
        else System.out.print("Element not foud in given Array !");
    }
}
