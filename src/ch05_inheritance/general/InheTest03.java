package ch05_inheritance.general;

public class InheTest03 {
    static void main() {
        Americano03 americano03 = new Americano03("아메리카노", 4000.0, 200.0);
        Espresso03 espresso03 = new Espresso03("에스프레소",5000.0, 2);
        Latte03 latte03 = new Latte03("라떼",6000.0,"아몬드 우유");

        americano03.printInfo();
        espresso03.printInfo();
        latte03.printInfo();


    }
    }

