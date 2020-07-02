package com.cesi;

public class CompteCourant extends Compte{

    public CompteCourant(long numero, Client c) {
        super(numero, c);
    }

    @Override
    public String toString() {
        return "CompteCourant n°" + getNumero()+ " - solde : " + getSolde();
    }
}
