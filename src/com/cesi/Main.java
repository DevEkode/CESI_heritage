package com.cesi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client c1 = new Client("Martin",1);
        System.out.println(c1);

        Compte com1 = new Compte(10,c1);
        Compte com2 = new Compte(20,c1);

        c1.addCompte(com1);
        c1.addCompte(com2);

        System.out.println(c1);
        com1.credit(500);
        System.out.println(c1);
    }
}
