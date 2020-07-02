package com.cesi;

public class Compte {
    private long numero;
    private Client client;
    private float solde;

    public Compte(long numero, Client c){
        this.numero = numero;
        this.client = c;
    }

    public long getNumero() {
        return numero;
    }

    public Client getClient() {
        return client;
    }

    public float getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte "+this.numero+" - client "+this.client.getNom()+" - Solde : "+this.solde;
    }
}
