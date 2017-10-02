import java.util.Scanner;

public class a2017102 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            char ch = scn.next().charAt(0);
            System.out.println((int) ch);
            int v2 = ch - 'A';
            System.out.println(v2);
            if(v2 >= 0 && v2 < 26) {
                System.out.println("大寫");
            }else{
                System.out.println("小寫");
            }





        }
}
