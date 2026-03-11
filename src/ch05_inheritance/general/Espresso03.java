package ch05_inheritance.general;

public class Espresso03 extends Beverage03 {
    private int shotCound; // 샷 추가 갯수

    public Espresso03(String name, double price, int shotCound) {
        super(name,price);
        this.shotCound = shotCound;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("샷 추가 갯수 : " + shotCound + "개");
    }
}