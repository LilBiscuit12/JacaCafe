package Basics;

public class Strings {
    public static void main(String[] args) {
        String name = "Stefano";
        String surname = new String( "Miccichè");

        if (name.equals("Stefano")){
            System.out.println("The name is Stefano");
        }
        if (name.equalsIgnoreCase("stefano")){
            System.out.println("The name is stefano");
        }

    }
}
