import java.util.Scanner;

public class Practice_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter firt number : ");
        int number_1 = sc.nextInt();
        
        System.out.print("Enter Second number : ");
        int number_2 = sc.nextInt();
        
        int Sum = number_1 + number_2;
        System.out.print("Sum of two numbers : "+ Sum);
        
        sc.close();

        /*Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter degree celsius : ");
        double Celsius = sc.nextDouble();

        double Fahrenheit = (Celsius*(9.0/5))+32;
        System.out.print("Degree fahrenheit : " + Fahrenheit);
        sc.close();*/

        /*Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of radius : ");
        double radius = sc.nextDouble();
        
        double Area_of_Circle = 3.14 * radius * radius;
        System.out.print("Area of the Circle : " + Area_of_Circle);*/

        /*Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Radius of the Cylinder : ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter the Height of the Cylinder : ");
        double height = sc.nextDouble();
        
        double Volume = Math.PI * radius * radius * height;
        System.out.print("Volume of the Cylinder : " + Volume);
        
        sc.close();*/

        /*Scanner sc = new Scanner(System.in);
        
        System.out.println("Find the Simple Interest");
        
        System.out.print("Enter the Principal amount : ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the interest Rate : ");
        double rate = sc.nextDouble();
        
        System.out.print("Time (years) : ");
        double time = sc.nextDouble();
        
        double SI = (principal*rate*time)/100;
        System.out.print("Simple Interest : " + SI);

        sc.close();*/

        /*Scanner sc = new Scanner(System.in);
        
        System.out.println("Perimeter of rectangle");
        
        System.out.print("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        
        System.out.print("Enter the height of the rectangle : ");
        double height = sc.nextDouble();
        
        double Perimeter = 2 * (length + height);
        System.out.print("Perimeter of the rectangle : " + Perimeter);
        
        sc.close();*/

        /*Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base : ");
        double base = sc.nextDouble();
        
        System.out.print("Enter the exponential : ");
        double exponential = sc.nextDouble();
        
        double result = Math.pow(base,exponential);
        
        System.out.print(base + " ^ " + exponential + " = " + result);
        sc.close();*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Average of 3 numbers");
        
        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter the second number : ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter the third number : ");
        double num3 = sc.nextDouble();
        
        double average = (num1 + num2 + num3)/3;
        System.out.print("Average of 3 numbers : " + average);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Convert kilometers into miles");
        
        System.out.print("Enter the value of kilometers : ");
        double km = sc.nextDouble();
        
        double miles = km*0.621371;
        System.out.print("Miles : " + miles);
        
        sc.close();*/
    }
}
