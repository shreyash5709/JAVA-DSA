class _1_mergeArray{
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
    public static void main(String[] args) {
        int[] a = {10,20,40,60,90};
        int[] b = {20,30,40,50,70,80};
        print(a);
        print(b);
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];
        merge(a, b, c);
        print(c);
    }
}