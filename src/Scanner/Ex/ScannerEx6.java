package Scanner.Ex;

import java.util.Scanner;

public class ScannerEx6 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int temp;
        System.out.print("num1을 입력하세요");
        int num1 = Scanner.nextInt();
        System.out.println("num2를 입력하세요");
        int num2 = Scanner.nextInt();
        int sum= 0;
        if (num1 > num2) {
            temp = num2;
            num2 = num1 ;
            num1 = temp;
            for(int i = num1 ;i<=num2 ;i++){
                sum += i;
            }
            System.out.println(sum);
        }else{
            for(int i = num1 ;i<=num2 ;i++){
                sum += i;
            }
            System.out.println(sum);
        }

    }
}
