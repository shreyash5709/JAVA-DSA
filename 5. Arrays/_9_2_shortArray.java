public class _9_2_shortArray {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void sort(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,1,1,1,1,1};
        print(arr);
        sort(arr);
        print(arr);
    }
}
