public class _5_secondMax {
    public static void main(String[] args) {
        int arr[] = {10,8,12,4,6,23,3};
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            mx = Math.max(mx, arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=mx){
                smx = Math.max(smx, arr[i]);
            }
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
