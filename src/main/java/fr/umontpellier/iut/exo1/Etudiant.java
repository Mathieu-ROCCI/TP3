package fr.umontpellier.iut.exo1;

import java.time.LocalDate;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String mail;
    private String adressePost;

    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String mail, String adressePost) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.adressePost = adressePost;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prenom + '\'' +
                ", date de naissance=" + dateNaissance +
                ", e-mail='" + mail + '\'' +
                ", adresse postale='" + adressePost + '\'' +
                '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}

