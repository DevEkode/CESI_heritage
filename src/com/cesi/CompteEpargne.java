package com.cesi;

public class CompteEpargne extends Compte{

    private CompteCourant compteTransfert;
    private float montantTransfert;

    // Construct
    public CompteEpargne(long numero, Client c, CompteCourant compteTransfert, float montantTransfert) {
        super(numero, c);
        this.compteTransfert = compteTransfert;
        this.montantTransfert = montantTransfert;
    }

    // Transfer montant compte épargne au compte courant
    public void transfer(){
        compteTransfert.credit(getMontantTransfert());
        this.debit(getMontantTransfert());
    }

    public CompteCourant getCompteTransfert() {
        return compteTransfert;
    }

    public float getMontantTransfert() {
        return montantTransfert;
    }

    @Override
    public String toString() {
        return "Compte épargne n°"+getNumero()+" - solde : "+ getSolde();
    }
}
