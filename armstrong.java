import java.util.Scanner;


public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int tv=n;
        int temp = 0;
        int count = 0;
        while(n>0)
        {
            count++;
            n/=10;
        }
        n = tv;
        while(n>0)
        {
            int r = n%10;
            temp = (int) (temp + Math.pow(r,count));
            n /=10;
        }
        if(tv==temp)
            System.out.println("Armstrong");
        else
            System.out.println("not armstrong");

    }
}
