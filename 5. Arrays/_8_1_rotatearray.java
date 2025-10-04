public class _8_1_rotatearray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            if(i<k){
                temp[i] = nums[n-k+i];
            }else{
                temp[i]=nums[i-k];
            }
        }
        for(int i=0; i<n; i++){
            nums[i]=temp[i];
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int k=3;
        rotate(arr, k);
    }

}
