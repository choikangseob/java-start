package Scanner.Ex;

import java.util.Scanner;

public class ScannerEx7 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        while(true) {
            System.out.println("이름을 입력하세요 (종료를 입력시 종료)");
            String name = Scanner.nextLine();
            if(name.equals("종료")){
                break;
            }
            System.out.println("나이를 입력하세요 : ");
            int age = Scanner.nextInt();
            System.out.println("이름은" + name + "나이는" + age + "입니다");


        }
        }
}
