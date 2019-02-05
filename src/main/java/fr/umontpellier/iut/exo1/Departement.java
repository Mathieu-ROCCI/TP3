package fr.umontpellier.iut.exo1;

import java.util.ArrayList;

public class Departement {
    private String spec;
    private String adresse;
    private ArrayList etudInscrits;

    public Departement(String spec, String adresse) {
        this.spec = spec;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "etudInscrits=" + etudInscrits +
                '}';
    }
    public void inscrire(Etudiant e) {
        etudInscrits.add(e);
    }
}
