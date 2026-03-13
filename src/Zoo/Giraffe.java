package Zoo;

public class Giraffe extends Animal implements Ability {

    public Giraffe(String name) {
        super(name, "기린", "나뭇잎");
    }

    @Override
    public void grow(int age) {

        int height = 180 + age * 70;
        int weight = 60 + age * 200;

        System.out.println(age + "살 -> 키:" + height + "cm 몸무게:" + weight + "kg");
    }

    @Override
    public void showAbility(int age) {

        int neck = 80 + age * 30;

        System.out.println("목 길이: " + neck + "cm");
    }
}
