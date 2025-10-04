import java.util.*;
public class _3_absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.print(-n);
        }else{
            System.out.print(n);
        }
        sc.close();
    }
}
