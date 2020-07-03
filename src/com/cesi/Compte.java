package com.cesi;

public class Compte {
    private long numero;
    private Client client;
    private float solde= 50;

    /**
     * Constructeur de la classe Compte
     * @param numero numéro du compte
     * @param c Client du compte
     */
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

    /**
     * Effectue un débit du compte si les fonds sont suffisants
     * @param montant montant à débiter du compte
     * @return montant débité (-1 si fond insuffisants)
     */
    public float debit(float montant) {
        float res = this.solde - montant;
        if (res >= 0) {
            this.solde -= montant;
        }else{
            res = -1;
        }
        return res;
    }

    /**
     * Crédite le compte
     * @param montant montant à créditer
     */
    public void credit(float montant){
            this.solde += montant;
    }

    @Override
    public String toString() {
        return "Compte "+this.numero+" - client "+this.client.getNom()+" - Solde : "+this.solde;
    }
}
