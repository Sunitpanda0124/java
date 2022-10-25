import java.util.Scanner;

public class Sum_of_digits_of_interger {
    public class Expt_8{

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Input an integer: ");
            int digits = in.nextInt();
            System.out.println("The sum is " + sumDigits(digits));
        }
        public static int sumDigits(long n){
            int result = 0;
            while (n > 0) {
                result+=n% 10;
                n /= 10;
            }
            return result;
        }
    }
}
