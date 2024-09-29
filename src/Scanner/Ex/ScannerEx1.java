package Scanner.Ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        String name = Scanner.nextLine();
        System.out.println("이름을 입력하세요: "+name);
        int age = Scanner.nextInt();
        System.out.println("나이를 입력하세요 :"+age);

        System.out.println("이름은"+name +"나이는"+age+"입니다");
        
    }
}
