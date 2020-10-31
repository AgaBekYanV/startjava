import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random randomNumber = new Random();
    private int guessNumber = randomNumber.nextInt(100);;
    private Player player1;
    private Player player2;
    private String playerName;
    String answer = "yes";
    Scanner input = new Scanner(System.in);

    public GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private String passingName() {
        return playerName;
    }

    private boolean checkOut(int number) {
        if(number < guessNumber) {
            System.out.println("Загаданное число больше предложенного игроком: " + passingName());
            return false;
        } else if (number > guessNumber) {
            System.out.println("Загаданное число меньше предложенного игроком: " + passingName());
            return false;
        }
        System.out.println("Игрок " + passingName() + " победил");
        return true;
    }

    public void startGame(){
        while(!answer.equals("no")){
            if (answer.equals("yes")){
                System.out.print("Игрок, " + player1.getName() + " укажите свое число: ");
                int number1 = input.nextInt();
                int num1 = player1.setNumber(number1);
                playerName = player1.getName();
                boolean digit1 = checkOut(num1);
                if(digit1) {
                    break;
                }
                System.out.print("Игрок, " + player2.getName() + " Укажите свое число: ");
                int number2 = input.nextInt();
                int num2 = player2.setNumber(number2);
                playerName = player2.getName();
                boolean digit2 = checkOut(num2);
                if(digit2) {
                    break;
                }
                System.out.println("Хотите продолжить? [yes/no]: ");
                answer = input.nextLine().trim().replaceAll("[^\\w ]", "");
            }
            answer = input.nextLine().replaceAll(" ", "");
            if ( answer.equals("no") || answer.equals("yes") ) {
                continue;
            } else {
                System.out.println("Хотите продолжить? [yes/no]: ");
            }
        }
    }
}
