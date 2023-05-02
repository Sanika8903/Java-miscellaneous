package miscellaneous;
import java.util.*;

public class bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of item");
        float a = sc.nextFloat();
        System.out.println("Enter the cost of item");
        float b = sc.nextFloat();
        System.out.println("Enter the cost of item");
        float c = sc.nextFloat();
        float gst_a = (float)(a *0.18) + a;
        float gst_b = (float) (b *0.18) + b;
        float gst_c = (float) (c*0.18) + c;
        int bill = (int)(gst_a + gst_b + gst_c);
        System.out.println("Total bill including GST is : " + bill);
    }
}
