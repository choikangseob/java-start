package Scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        int num1 = Scanner.nextInt();
        int num2 = Scanner.nextInt();
        int sum;
            while(true){
                System.out.print("num1 ="+num1);
                num1 = Scanner.nextInt();
                System.out.print("num2 ="+num2);
                num2 = Scanner.nextInt();
                sum = num1 + num2;
                System.out.println("num1 +num2 ="+sum);
                if(num1 == 0 && num2 == 0){
                    break;
                }
            }
    }
}
