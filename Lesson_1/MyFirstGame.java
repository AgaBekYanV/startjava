public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 15;
        int playerNumber = 6;
        if(computerNumber > playerNumber) {
            do {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                playerNumber++;
            } while(computerNumber != playerNumber);
        } else if(computerNumber < playerNumber) {
            do {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                playerNumber--;
            } while(computerNumber != playerNumber);
        }
        System.out.println("Вы угадали!");
    }
}
