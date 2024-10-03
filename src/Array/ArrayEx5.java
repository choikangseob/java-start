package Array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] nums = new int[a];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }
        double avg = (double)sum / a;
        System.out.println(sum);
        System.out.println(avg);

    }
}
