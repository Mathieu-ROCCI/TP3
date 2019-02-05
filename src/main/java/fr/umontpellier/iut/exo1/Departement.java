package fr.umontpellier.iut.exo1;

import java.util.ArrayList;

public class Departement {
    private String spec;
    private String adresse;
    private ArrayList<Etudiant> etudInscrits;

    public Departement(String spec, String adresse) {
        this.spec = spec;
        this.adresse = adresse;
        etudInscrits = new ArrayList();
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

    public void desinscrire(Etudiant e) {
        etudInscrits.remove(e);
    }
}
