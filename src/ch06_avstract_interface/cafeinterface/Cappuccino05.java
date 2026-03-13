package ch06_avstract_interface.cafeinterface;

public class Cappuccino05 extends Beverage05 implements MilkAddable, Foamadd {

    private String milkType;
    private double foamAmount;

    public Cappuccino05(String name, double price, String milkType, double foamAmount) {
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;
    }

    public void addMilk(String milkType) {
        this.milkType = milkType;
        System.out.println("우유가 " + milkType + " 종류의 우유입니다.");
    }

    @Override
    public void drink() {
        System.out.println("우유의 종류가 " + milkType + "인 " + getName() + "을 우아하게 한 모금 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString() + "Cappuccino05{" +
                "milkType='" + milkType + '\'' +
                ", foamAmount=" + foamAmount +
                '}';
    }

    public void changeMilk(String milkType) {
        this.milkType = milkType;
    }

    @Override
    public void addmilk(String milkType) {

    }

    @Override
    public void addfoam(double foamAmount) {
        this.foamAmount += foamAmount ;
        System.out.println("거품이"+foamAmount+"만큼 추가되었습니다");
    }
}