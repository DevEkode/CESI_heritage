public class Client {
    private long numero;
    private String nom;

    // Getter
    public long getNumero() {
        return numero;
    }
    public String getNumero() {
        return nom;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "Client " + this.numero + " - " + this.nom;
    }
}
