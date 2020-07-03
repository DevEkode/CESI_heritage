package com.cesi;

import java.util.ArrayList;

public class BanqueApp {

    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();

        System.out.println("Banque du Trésor");
        System.out.println("======================");
        System.out.println("Liste initiale des clients:");

        // Ajout de 4 clients dans la collection
        for(int i = 1; i<=4;i++){
            clients.add(new Client("Client"+i,i));
        }

        // On liste les clients de la banque
        for(Client c : clients){
            System.out.println(c);
        }

        // On ajoute les comptes au clients
        for(Client c : clients){
            // On ajoute un compte courant au client
            CompteCourant compteCourant = new CompteCourant(c.getNumero()*1000+1,c);
            c.addCompte(compteCourant);

            // On ajoute un compte épargne au client
            CompteEpargne compteEpargne = new CompteEpargne(c.getNumero()*1000+2,c,compteCourant,50);
            c.addCompte(compteEpargne);

            // On transfert une somme du compte epargen au compte courant (si c'est faisable)
            compteEpargne.transfer();
        }

        // On liste les clients de la banque
        for(Client c : clients){
            System.out.println(c);

        }
    }
}
