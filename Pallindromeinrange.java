import java.util.Scanner;
public class Pallindromeinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lower limit");
        int l = sc.nextInt();
        System.out.println("enter upper limit");
        int u = sc.nextInt();

        for(int i = l;i <= u;i++){
            int n = i;
            int tv = i;
            int rev = 0;
            int r = 0;

            while(n > 0){
                r = n % 10;
                rev = (rev*10) + r;
                n /=10;
            }
            if(rev==tv)
                System.out.println("pallindrome"+" "+ i);
        }

    }
}
