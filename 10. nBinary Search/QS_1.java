public class QS_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,4,5};
        int x = 4;
        int s = 0, e = arr.length-1;
        int idx = -1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] == x){
                if(mid+1 < arr.length && arr[mid+1] == x) s=mid+1;
                else {
                    idx = mid;
                    break;
                }
            }
            else if(arr[mid]<x) s=mid+1;
            else e=mid-1;
        }
        System.out.println("Last occurence of target "+ x + " : " + idx);
    }
}
