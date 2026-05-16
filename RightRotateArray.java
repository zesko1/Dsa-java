import java.util.Scanner;

class RightRotateArray {

    public void reverse(int arr[], int start, int end) {

        while(start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // reverse first part
        reverse(nums, 0, n - k - 1);

        // reverse second part
        reverse(nums, n - k, n - 1);

        // reverse whole array
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) 
    {
     
        Scanner sc = new Scanner(System.in);
         
         RightRotateArray obj = new RightRotateArray();

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate: ");
        int k = sc.nextInt();

        obj.rotate(nums, k);

        System.out.println("Array after right rotation:");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
         sc.close();

    }
}