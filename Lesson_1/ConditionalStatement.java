public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if(age > 20) {
            System.out.println("Ваш возраст больше 20 и равен: " + age);
        }

        String sex = "man";
        if(sex == "man") {
            System.out.println("Ваш пол мужской");
        } else if(sex != "man") {
            System.out.println("Ваш пол женский");
        }

        double height = 1.71;
        if(height < 1.80) {
            System.out.println("Ваш рост меньше 1.80 и равняется: " + height);
        } else {
            System.out.println("Ваш рост больше 1.80 и равняется: " + height);
        }

        String nameFirstLetter = "С";
        if(nameFirstLetter == "М") {
            System.out.println("Ваше имя начинается с М");
        } else if (nameFirstLetter == "И") {
            System.out.println("Ваше имя начинается с И");
        } else {
            System.out.println("Ваше имя начинается с другой буквы");
        }
    }
}
