import java.sql.SQLOutput;
import java.util.*;

import static java.util.Arrays.sort;

public class homework{
    public static void main(String[] args) {
        int n = 28;
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                sum += i;


            }


        }
        if(n==sum){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}


