package Scanner.Ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("메뉴를 입력하세요 :");
        String foodName = Scanner.nextLine();
        System.out.print("가격을 입력하세요 :");
        int foodPrice = Scanner.nextInt();
        System.out.print("수량을 입력하세요 :");
        int foodQuantity = Scanner.nextInt();
        System.out.println(foodName + "을"+foodQuantity+"개 주문하셨습니다 총 금액은"+foodPrice*foodQuantity+"입니다");

    }
}
