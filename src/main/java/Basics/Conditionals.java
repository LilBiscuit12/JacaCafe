package Basics;

public class Conditionals {
    public static void main(String[] args) {
        boolean isActive = false;
        if (isActive) {
            System.out.println("The user is active");
        }
        else {
            System.out.println("The user is not active");
        }
        byte age = 17;
        System.out.println(age >= 18 ? "The user is an adult" : "The user is a minor");
    }
}


