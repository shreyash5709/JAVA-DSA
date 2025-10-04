public class _2_mergeSort {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static int[] merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length && k<c.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
        return c;
    }

    public static void MergeSort(int[] arr){
        int n = arr.length;
        if(n<=1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0; i<n/2; i++){
            a[i] = arr[i];
        }
        for(int i=0; i<n-n/2; i++){
            b[i] = arr[i+n/2];
        }
        MergeSort(a);
        MergeSort(b);
        merge(a, b, arr);
        a = null;
        b = null;
    }
    public static void main(String[] args) {
        int[] arr =  {50,10,30,20,40,80,70,60,90};
        print(arr);
        MergeSort(arr);
        print(arr);
    }
}
