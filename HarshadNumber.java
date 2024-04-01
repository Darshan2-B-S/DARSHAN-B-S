import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int r = 0;
        int sum = 0;
        int tv = n;
        while(n>0){
            r = n % 10;
            sum = sum + r;
            n = n/10;
        }
        if(tv%sum==0)
        {
            System.out.println("it is a Harshad number");

        }
        else {
            System.out.println("it is not a Harshad number");
        }

    }
}
