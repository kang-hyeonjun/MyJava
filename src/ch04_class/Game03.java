package ch04_class;

public class Game03 {
    private String name ;
    private int price  ;
    private String wkdfm ;
    private String roqkf ;
    private String dpswls ;




    public Game03(String name, int price, String wkdfm, String roqkf, String dpswls){
        this.name=name;
        this.price= price;
        this.wkdfm=wkdfm;
        this.dpswls=dpswls;
        this.roqkf=roqkf;

    }

    

    public void display() {
        System.out.println("이름 : " + name);
        System.out.println("가격: " + price);
        System.out.println("장르 : " + wkdfm);
        System.out.println("게임 엔진 : " + dpswls);
        System.out.println("개발 : " + roqkf);
        System.out.println();
    }

}
