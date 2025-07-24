import java.util.Scanner;
public class Add_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number_1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int number_2 = sc.nextInt();
        
        int sum = number_1 + number_2;
        System.out.println("Sum of two numbers: " + sum);
        
        sc.close();
    }
    
}
