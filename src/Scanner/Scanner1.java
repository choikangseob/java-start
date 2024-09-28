package Scanner;

import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {

        Scanner Scanner =new Scanner(System.in);
        System.out.print("num1 : ");
        int num1 = Scanner.nextInt();
        System.out.print("num2 : ");
        int num2 = Scanner.nextInt();

        if (num1 > num2) {
            System.out.println("둘 중 더 큰수는 "+num1+"입니다");
        }else if (num2 > num1) {
            System.out.println("둘 중 더 큰수는 "+num2+"입니다");
        }else{
            System.out.println("두 숫자는 같습니다");
        }
    }
}
