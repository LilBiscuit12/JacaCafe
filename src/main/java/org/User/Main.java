package org.User;

public class Main {
    public static void main(String[] args){

        class User {
            private String name;
            private String surname;

            public User(String name, String surname) {
                String[] nombresCompletos = {"Juan Pérez", "María García", "Pedro López"};

                for (String nombreCompleto : nombresCompletos) {
                    System.out.println(nombreCompleto);
                }
            }
        }
    }
}