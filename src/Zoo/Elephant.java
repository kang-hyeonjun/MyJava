package Zoo;

public class Elephant extends Animal implements Ability {

    public Elephant(String name) {
        super(name, "코끼리", "풀");
    }

    @Override
    public void grow(int age) {

        int height = 90 + age * 40;
        int weight = 100 + age * 500;

        System.out.println(age + "살 -> 키:" + height + "cm 몸무게:" + weight + "kg");
    }

    @Override
    public void showAbility(int age) {

        int trunk = 30 + age * 20;

        System.out.println("코 길이: " + trunk + "cm");
    }
}