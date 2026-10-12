package test;

import entities.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrer la capacite de la bibliotheque :");
        int capacite = sc.nextInt();
        
        Bibliotheque maBiblio = new Bibliotheque(capacite);
        
       
        Document d1 = new Livre("Programmation Java", "Mohammed", 250);
        Document d2 = new Dictionnaire("Larousse", "Français");
        
        maBiblio.ajouter(d1);
        maBiblio.ajouter(d2);
        
        int choix = 0;
        
        while (choix != 5) {
        	
        	 System.out.print("Donner votre choix : ");
            System.out.println("\nMENU BIBLIOTHEQUE");
            System.out.println("1 Afficher les documents");
            System.out.println("2 Ajouter un livre");
            System.out.println("3 Supprimer un document");
            System.out.println("4 Chercher un document");
            System.out.println("5 Quitter");
           
            
            choix = sc.nextInt();
            
            if (choix == 1) {
                maBiblio.afficherDocuments();
            } else {
                if (choix == 2) {
                    sc.nextLine(); 
                    System.out.print("Entrer le titre : ");
                    String t = sc.nextLine();
                    System.out.print("Entrer l auteur : ");
                    String a = sc.nextLine();
                    System.out.print("Entrer le nombre de pages : ");
                    int p = sc.nextInt();
                    
                    Document nouveauLivre = new Livre(t, a, p);
                    maBiblio.ajouter(nouveauLivre);
                    System.out.println("Ajout effectue");
                } else {
                    if (choix == 3) {
                        System.out.print("Entrer le numero d enregistrement a supprimer : ");
                        int num = sc.nextInt();
                        Document docASupprimer = maBiblio.document(num);
                        if (docASupprimer != null) {
                            maBiblio.supprimer(docASupprimer);
                            System.out.println("Supprimer avec succes"); 
                        } else {
                            System.out.println("Erreur document introuvable");
                        }
                    } else {
                        if (choix == 4) {
                            System.out.print("Entrer le numero a chercher : ");
                            int numRecherche = sc.nextInt();
                            Document trouve = maBiblio.document(numRecherche);
                            if (trouve != null) {
                                System.out.println(trouve.toString());
                            } else {
                                System.out.println("Introuvable");
                            }
                        } else {
                            if (choix == 5) {
                                System.out.println("Au revoir");
                            } else {
                                System.out.println("Choix invalide");
                            }
                        }
                    }
                }
            }
        }
    }
}
