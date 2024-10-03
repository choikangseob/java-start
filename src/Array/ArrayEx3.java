package Array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] num =new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<num.length;i++) {
            System.out.println((i+1)+"정수를 입력하세요 5개까지 입력 가능합니다");
            num[i]=scanner.nextInt();
        }
        for(int i =num.length-1; i>=0; i--) {
            System.out.print(num[i]);
            if(i>0){
                System.out.print(",");
            }
        }
    }
}
