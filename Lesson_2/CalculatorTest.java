import java.util.Scanner;



public class CalculatorTest {
    String answer;

    public static void main(String[] args) {
        Calculator operationOne = new Calculator();
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите знак математической операции: ");
        char sign = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.println(operationOne.calculate(a, sign, b));
        playAgain();
    }

    public static void playAgain() {
        System.out.println("Хотите продолжить? [да/нет]: ");
        CalculatorTest ctOne = new CalculatorTest();
        Scanner scan = new Scanner(System.in);
        ctOne.answer = scan.nextLine();
        CalculatorTest ctTwo = new CalculatorTest();
        ctTwo.answer = "да";
        CalculatorTest ctThree = new CalculatorTest();
        ctThree.answer = "нет";

        if(ctOne.equals(ctTwo)) {
            System.out.println("Введите первое число: ");
            double a1 = scan.nextDouble();
            System.out.println("Введите знак математической операции: ");
            char sign1 = scan.next().charAt(0);
            System.out.println("Введите второе число: ");
            double b1 = scan.nextDouble();
            Calculator cAgainOne = new Calculator();
            System.out.println(cAgainOne.calculate(a1, sign1, b1));
            playAgain();
        } else if(ctOne.equals(ctThree)) {
            System.out.println("Game over! Спасибо за игру");
        } else {
            playAgain();
        }
    }

     public boolean equals(Object obj) {
         if(obj instanceof CalculatorTest) {
             CalculatorTest ct2 = (CalculatorTest) obj;
             return answer.equals(ct2.answer);
         } else {
             return false;
         }
    }
}
