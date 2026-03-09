package ch04_class;

import jdk.jfr.Name;

public class GameMain02 {
    static void main() {
        Game02 game = new Game02();

        game.setName("PlateUp!");
        game.setPrice("21,500");
        game.setWkdfm("Cooking, co-op, rogue-lite");
        game.setRoqkftk("It's happening");
        game.setdpslws("Unity");

        System.out.println("게임 정보 출력");
        System.out.println("이름 : "+game.getName());
        System.out.println("가격 : "+game.getPrice());
        System.out.println("장르 : "+game.getWkdfm());
        System.out.println("개발자 : "+game.getRoqkftk());
        System.out.println("게임 엔진 : "+game.getDpswls());

    }
}
