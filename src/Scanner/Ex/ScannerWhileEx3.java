package Scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx3 {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int sum =0;

        while (true) {
            System.out.println("입력하세요 1:상품등록 2:결제 3:프로그램종료");
            int select = scanner.nextInt();


            if (select == 1) {
                while (true) {
                    scanner.nextLine();
                    System.out.print("상품을 등록하세요 X입력시 등록완료");
                    String menu = scanner.next();
                    if (menu.equals("X") || menu.equals("x")) {
                        System.out.println("등록이 완료되었습니다");
                        break;
                    }
                    System.out.print("가격을 등록하세요");
                    int price = scanner.nextInt();
                    System.out.println("수량을 입력하세요");
                    int quantity = scanner.nextInt();

                    sum += price * quantity;



                }
            }
            if (select == 2) {
                System.out.println("결제 액수는" + sum + "원입니다");
                sum = 0;

            }

            if (select == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }
    }
}

