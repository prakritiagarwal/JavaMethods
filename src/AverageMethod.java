import java.util.Scanner;
public class AverageMethod {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int firstNum = Integer.valueOf(scanner.nextLine());

    System.out.println("Enter the second number: ");
    int secondNum = Integer.valueOf(scanner.nextLine());

    System.out.println("Enter the third number: ");
    int thirdNum = Integer.valueOf(scanner.nextLine());

    double averageOfNums = averageOfNums(firstNum, secondNum, thirdNum);

    System.out.println("The average of the numbers you have entered is: " + averageOfNums);
    scanner.close();
}

public static double averageOfNums(int num1, int num2, int num3) {
    return Sum(num1, num2, num3) / 3.0;    
}

public static double Sum(int num1, int num2, int num3) {
    return (num1 + num2 + num3); 
}
}