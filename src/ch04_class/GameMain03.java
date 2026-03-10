package ch04_class;

public class GameMain03 {
    static void main() {
      

        Game03 a = new Game03("Stardew Valley",16000,"Indie_game,role-playing game, life simulation","ConcernedApe","Monogame");
        a.display();

        Game03 b = new Game03("PlateUp!",21500,"Cooking, co-op, rogue-lite","It's happening","Unity");
        b.display();

        Game03 c = new Game03("HADES",27000,"Roguelike","Supergiant Games","Proprietary Engine");
        c.display();

        int game = 3;
        System.out.println("게임 " + game + "개를 배열로 다뤄봅시다.");

        int[] arr = new int[3] ;


        Game03[] gamelist = new Game03[game];

       gamelist[0] = new Game03("Stardew Valley",16000,"Indie_game,role-playing game, life simulation","ConcernedApe","Monogame");
        gamelist[1] = new Game03("PlateUp!",21500,"Cooking, co-op, rogue-lite","It's happening","Unity");
        gamelist[2] = new Game03("HADES",27000,"Roguelike","Supergiant Games","Proprietary Engine");
        for (int i = 0; i < gamelist.length; i++) {
            System.out.println((i+1)+"번째 게임 정보");
            gamelist[i].display();;

        }


        }


    }

