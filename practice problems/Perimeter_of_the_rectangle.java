import java.util.Scanner;

public class Perimeter_of_the_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Perimeter of rectangle");
        
        System.out.print("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        
        System.out.print("Enter the height of the rectangle : ");
        double height = sc.nextDouble();
        
        double Perimeter = 2 * (length + height);
        System.out.print("Perimeter of the rectangle : " + Perimeter);
        
        sc.close();
    }
}
