package Scanner.Ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요 :");
        int num = Scanner.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num+"은 짝수입니다");
        }else{
            System.out.println(num+"은 홀수입니다");
        }
    }
}
