package com.cesi;

public class Client {

    private long numero;
    private String nom;

    public Client(long numero, String nom) {
        this.numero = numero;
        this.nom = nom;
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

    @Override
    public String toString() {
        return "Client "+ numero + " - " + nom ;
    }
}
