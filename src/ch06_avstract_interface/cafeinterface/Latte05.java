package ch06_avstract_interface.cafeinterface;

public class Latte05 extends Beverage05 implements MilkAddable {

    private String milkType;

    public Latte05(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }


    public void addMilk(String milkType) {
        this.milkType = milkType;
        System.out.println("우유가 " + milkType + " 종류의 우유입니다.");
    }

    @Override
    public void drink() {
        System.out.println("우유의 종류가 " + milkType + "인 " + getName() + "을 맛있게 한 모금 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nLatte05{" +
                "milkType='" + milkType + '\'' +
                '}';
    }

    public void changeMilk(String milkType) {
        this.milkType = milkType;
    }

    @Override
    public void addmilk(String milkType) {

    }
}