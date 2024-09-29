package Scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        Scanner Scanner =new Scanner(System.in);




        while(true){
            String str = Scanner.nextLine();
            System.out.println("str : "+ str);



             if (str.equals("exit")){
                 break;
             }
        }
    }
    }
