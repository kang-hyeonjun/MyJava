package ch02_control_statement;

public class If06 {
    static void main() {
        int month = 1 ;


        if (month >=3 && month <=5){
            System.out.println("봄");
        }else if (month >=6 && month <=8){
            System.out.println("여름");
        }else if (month >=9 && month <=11){
            System.out.println("가을");
        // }else if (month ==12 ||month ==1 ||month ==2){
        }else if (month ==12 ||month >=1 &&month <=2){
            System.out.println("겨울");
        }else{
            System.out.println("올바른 형식이 아닙니다");
        }


    }
}
