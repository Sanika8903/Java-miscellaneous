package miscellaneous;
import java.util.*;

public class positive_negative {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Positive number");
        }
    }
}
