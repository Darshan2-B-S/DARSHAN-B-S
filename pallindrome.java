import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int tv = n;
        int r = 0;
        int temp = 0;
        while(n>0){
            r = n %10;
            temp = (temp*10) + r;
            n/=10;
        }
        if(temp == tv)
            System.out.println("pallindrome");
        else
            System.out.println("not pallindrome");

    }
}
