public class Wolf {
    private String sex;
    private String name;
    private int weight;
    private int age;
    private String coat;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public void go() {
        System.out.println("Волк сделал 5 шагов");
    }

    public boolean sit() {
        System.out.println("Волк сидит");
        return true;
    }

    public void run() {
        System.out.println("Волк пробежал 50 метров");
    }

    public void howl() {
        System.out.println("Волк воет на луну");
    }

    public void hunt() {
        System.out.println("Волк охотиться на добычу");
    }
}
