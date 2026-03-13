package Zoo;

import java.util.Scanner;

public class ZooMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Animal[] animals = new Animal[5];

        animals[0] = new Elephant("코코");
        animals[1] = new Giraffe("기기");
        animals[2] = new Rabbit("토토");
        animals[3] = new Tiger("호호");
        animals[4] = new Penguin("펭펭");

        while(true) {

            System.out.println("===== 동물원 시스템 =====");
            System.out.println("1. 동물 정보 보기");
            System.out.println("2. 성장 일지 보기");
            System.out.println("3. 능력 보기");
            System.out.println("4. 종료");

            int menu = sc.nextInt();

            if(menu == 1) {

                for(Animal a : animals) {
                    a.showInfo();
                    System.out.println();
                }

            }

            else if(menu == 2) {

                for(Animal a : animals) {

                    System.out.println("[" + a.name + " 성장]");

                    for(int age = 0; age <= 5; age++) {
                        a.grow(age);
                    }

                    System.out.println();
                }

            }

            else if(menu == 3) {

                for(Animal a : animals) {

                    Ability ab = (Ability)a;

                    System.out.println("[" + a.name + " 능력]");

                    for(int age = 0; age <= 5; age++) {
                        ab.showAbility(age);
                    }

                    System.out.println();
                }

            }

            else if(menu == 4) {

                System.out.println("프로그램 종료");
                break;

            }

        }

        System.out.println("총 동물 수: " + Animal.animalCount);
    }
}