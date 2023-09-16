import java.util.Scanner;

class question_1 {
    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        scanner.close();

        int result = maxSumSubarray(nums, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + result);
    }
}


    // public static void main(String[] args) {
    //     int[] nums = {2, 1, 5, 1, 3, 2};
    //     int k = 3;
    //     System.out.println(maxSumSubarray(nums, k));
    // }




