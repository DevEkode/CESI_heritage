package com.cesi;

import java.util.ArrayList;

public class Client {

    private long numero;
    private String nom;
    private ArrayList<Compte> comptes;

    // Constructeur
    public Client(String nom,long numero) {
        this.numero = numero;
        this.nom = nom;
        this.comptes = new ArrayList<>();
    }

    public long getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addCompte(Compte c){
        this.comptes.add(c);
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Client "+ numero + " - " + nom +"\n";

        if(this.comptes.isEmpty()){
            result += " pas de comptes rattaché à ce client";
        }else{
            for(Compte c : this.comptes){
                result += "Compte n°"+c.getNumero()+" - solde : "+c.getSolde()+"\n";
            }
        }

        return result;
    }
}
