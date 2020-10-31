public class Calculator {
    public double calculate(double a, char sign, double b) {
        double result = 0;
        switch(sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                result = a;
                for(int i = 2; i <= b; i++) {
                    result *= a;
                }
                break;
        }
        return result;
    }
}
