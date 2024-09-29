package Scanner;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("숫자의 합을 더해주는 프로그램입니다 0입력시 그전까지의 합을 구하고 종료");
            int number = Scanner.nextInt();
            sum +=number;

            if(number == 0){
                break;
            }
        }
        System.out.println("입력한 숫자의 합"+sum);
    }
}
