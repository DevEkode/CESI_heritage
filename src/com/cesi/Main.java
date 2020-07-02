package com.cesi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Client c1 = new Client("Martin",1);
        // System.out.println(c1);

        //Compte com1 = new Compte(10,c1);
        //Compte com2 = new Compte(20,c1);

        CompteCourant cc = new CompteCourant(5,c1);
        CompteEpargne ce = new CompteEpargne(10,c1,cc,200);

        c1.addCompte(cc);
        c1.addCompte(ce);
        //c1.addCompte(com1);
        //c1.addCompte(com2);

        //credit du compte courant
        cc.credit(500);
        //credit du compte epargne
        ce.credit(10000);

        System.out.println(c1);

        // Tranfert du compte epargne au compte courant
        ce.transfer();
        
        System.out.println(c1);
    }
}
