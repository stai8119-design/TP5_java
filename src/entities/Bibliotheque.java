package entities;

public class Bibliotheque {
    private Document[] documents;
    private int capacite;
    private int nbreDocActuel; 

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        this.documents = new Document[capacite];
        this.nbreDocActuel = 0;
    }

    
    public void afficherDocuments() {
        if (nbreDocActuel == 0) {
            System.out.println("La bibliothèque est vide.");
        } else {
            for (int i = 0; i < nbreDocActuel; i++) {
                System.out.println(documents[i].toString());
            }
        }
    }

  
    public boolean ajouter(Document doc) {
        if (nbreDocActuel < capacite) {
            documents[nbreDocActuel] = doc;
            nbreDocActuel++;
            return true;
        }
        return false; 
    }

 
    public boolean supprimer(Document doc) {
        for (int i = 0; i < nbreDocActuel; i++) {
            if (documents[i] == doc) {
              
                for (int j = i; j < nbreDocActuel - 1; j++) {
                    documents[j] = documents[j + 1];
                }
                documents[nbreDocActuel - 1] = null;
                nbreDocActuel--;
                return true;
            }
        }
        return false; 
    }

    
    public Document document(int numEnrg) {
        for (int i = 0; i < nbreDocActuel; i++) {
            if (documents[i].getNumEnreg() == numEnrg) {
                return documents[i];
            }
        }
        return null;
    }

    
    public void afficherAuteurs() {
        System.out.println("Liste des auteurs");
        boolean found = false;
        for (int i = 0; i < nbreDocActuel; i++) {
           
            if (documents[i] instanceof Livre) {
                Livre l = (Livre) documents[i];
                System.out.println("- " + l.getAuteur() + " (Livre: " + l.getTitre() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Aucun auteur trouvé dans la bibliothèque.");
        }
    }
}
