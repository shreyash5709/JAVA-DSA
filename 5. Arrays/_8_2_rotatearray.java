public class _8_2_rotatearray {
    public static void reverse(int[] arr, int x, int y){
        while (x<=y) {
            int temp = arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
    }
    public static void rotate (int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        print(arr);
        int k=3;
        rotate(arr, k);
        print(arr);
    }
}
