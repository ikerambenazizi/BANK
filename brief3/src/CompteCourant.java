import java.util.ArrayList;
import java.util.Scanner;

public class CompteCourant extends Compte {
    double fraisBancaire;

    public CompteCourant(int numeroCompte, double soldeInitiat, Client proprietaire) {
        super(numeroCompte, soldeInitiat, proprietaire);
        this.fraisBancaire = 0.05;
    }
    public CompteCourant() {}
    public double getFraisBancaire() {
        return fraisBancaire;
    }
    public void setFraisBancaire(double fraisBancaire) {
        this.fraisBancaire = fraisBancaire;
    }

    public void creationCompteCourant(ArrayList<CompteCourant> c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-numero de compte : ");
        int numeroCompte = sc.nextInt();
        System.out.println("le solde initiale est :");
        double soldeInitiat = sc.nextDouble();
        System.out.println("l'ID du proprietaire est :");
        int id = sc.nextInt();
        sc.nextLine();

        Client foundClient = null;
        for (Client client : Main.clients) {
            if ( client.getID() == id) {
                foundClient = client;
                break;
            }
        }

        if (foundClient == null) {
            System.out.println("client introuvable");
        } else {
            CompteCourant compte = new CompteCourant( numeroCompte, soldeInitiat, foundClient );
            foundClient.comptes.add( compte );
            compte.setProprietaire(foundClient);
        }


    }
    public void afficherC(ArrayList<CompteCourant> compte1) {
        for (CompteCourant c : compte1) {
            System.out.println("Le numéro de compte est : "+c.getNumeroCompte());
            System.out.println("Le solde initiale est : "+c.getSoldeInitiat());
            System.out.println("le proprietaire est : "+c.getProprietaire().getNom());
        }
    }

}