import java.util.Scanner;

class Calculators {
  int a, b;

  // Constructor
  Calculators(int x, int y) {
    a = x;
    b = y;
  }

  // Methods
  int add() {
    return a + b;
  }

  int subtract() {
    return a - b;
  }

  int multiply() {
    return a * b;
  }

  double divide() {
    if (b == 0) {
      System.out.println("Error: Division by zero not allowed");
      return 0;
    }
    return (double) a / b;
  }
}

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // User Input
    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.print("Enter operator (+, -, *, /): ");
    char op = sc.next().charAt(0);

    // Object creation using constructor
    Calculators calc = new Calculators(num1, num2);

    // Switch case
    switch (op) {
      case '+':
        System.out.println("Addition: " + calc.add());
        break;

      case '-':
        System.out.println("Subtraction: " + calc.subtract());
        break;

      case '*':
        System.out.println("Multiplication: " + calc.multiply());
        break;

      case '/':
        System.out.println("Division: " + calc.divide());
        break;

      default:
        System.out.println("Invalid Operator");
    }

    sc.close();
  }
}