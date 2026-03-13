package Zoo;

public abstract class Animal {

    String name;
    String type;
    String food;

    static int animalCount = 0;

    public Animal(String name, String type, String food) {
        this.name = name;
        this.type = type;
        this.food = food;
        animalCount++;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("종류: " + type);
        System.out.println("먹이: " + food);
    }

    public abstract void grow(int age);
}