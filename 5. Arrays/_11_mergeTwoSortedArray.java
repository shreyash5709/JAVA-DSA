public class _11_mergeTwoSortedArray {
    public static void print(int[] arr){
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {21,33,45,50};
        int[] b = {22,23,44,55,80};
        int n = a.length;
        int m = b.length;
        int [] c = new int[n+m];
        int i=0, j=0, k=0;
        while (i<n && j<m) {
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        
        while(j<m){
            c[k]=b[j];
            j++; k++;
        }
    
        while(i<n){
            c[k]=a[i];
            i++; k++;
        }
        
        print(a);
        print(b);
        print(c);
    }
}
