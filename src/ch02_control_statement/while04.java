package ch02_control_statement;

import java.util.Scanner;

public class while04 {
    static void main() {
        int total = 0 ; //총점
        double average = 0.0; //평균
        int counter = 0 ; //카운터변수

        Scanner scan = new Scanner(System.in) ;

        while (true){
            System.out.println("점수를 입력해 주세요.");
            int jumsu = 0 ;

            if (jumsu < 0){
                System.out.println("음수임으로 종료합니다.");
                break;
            }
            counter++;
            total += jumsu ;
        }
        System.out.println("총합 : " + total);
    }

}
