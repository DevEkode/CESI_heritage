package com.cesi;

public class Compte {
    private long numero;
    private Client client;
    private float solde= 50;

    // Constructeur
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

    // Débite le compte Epargne SI les fonds sont suffisants
    public float debit(float montant) {
        float res = this.solde - montant;
        if (res >= 0) {
            this.solde -= montant;
        }else{
            res = -1;
        }
        return res;
    }

    // Crédite le(s) compte(s)
    public void credit(float montant){
            this.solde += montant;
    }

    @Override
    public String toString() {
        return "Compte "+this.numero+" - client "+this.client.getNom()+" - Solde : "+this.solde;
    }
}
