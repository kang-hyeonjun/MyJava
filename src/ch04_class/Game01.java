package ch04_class;

public class Game01 {




    String name; // 게임 이름
    String price; // 게임 가격
    String wkdfm; //장르
    String roqkftk; //개발사
    String dpswls; //게임 엔진


    String showData(){
        String result = "게임 이름 : "+name + ", 단가 : " + price+  ", 장르 : "+ wkdfm+" 개발사 : "+ roqkftk+" 게임 엔진 : "+dpswls;
        return result ;
    }

    void Display() {
        System.out.println("게임 이름 :  " + name);
        System.out.println("단가 :  " + price);
        System.out.println("장르 :  " + wkdfm);
        System.out.println("개발사 :  " + roqkftk);
        System.out.println("게임 엔진 : " + dpswls);
    }











}

