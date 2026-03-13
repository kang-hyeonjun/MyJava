package ch06_avstract_interface.cafeinterface;

public class InheTest05 {
    static void main(String[] args) {
        // Beverage05.STORE_NAME="하하하";
        System.out.println("어서오세요~~"+Beverage05.STORE_NAME+"입니다.");


        // 부모 타입을 사용한 배열 생성
        Beverage05[] orderList = {
                new Americano05("아메리카노", 10000.0, 200.0),
                new Espresso05("에스프레소", 3000.0, 2),
                new Latte05("카페라떼", 4500.0, "바나나 우유"),
                new Cappuccino05("카푸치노",5000,"우유",50),
                new SpecialCoffee05("스폐셜커피",6000.0,150,2,"우유")
        };

        System.out.println("주문 잔수 : " + Beverage05.getBevergeCount());

        System.out.println("향상 for를 사용한 출력");
        for (Beverage05 item : orderList) {
            System.out.println("----------------------------------");
            System.out.println(item);

            if (item instanceof Americano05) {
                ((Americano05) item).adjustwater(20);
            } else if (item instanceof Espresso05) {
                ((Espresso05) item).addShot(1);
            } else if (item instanceof Latte05) {
                ((Latte05) item).changeMilk("바나나 우유");
            }else if (item instanceof SpecialCoffee05) {
                ((SpecialCoffee05) item).addshot(1);
                ((SpecialCoffee05) item).addmilk("아몬드 우유");
                ((SpecialCoffee05) item).adjustwater(50);
            }else if (item instanceof Cappuccino05){
                ((Cappuccino05)item).changeMilk("서울우유");
                ((Cappuccino05)item).addfoam(10);

                item.drink();
                System.out.println();
            }
        }
    }
}