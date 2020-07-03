package com.cesi;

import java.util.ArrayList;

public class Client {

    private long numero;
    private String nom;
    private ArrayList<Compte> comptes;

    /**
     * Constructeur de la classe Client
     * @param nom nom du client
     * @param numero numéro du client
     */
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

    /**
     * Ajoute un compte au client
     * @param c compte à ajouter
     */
    public void addCompte(Compte c){
        this.comptes.add(c);
    }

    /**
     * Récupère les comptes du client
     * @return Liste des comptes
     */
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
