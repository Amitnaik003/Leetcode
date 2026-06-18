import java.util.*;

class tripletexistinarray {

    public boolean increasingTriplet(int[] nums) {

        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];

        if (nums.length < 3) {
            return false;
        }

        // Prefix minimum array
        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = Math.min(nums[i], pre[i - 1]);
        }

        // Suffix maximum array
        suf[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            suf[i] = Math.max(nums[i], suf[i + 1]);
        }

        // Check for increasing triplet
        for (int i = 1; i < nums.length - 1; i++) {
            if (pre[i - 1] < nums[i] && nums[i] < suf[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        tripletexistinarray obj = new tripletexistinarray();

        boolean result = obj.increasingTriplet(nums);

        System.out.println("Result: " + result);

        sc.close();
    }
}