package ch05_inheritance.mybeverage;

public class InheTest04 {
    static void main() {
        // 승급(업캐스팅) : 닞은 등급의 클래스가 높은 등급의 클래스타입으로 한시적 형태가 바뀌는 동작
        // 전제 조건 : 반드시 상속 관계이어야 합니다.
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 200.0);
        Beverage04 beverage002 = new Espresso04("에스프레소", 4000.0, 20);
        Beverage04 beverage03 = new Latte04("라떼", 4000.0, "아몬드우유");


        //수퍼클래스내 들어 있는 메소드는 상속의 개념에 의하여 접근이 가능합니다.
        beverage01.showInfo();

        Americano04 coffee01 = (Americano04) beverage01; //강등
        coffee01.sipAmericano();

        Espresso04 coffee02 = (Espresso04) beverage002; //강등
        coffee02.drinkEspresso();

        Latte04 coffee03 = (Latte04) beverage03; //강등
        coffee03.enjoyLatte();

        // Beverage04 beverage02 = new Espresso04("name : 에스프레소 ", price:5000.0, shotCount : 2)
        beverage002.showInfo();

        // Espresso04 coffee1=


        //승급 개념과 배열의 사용
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소", 2000.0, 2),
                new Latte04("바나나 라떼", 7000.0, "바나나우유")};


        for (int i = 0; i < beverage.length; i++) {
            System.out.println("------------------------------------------");
            beverage[i].showInfo();
            //instanceof : 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로 생성이 되었는 지를 판단하고자 할 때 사용합니다

            if (beverage[i] instanceof Americano04) { //아메리카노
                Americano04 ameri = (Americano04) beverage[i]; //강등
                ameri.sipAmericano();

            } else if (beverage[i] instanceof Espresso04) { // 에스프레소
                Espresso04 espre = (Espresso04) beverage[i];
                espre.drinkEspresso();
            } else if (beverage[i] instanceof Latte04) { //라떼
                Latte04 lat = (Latte04) beverage[i];
                lat.enjoyLatte();
            } else { //차후 추가될 메뉴

            }

            //객체를 프린트하면 암시적으로 toString() 메소드가 호출이 됩니다
            System.out.println(beverage[i]);
        }

    }
}


