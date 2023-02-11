package prac20230206;

import java.util.Arrays;
import java.util.List;

public class Util {
    public static void main(String[] args) {
        int[] is = {3,5,2,1,4};
        int[] is1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(is));
        System.out.println(is);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        Arrays.sort(is);
        System.out.println(Arrays.toString(is));//1,2,3,4,5

        System.out.println(Arrays.binarySearch(is, 5));

        System.out.println(Arrays.equals(is, is1));
    }
}
