import java.util.*;
public class ArraySumAddSum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            arr[i]=scn.nextInt();
            sum=sum+arr[i];
        }
        while (sum >= 10) {
            int tempSum = 0;
            while (sum != 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }
        System.out.println("Single-digit sum: " + sum);
    }
}




