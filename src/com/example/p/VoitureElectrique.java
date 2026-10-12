package com.example.p;

public class VoitureElectrique extends Motorise {
	
	public VoitureElectrique(String modele, Moteur moteur, double batterieInitial) {
        super(modele, moteur, batterieInitial);
    }

    @Override
    public void refuel(double kwh) {
        niveauCarburant += kwh;
        System.out.println(modele + " recharge " 
            + kwh + " kWh (niveau=" 
            + niveauCarburant + ")");
    }

    @Override
    public String toString() {
        return super.toString()
            .replace("carburant", "batterie") 
            + " {Electrique}";
    }

}
