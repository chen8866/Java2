package prac20230202;

public class prac02 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 5, 2};

        for (int j = 0; j < nums.length; j++) {
            int maxIndex = 0;
            for (int i = 0; i < nums.length - j; i++) {
                if (nums[maxIndex] < nums[i]) {
                    maxIndex = i;
                }
            }
            int tempNum = nums[nums.length - 1 - j];
            nums[nums.length - 1 - j] = nums[maxIndex];
            nums[maxIndex] = tempNum;

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }
}
