package variable;

public class Var7 {
    public static void main(String[] args) {
        int i=1;


        for(int row =3 ;row>=i;i++  ) {
            String h ="";
            for(int a=0;a<row-i;a++){
                h += " ";

            }
            System.out.print(h);
                for (int n = 1; n <= (2 * i - 1); n++) {
                    System.out.print("*");
                }

            System.out.println();
            }
    }
}
