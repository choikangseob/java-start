package Array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scanner=new Scanner(System.in);
        int total=0;
        for (int i = 0; i < num.length; i++) {
            System.out.println((i+1)+"정수를 입력하세요 5개까지 입력 가능합니다");
            num[i]=scanner.nextInt();
        }
        for (int number : num){
            total+=number;
        }
        double average= (double)total/5;
        System.out.println("숫자들의 총합은"+total);
        System.out.println("평균은"+average);
    }
}
