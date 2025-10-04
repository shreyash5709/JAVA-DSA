public class _8_reverseMergeSort {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void MergeSort(int[] arr){
        int n = arr.length;
        if(n<=1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; i++){
            a[i]=arr[i];
        }
        for(int i=0; i<n-n/2; i++){
            b[i]=arr[i+n/2];
        }
        MergeSort(a);
        MergeSort(b);
        merge(a, b, arr);
    }

    public static int[] merge(int[] a, int[] b, int[] c){
        int m=a.length, n=b.length, o=c.length;
        int i=0, j=0, k=0;
        while(i<m && j<n && k<o){
            if(a[i]>=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<m) c[k++] = a[i++];
        while(j<n) c[k++] = b[j++];
        return c;
    }
    public static void main(String[] args) {
        int[] arr =  {50,10,30,20,40,80,70,60,90};
        print(arr);
        MergeSort(arr);
        print(arr);
    }
}
