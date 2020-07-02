package com.cesi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client client1 = new Client(1,"Martin");
        Client client2 = new Client(2,"Dupont");

        System.out.println(client1);
        System.out.println(client2);

        client2.setNom("Pichon");
        System.out.println(client2);
    }
}
