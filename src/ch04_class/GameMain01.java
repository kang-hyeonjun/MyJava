package ch04_class;

public class GameMain01 {
    static void main() {
// 클래스이름 객체이름 = new 생성자이름() ;
        Game01 game = new Game01(); // 게임

        game.name = "Stardew Valley" ;
        game.price = "16,000";
        game.wkdfm = "Indie game, role-playing game, life simulation,";
        game.roqkftk = "ConcernedApe";
        game.dpswls = "Monogame";

        System.out.println("게임 정보 출력");
        System.out.println("이름 : "+game.name);
        System.out.println("가격 : "+game.price );
        System.out.println("장르 : " +game.wkdfm);
        System.out.println("개발사 : " +game.roqkftk);
        System.out.println("게임 엔진 : " +game.dpswls);
    }
}
