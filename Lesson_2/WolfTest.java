public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex("man");
        wolfOne.setAge(5);
        wolfOne.setCoat("gray");
        System.out.println(wolfOne.getSex());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getCoat());
    }
}
