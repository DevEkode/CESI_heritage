package com.cesi;

public class Main {

    public static void main(String[] args) {
        Client c1 = new Client("Martin",1);
        Client c2 = new Client("Dupond",2);

        Compte com1 = new Compte(10,c1);
        Compte com2 = new Compte(20,c2);
        System.out.println(com1);
        System.out.println(com2);
    }
}
