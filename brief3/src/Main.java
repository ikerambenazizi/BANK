import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<CompteCourant> compteCourant1 = new ArrayList<>();
    static ArrayList<CompteEpargne> compteEpargne2 = new ArrayList<>();

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*****MENU PRINCIPAL*****");
        System.out.println("1/Le client" );
        System.out.println("2/Le compte");
        System.out.println("3/Passer une opération");
        System.out.println("4/Quitter");
        System.out.println("Enter voter choix : ");
        //int choix = sc.nextInt();
        //sc.nextLine();
    }

    public static void main(String[] args) {
        Client client = new Client();
        CompteCourant compteCourant=new CompteCourant();
        CompteEpargne compteEpargne=new CompteEpargne();
        int choix,choix2=0;
        do {
            menu();
            Scanner scanner = new Scanner(System.in);
            choix = scanner.nextInt();

            switch (choix){
                case 1:
                    client.gestionClient(clients);
                    break;
                case 2: do {
                    System.out.println("\n*****COMPTES*****\n");
                    System.out.println("1/créer un compte courant");
                    System.out.println("2/afficher un compte courant");
                    System.out.println("3/créer un compte epargne");
                    System.out.println("4/afficher un compte courant");
                    System.out.println("5/Quitter");
                    System.out.println("Enter voter choix : ");
                    choix2 = scanner.nextInt();
                    switch(choix2){
                        case 1:compteCourant.creationCompteCourant(compteCourant1);
                            break;
                        case 2:compteCourant.afficherC(compteCourant1);
                            break;
                        case 3:compteEpargne.creationCompteEpargne(compteEpargne2);
                            break;
                        case 4:compteEpargne.creationCompteEpargne(compteEpargne2);
                            break;
                        case 5:
                            System.out.println("VOUZ AVEZ QUITTER LA CASE DES COMPTES");
                            break;
                        default:System.out.println("choix incorrect");
                            break;
                    }
                }while(choix2 != 5);
                    System.out.println("-------MERCI-------");
                    break;
                default:
                    System.out.println("choix incorrect");
                    break;
            }
        }while (choix != 2);

    }

}