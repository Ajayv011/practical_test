import java.util.Scanner;

public class ques4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st sub marks");
    double s1 = sc.nextDouble();
    System.out.println("enter 2nd sub marks");
    double s2 = sc.nextDouble();
    System.out.println("enter 3rd sub marks");
    double s3 = sc.nextDouble();
    System.out.println("enter 4th sub marks");
    double s4 = sc.nextDouble();
    System.out.println("enter 5th sub marks");
    double s5 = sc.nextDouble();
    double total = s1 + s2 + s3 + s4 + s5;
    double avg = total / 5;
    double percentage = total / 500 * 100;
    char grade = 0;
    if (percentage >= 90 && percentage <= 100) {
      System.out.println("a");
      grade = 'a';
    } else if (percentage >= 75 && percentage <= 89) {
      System.out.println("b");
      grade = 'c';
    } else if (percentage >= 60 && percentage <= 74) {
      System.out.println("c");
      grade = 'c';
    } else if (percentage >= 40 && percentage <= 59) {
      System.out.println("d");
      grade = 'd';
    } else if (percentage <= 40) {
      System.out.println("f");
      grade = 'f';

    } else {
      System.out.println("invalid no.");
    }
    switch (grade) {
      case 'a': {
        System.out.println("excellent");
      }
        break;
      case 'b': {
        System.out.println("good");
      }
        break;
      case 'c': {
        System.out.println("average");
      }
        break;
      case 'd': {
        System.out.println("poor");
      }
        break;
      case 'f': {
        System.out.println("fail");
      }
        break;

      default: {
        System.out.println("invalid grade");
      }
    }
    System.out.println("average is " + avg);
    sc.close();
  }
}