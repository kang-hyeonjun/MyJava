package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        int total = 0;
        int i = 1; //조건식
        while (i <= 10) {
            total += i;
            i++; //증감식
        }
        System.out.println("총합01 : " + total);
        total = 0;
        i = 1;
        while (i <= 100) {
            total += i;
            i += 3; //증감식
        }
        System.out.println("총합02 : " + total);
        // 1 + 4 + 7 ... +100 = 1717
        total = 0;
        // int i = 1 ; //조건식
        i = 97;
        while (i >= 2) {
            total += i;
            i -= 5; //증감식
        }
        System.out.println("총합03 : " + total);
        // 97 + 92 + 87 + . . .+2 = 990
        //1*1 + 6*6 + 11*11 + . . . + 96*96 = 63670
        total = 0;
        // int i = 1 ; //조건식
        i = 96;
        while (i >= 1) {
            total = total + (i * i);
            i -= 5; //증감식
            System.out.println("총합04 : " + total);


        }
    }
}
