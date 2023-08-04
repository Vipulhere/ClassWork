import java.util.*;
public class arrayMidSort {
    public static void sorting(int arr[], int start,int end){
        for(int i=start;i<end;i++){
            int min=i;
            for(int j=i;j<=end;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int mid=n/2;
        sorting(arr, 0, mid-1);
        sorting(arr, mid+1, n-1);      
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


