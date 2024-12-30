import java.util.ArrayList;
import java.util.Scanner;

public class CompteEpargne extends Compte {
    double tauxdEpargne;

    public CompteEpargne(int numeroCompte, double solde, Client proprietaire) {
        super(numeroCompte, solde, proprietaire);
        this.tauxdEpargne = 0.07;
    }
    public CompteEpargne() {

    }
    public double getTauxdEpargne() {
        return tauxdEpargne;
    }
    public void setTauxdEpargne(double tauxdEpargne) {
        this.tauxdEpargne = tauxdEpargne;
    }

    public void creationCompteEpargne(ArrayList<CompteEpargne> compte2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-numero de compte : ");
        int numeroCompte = sc.nextInt();
        System.out.println("le solde initiale est :");
        double soldeInitiat = sc.nextDouble();
        System.out.println("l'ID du proprietaire est :");
        CompteEpargne compte = new CompteEpargne();
        compte2.add(compte);
    }
    public void afficherCompteEpargne(ArrayList<CompteEpargne> compte1) {
        for (CompteEpargne c : compte1) {
            System.out.println("Le numéro de compte est : " + c.getNumeroCompte());
            System.out.println("Le solde initiale est : " + c.getSoldeInitiat());
            System.out.println("le proprietaire est : " + c.getProprietaire().getNom());
        }
    }
}
