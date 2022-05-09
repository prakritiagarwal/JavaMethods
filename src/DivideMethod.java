import java.util.Scanner;
public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int firstNum = Integer.valueOf(scanner.nextLine());

    System.out.println("Enter the second number: ");
    int secondNum = Integer.valueOf(scanner.nextLine());

    divideNumbers(firstNum, secondNum);

    scanner.close();
    }
      

    public static void divideNumbers(int num1, int num2){
        if (num2 == 0) {
            System.out.println("Do not divide the number by 0!");
            return;
        }
        System.out.println(num1 + " / " + num2 + " = " + (num1 * 1.0 / num2));    
    }
    
}
