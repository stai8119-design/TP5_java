package com.example.t;

public class Zoo {
	
	private Animal[] animaux;
    private int nbAnimaux;

    public Zoo() {
        this.animaux   = new Animal[5];
        this.nbAnimaux = 0;
    }

    public void ajouterAnimal(Animal a) {
        if (nbAnimaux == animaux.length) {
            Animal[] t = new Animal[animaux.length * 2];
            System.arraycopy(animaux, 0, t, 0, animaux.length);
            animaux = t;
        }
        animaux[nbAnimaux++] = a;
    }

    public void afficherTous() {
        System.out.println("Le zoo contient " + nbAnimaux + " animaux :");
        for (int i = 0; i < nbAnimaux; i++) {
            System.out.println("  - " + animaux[i]);
        }
    }

}
