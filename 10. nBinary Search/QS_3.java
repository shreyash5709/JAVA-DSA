public class QS_3 {
    public static void main(String[] args) {
        int[][] arr = { {0,1,1,1},
                        {0,0,1,1},
                        {1,1,1,1}
                        };
        
        int m = arr.length;
        int n = arr[0].length;
        int idx = -1;
        int mx1 = 0;
        for (int i = 0; i < m; i++) {
            int s = 0, e = n-1;
            int lb = -1;
            // for lower bound 
            while (s <= e) {
                int mid = s + (e-s)/2;
                if(arr[i][mid]==1){
                    if(mid>0 && arr[i][mid]==arr[i][mid-1]) e=mid-1;
                    else{
                        lb = mid;
                        break;
                    }
                }
                else s = mid+1;
            }
            int count = (lb == -1)? 0 : n-lb;
            mx1 = Math.max(mx1, count);
            if(count==mx1) idx=i;
        }

        System.out.println("Maximum count of 1 in a matrix array : " + mx1);
        System.out.println(idx);
    }
}
