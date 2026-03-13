package Zoo;

public class Rabbit extends Animal implements Ability {

    public Rabbit(String name) {
        super(name, "토끼", "당근");
    }

    @Override
    public void grow(int age) {

        int height = 10 + age * 6;
        int weight = 1 + age;

        System.out.println(age + "살 -> 키:" + height + "cm 몸무게:" + weight + "kg");
    }

    @Override
    public void showAbility(int age) {

        int jump = 5 + age * 15;

        System.out.println("점프 높이: " + jump + "cm");
    }
}
