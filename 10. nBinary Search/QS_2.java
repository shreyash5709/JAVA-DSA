public class QS_2 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,1,1,1};
        int n = arr.length;
        int s = 0, e = n-1;
        int lb = -1;

        // for lower bound 
        while (s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid]==1){
                if(mid>0 && arr[mid]==arr[mid-1]) e=mid-1;
                else{
                    lb = mid;
                    break;
                }
            }
            else s = mid+1;
        } 
        System.out.println(lb);
        int count = (lb == -1)? 0 : n-lb;
        System.out.println("Count of 1 : " + count);
    }
}
