import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] argv){

        Scanner input = new Scanner(System.in);
        System.out.print("Игрок № 1, введите имя: ");
        String name1 = input.nextLine();
        Player player1 = new Player(name1);

        System.out.print("Игрок № 2, введите имя: ");
        String name2 = input.nextLine();
        Player player2 = new Player(name2);

        GuessNumber play = new GuessNumber(player1, player2);
        play.startGame();
    }
}
