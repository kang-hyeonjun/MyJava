package ch02_control_statement;

public class ForSwitch01 {
    static void main(String[] args) {
        int a = 0 ;
        int b = 0 ;
        for (int i = 0; i < 11; i++) {
            switch (i){
                case 1: case 3: case 5: case 7: case 9:
                    a+=i;
break;
                case 2: case 4: case 6: case 8: case 10:
                    b+=i;
            }


        }

        System.out.println("짝수 값 = "+a+" 홀수 값 = "+b);
    }
}
