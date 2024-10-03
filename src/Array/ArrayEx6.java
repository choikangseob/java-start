package Array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[4][3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+"번째의 국,영,수 점수를 입력하시오");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                sum += array[i][j];
            }
            System.out.println((i+1)+"번쨰 학생의 총합"+sum);

            double avg =(double) sum/3;
            System.out.println((i+1)+"번쨰 학생의 평균"+avg);
            sum=0;
        }
    }
}
