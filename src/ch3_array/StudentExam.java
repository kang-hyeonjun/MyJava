package ch3_array;

import java.util.Scanner;

public class StudentExam {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scan.nextLine();
        int[] score = new int[3];
        double total=0.00;

        for (int i = 0; i < 3; i++) {
            System.out.print("점수 입력 : ");

            score[i] = scan.nextInt( );
            total += score[i];

        }
        double total_b =0.00;
        total_b = total/3;
        System.out.println("학생의 정보");
        System.out.print("이름 : "+name);
        System.out.print(" 총점 : "+total);
        System.out.printf(" 평균 : %.2f ",total_b);
    }
}
