public class _9_1_shortArray {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void sort(int[] arr){
        int n = arr.length;
        int noOfOnes = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==1) noOfOnes++;
        }
        for(int i=0; i<n; i++){
            if(i<noOfOnes) arr[i]=0;
            else arr[i]=1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,0,1,0};
        print(arr);
        sort(arr);
        print(arr);
    }
}
