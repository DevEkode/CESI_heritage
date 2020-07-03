package com.cesi;

public class CompteCourant extends Compte{

    /**
     * Constructeur de la classe CompteCourant
     * @param numero numéro du compte
     * @param c Client du compte
     */
    public CompteCourant(long numero, Client c) {
        super(numero, c);
    }

    @Override
    public String toString() {
        return "CompteCourant n°" + getNumero()+ " - solde : " + getSolde();
    }
}
