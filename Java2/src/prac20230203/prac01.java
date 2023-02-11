package prac20230203;

public class prac01 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 40, 50, 60};

        int targetNum = 40;
        int start = 0;
        int end = nums.length - 1;
        int middle = 0;

        while (start <= end) {
            middle = (start + end) / 2;
            if (nums[middle] > targetNum) {
                end = middle - 1;
            } else if (nums[middle] < targetNum) {
                start = middle + 1;
            } else {
                break;
            }
        }
        System.out.println("数字在数组的第" + (middle+1) + "位");
    }

}

