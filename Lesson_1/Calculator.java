public class Calculator {
    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        char sign = '+';

        if(sign == '+') {
            System.out.println(a + b);
        } else if(sign == '-') {
            System.out.println(a - b);
        } else if(sign == '*') {
            System.out.println(a * b);
        } else if(sign == '/') {
            System.out.println(a / b);
        } else if(sign == '%') {
            System.out.println(a % b);
        } else if(sign == '^') {
            int degree = 3;
            double result = a;
            for(int i = 2; i <= degree; i++) {
                result *= a;
        }
        System.out.println(result);
      }
    }
}
