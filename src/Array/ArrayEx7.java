package Array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;
        int productCount = 0;
        String[] productsNames = new String[maxProduct];
        int[] productsPrices = new int[maxProduct];
        while (true) {

            System.out.println("1 상품등록 ,2상품조회, 3종료");
            int select = scanner.nextInt();
            scanner.nextLine();
            if (select == 1) {
                if(productCount>=maxProduct) {
                    System.out.println("상품개수를 초과하였습니다");
                    continue;
                }
                System.out.println("상품명을 입력하세요");
                productsNames[productCount] = scanner.next();
                System.out.println("가격을 입력하세요");
                productsPrices[productCount] = scanner.nextInt();
                productCount++;
            } else if (select == 2) {
                if(productCount==0){
                    System.out.println("등록된 상품이없습니다");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println((i + 1) + "번째 상품은" + productsNames[i] + "이고" + (i + 1) + "번째 가격은" + productsPrices[i]);
                }


            } else if (select == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("번호를 다시입력하세요");

            }
        }
    }
}
