import java.util.Arrays;

public class RecursionExample {

    public static void main(String[] args) {
        sumArrayRecursive(new int[] { 4, 3, 2, 1 }, 3);

        int sum = sumArrayIteratively(new int[] { 4, 3, 2, 1 });

        System.out.println(sum);

    }

    public static void doStuffRecursively() {
        System.out.println("Inside doStuff");
        doStuffRecursively();
    }

    public static int sumArrayRecursive(int[] nums, int index) {

        // base case
        if (index < 0 || nums == null || nums.length == 0) {
            return 0;
        }

        // totalsum is the value of the current index + the sum of everything that comes
        // before the array
        int totalsum = nums[index] + sumArrayRecursive(nums, index - 1);
        System.out.println(totalsum);
        return totalsum;

    }

    public static int sumArrayIteratively(int[] nums) {
        int sum = 0;
        if (nums == null) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

}
