public class _3_moveZero {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;
        int noz = 0;
        for (int ele : arr) {
            if(ele == 0) noz++;
        }
        for (int i = 0; i < noz; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
