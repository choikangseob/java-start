package Array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println((i+1) +"번쨰 숫자를 입력하세요 5번째까지 입력하실 수 있습니다");
            num[i] = scanner.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if(i<num.length-1){
                System.out.print(num[i]+",");
            }else {
                System.out.println(num[i]);
            }

        }
    }
}
