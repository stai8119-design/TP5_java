package entities;

public class Document {
	
	    protected int numEnreg;
	    protected String titre;
	    private static int comp = 0;

	    public Document(String titre) {
	        comp++;
	        this.numEnreg = comp;
	        this.titre = titre;
	    }

	    public int getNumEnreg() {
	        return numEnreg;
	    }

	    public String getTitre() {
	        return titre;
	    }

	    public void setTitre(String titre) {
	        this.titre = titre;
	    }

	    @Override
	    public String toString() {
	        return "Numéro d'enregistrement: " + numEnreg + ", Titre: " + titre;
	    }
	}
	

