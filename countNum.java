import java.util.*;
public class countNum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
// 5555  - 555   
// 555   -  55   
// 55    -   5   
// 5     -   0   
