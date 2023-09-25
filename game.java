//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 101.0);
        System.out.println("Guess the number between 1 and 100");
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        int s;
        for(s = 0; v != randomNum; ++s) {
            System.out.println("Wrong number please try again");
            if (randomNum > v) {
                System.out.println("The number is greater");
            } else {
                System.out.println("The number is smaller");
            }

            v = sc.nextInt();
        }

        System.out.println("Yes!THats the right answer");
        System.out.println("number of tries : " + s);
    }
}
