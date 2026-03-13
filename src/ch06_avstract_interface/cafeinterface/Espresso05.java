package ch06_avstract_interface.cafeinterface;

import ch06_avstract_interface.cafeinterface.Beverage05;
import ch06_avstract_interface.cafeinterface.ShotAddable;

    public class Espresso05 extends Beverage05 implements ShotAddable {
    private int shotCount;

    public void addShot(int count) {
        this.shotCount += count;
        System.out.println("샷이 " + count + "개 추가되었습니다.");
    }

    public Espresso05(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    public void drink() {
        System.out.println("샷 개수"+ shotCount + "인 " + super.getName() + "을 진하게 한 모금 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspresso05{" +
                "shotCount=" + shotCount +
                '}';
    }

        @Override
        public void addshot(int count) {

        }
    }