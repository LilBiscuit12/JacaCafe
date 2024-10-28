package Basics;

public class Loops {
    public static void main(String[] args) {
        for (int i = 5; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        int i = 5;
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
    }
}
