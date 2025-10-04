public class _10_sort012 {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int[] arr){
        int n = arr.length;
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m<=h){
            if(arr[m]==0){
                swap(arr, m, l);
                l++;
                m++;
            }
            else if(arr[m]==1) m++;
            else {
                swap(arr, m, h);
                h--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,2,2,1,1,0,0,0,1,1,0,2,2,1,1,1};
        print(arr);
        sort(arr);
        print(arr);
    }
}
