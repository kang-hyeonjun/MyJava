package Zoo;

public class Tiger extends Animal implements Ability {

    public Tiger(String name) {
        super(name, "호랑이", "고기");
    }

    @Override
    public void grow(int age) {

        int length = 30 + age * 60;
        int weight = 1 + age * 50;

        System.out.println(age + "살 -> 몸길이:" + length + "cm 몸무게:" + weight + "kg");
    }

    @Override
    public void showAbility(int age) {

        int jump = 1 + age * 2;

        System.out.println("점프 거리: " + jump + "m");
    }
}