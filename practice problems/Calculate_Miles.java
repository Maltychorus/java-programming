import java.util.Scanner;

public class Calculate_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert kilometers into miles");
        
        System.out.print("Enter the value of kilometers : ");
        double km = sc.nextDouble();
        
        double miles = km*0.621371;
        System.out.print("Miles : " + miles);
        
        sc.close();
    }
}
