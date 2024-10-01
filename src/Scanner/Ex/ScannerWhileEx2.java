package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("가격을 입력하세요 (-1 입력 시 프로그램 종료)");
            int price = Scanner.nextInt();
            if(price == -1){
                break;
            }
            System.out.println("수량을 입력하세요");
            int quantity = Scanner.nextInt();
            System.out.println("총합은 "+price*quantity + "입니다");
        }
    }
}
