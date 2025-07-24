import java.util.Scanner;
public class Calculate_degree_fahrenhiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter degree celsius : ");
        double Celsius = sc.nextDouble();
        
        double Fahrenheit = (Celsius*(9.0/5))+32;
        System.out.print("Degree fahrenheit : " + Fahrenheit);

        sc.close();
    }
}
