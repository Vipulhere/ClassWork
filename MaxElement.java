// import java.util.*;
// public class MaxElement{

//     public static void Max(int arr[],int max, int i){
//         if(i==arr.length){
//             System.out.println(max);
//             return;
//         }
//         if(arr[i]>max){
//             max=arr[i];
//         }
//         i++;
//         Max(arr,max,i);

//     }
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         int n=scn.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=scn.nextInt();
//         }
//         int max=Integer.MIN_VALUE;ji
//         Max(arr,max,0);
//     }
// }


import java.util.Scanner;
public class MaxElement {
    public static int findMax(int[] arr) {
        return findMaxRecursive(arr, 0, arr.length - 1);
    }
    private static int findMaxRecursive(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = findMaxRecursive(arr, left, mid);
        int maxRight = findMaxRecursive(arr, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();// 
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int maxElement = findMax(arr);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}