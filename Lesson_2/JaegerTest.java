public class JaegerTest {
    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.3f);
        chernoAlpha.setWeight(2.4f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);

        Jaeger coyoteTango = new Jaeger();
        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setMark(chernoAlpha.getMark());
        coyoteTango.setOrigin("Japan");
        coyoteTango.setHeight(chernoAlpha.getHeight());
        coyoteTango.setWeight(2.3f);
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);
        chernoAlpha.move();
        System.out.println(chernoAlpha.getMark());
        System.out.println(coyoteTango.getHeight());
    }
}
