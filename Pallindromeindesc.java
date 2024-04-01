import java.util.Scanner;
public class Pallindromeindesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter upper limit");
        int u = sc.nextInt();
        System.out.println("enter lower limit");
        int l = sc.nextInt();

        for (int i = u; i >= l; i--) {
            int n = i;
            int tv = i;
            int rev = 0;
            int r = 0;

            while (n > 0) {
                r = n % 10;
                rev = (rev * 10) + r;
                n /= 10;
            }
            if (rev == tv)
                System.out.println("pallindrome" + " " + i);
        }
    }
}