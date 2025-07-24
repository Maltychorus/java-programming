import java.util.Scanner;
public class Area_of_the_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of radius : ");
        double radius = sc.nextDouble();
        
        double Area_of_Circle = 3.14 * radius * radius;
        System.out.print("Area of the Circle : " + Area_of_Circle);
        
        sc.close();
    }
}
