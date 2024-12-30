
public class Compte {
    private int  numeroCompte;
    private double soldeInitiat;
    private Client proprietaire;

    public int getNumeroCompte() {
        return numeroCompte;
    }
    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
    public double getSoldeInitiat() {
        return soldeInitiat;
    }
    public void setSoldeInitiat(double soldeInitiat) {
        this.soldeInitiat = soldeInitiat;
    }
    public Compte() {

    }
    public Client getProprietaire() {
        return proprietaire;
    }
    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }
    public Compte(int numeroCompte, double solde, Client proprietaire) {
        this.numeroCompte = numeroCompte;
        this.soldeInitiat = solde;
        this.proprietaire = proprietaire;
    }


}