package com.cesi;

public class CompteEpargne extends Compte{

    private CompteCourant compteTransfert;
    private float montantTransfert;

    // Constructeur
    public CompteEpargne(long numero, Client c, CompteCourant compteTransfert, float montantTransfert) {
        super(numero, c);
        this.compteTransfert = compteTransfert;
        this.montantTransfert = montantTransfert;
    }

    // Transfère d'un montant du compte épargne vers le  compte courant
    public void transfer(){

        // Vérification si les fonds sont suffisants
        if (this.debit(getMontantTransfert()) > -1) {
            compteTransfert.credit(getMontantTransfert());
            System.out.println("Transfert effectué");
        }else{
            System.err.println("Transfert impossible");
        }
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
