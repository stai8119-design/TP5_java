package com.example.t;

public class Mammifere extends Animal {
	
	private String couleurFourure;

    public Mammifere(String nom, int age, String couleurFourure) {
        super(nom, age);
        this.couleurFourure = couleurFourure;
    }

    public void allaiter() {
        System.out.println(nom + " allaite ses petits.");
    }

    @Override
    public String toString() {
        return super.toString() +
               " {Mammifere, fourrure=" + couleurFourure + "}";
    }

}
