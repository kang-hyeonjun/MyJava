package ch04_class;

public class Game02  { //단계 1 클레그 정의
    private String name; // 게임 이름
    private String price; // 게임 가격
    private String wkdfm; //장르
    private String roqkftk; //개발사
    private String dpswls; //게임 엔진


    public void setName(String _name){
        name = _name ;
    }

    public String getName() {
        return name;
    }
    public void setPrice(String _price){
        price = _price ;
    }

    public String getPrice() {
        return price;
    }
    public void setWkdfm(String _wkdfm){
        wkdfm = _wkdfm;
    }

    public String getWkdfm() {
        return wkdfm;
    }

    public void setRoqkftk(String _roqkftk){
        roqkftk = _roqkftk ;
    }

    public String getRoqkftk() {
        return roqkftk;
    }

    public void setdpslws(String _dpswls){
        dpswls = _dpswls ;
    }

    public String getDpswls() {
        return dpswls;
    }


}
