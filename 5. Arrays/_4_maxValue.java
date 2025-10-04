public class _4_maxValue {
    public static void main(String[] args) {
        int arr[] = {10,8,12,4,6,23,3};
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            mx = Math.max(mx, arr[i]);
        }
        System.out.print(mx);
    }
}