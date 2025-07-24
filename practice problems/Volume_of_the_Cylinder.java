import java.util.Scanner;

public class Volume_of_the_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Radius of the Cylinder : ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter the Height of the Cylinder : ");
        double height = sc.nextDouble();
        
        double Volume = Math.PI * radius * radius * height;
        System.out.print("Volume of the Cylinder : " + Volume);
        
        sc.close();
    }
}
