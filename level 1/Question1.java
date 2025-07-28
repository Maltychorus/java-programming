import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Divisible by 5?");
        
        double num = sc.nextDouble();
        
        boolean divisible = (num % 5 == 0);
        
        System.out.print("Is the number "+ num+" divisible by 5 ? "+ divisible);
        sc.close();
    }
}