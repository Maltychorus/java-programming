import java.util.Scanner;

public class base_exponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base : ");
        double base = sc.nextDouble();
        
        System.out.print("Enter the exponential : ");
        double exponential = sc.nextDouble();
        
        double result = Math.pow(base,exponential);
        
        System.out.print(base + " ^ " + exponential + " = " + result);
        sc.close();
    }
}
