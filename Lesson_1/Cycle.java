public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int counter = 1;
        int result = 8;
        while(counter <= 7) {
            result -= 2;
            System.out.println(result);
            counter++;
        }

        int counter2 = 10;
        int result2 = 0;
        do {
            if(counter2 % 2 != 0) {
                result2 += counter2;
                counter2++;
            }
            counter2++;
        } while(counter2 <= 20);
        System.out.println("Сумма не четных чисел равна: " + result2);
    }
}
