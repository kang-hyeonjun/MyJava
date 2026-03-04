package ch02_control_statement;

public class If05 {
    static void main() {
        int su = 4;
        if (su%7==0) {

            su*=su;
            System.out.println(su);

        }
    else {
        su+=3;
            System.out.println(su);
        }
    }
}
