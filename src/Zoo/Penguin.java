package Zoo;

public class Penguin extends Animal implements Ability {

    public Penguin(String name) {
        super(name, "펭귄", "물고기");
    }

    @Override
    public void grow(int age) {

        int height = 20 + age * 15;
        int weight = 1 + age * 7;

        System.out.println(age + "살 -> 키:" + height + "cm 몸무게:" + weight + "kg");
    }

    @Override
    public void showAbility(int age) {

        int swim = 3 + age * 3;

        System.out.println("수영 속도: " + swim + "km/h");
    }
}
