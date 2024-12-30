import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static private int counter = 1;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private String telephone;
    private int ID;

    public ArrayList<Compte> comptes = new ArrayList<Compte>();

    public  String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse=adresse;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }

    public Client(String nom, String prenom, String email, String adresse, String telephone) {
        this.ID = counter;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
        counter++;

    }
    public Client() {
    }
    public void gestionClient(ArrayList<Client> clients) {
        int choix;
        System.out.println("\n*****CLIENT*****\n");
        System.out.println("1- Ajouter un client");
        System.out.println("2- Afficher tous les clients");
        System.out.println("3- Quitter");
        System.out.println("\n");


        do{
            System.out.print("Veuillez choisir une option : ");
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix){
                case 1:
                    ajouterClient(clients);
                    break;
                case 2:
                    afficherClient(clients);
                    break;
                case 3:
                    System.out.println("VOUZ AVEZ QUITTER LA CASE DES CLIENTS");
                    break;
                default:
                    System.out.println("Choix incorrect");
                    break;
            }
        }while (choix != 3);


    }
    public void ajouterClient(ArrayList<Client> clients){
        Scanner sc = new Scanner(System.in);
        System.out.println("saisissez le nom du client : ");
        String nom = sc.nextLine();
        System.out.println("saisissez le prenom du client : ");
        String prenom = sc.nextLine();
        System.out.println("saisissez l'email du client : ");
        String email = sc.nextLine();
        System.out.println("saisissez l'adresse du client : ");
        String adresse = sc.nextLine();
        System.out.println("saisissez le telephone du client : ");
        String telephone = sc.nextLine();
        Client client1 = new Client(nom,prenom,email,adresse,telephone);
        clients.add(client1);
    }
    public void afficherClient(ArrayList<Client> clients){
        for (Client client : clients) {
            System.out.println("Id du client est :" +client.getID());
            System.out.println("nom du client est :" + client.getNom());
            System.out.println("prenom du client est :" + client.getPrenom());
            System.out.println("email du client est :" + client.getEmail());
            System.out.println("adresse du client est :" + client.getAdresse());
            System.out.println("telephone du client est :" + client.getTelephone());
        }
    }

}
