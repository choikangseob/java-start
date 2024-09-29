package Scanner.Ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("출력할 단수를 입력하세요");
        int num = Scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(num + " X  "+ i + " = " + (num * i));
        }

    }
}
