package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.Month.JANUARY;

public class GestionEtudiants {
    public static void main(String[] args) {
        Etudiant lolo = new Etudiant("Deiana", "Philippe", LocalDate.of(1997, JANUARY, 31), "fifou34@caramail.com", "18 rue Morgue");
        Etudiant toto = new Etudiant("Deiana", "Philippe", LocalDate.of(1997, JANUARY, 31), "fifou34@caramail.com", "18 rue Morgue");
        Etudiant coco = new Etudiant("Deiana", "Philippe", LocalDate.of(1997, JANUARY, 31), "fifou34@caramail.com", "18 rue Morgue");
        Etudiant popo = new Etudiant("Deiana", "Philippe", LocalDate.of(1997, JANUARY, 31), "fifou34@caramail.com", "18 rue Morgue");
        toto = lolo;

        Departement monDepInfo = new Departement("Informatique", "Occitanie");
        System.out.println(lolo.toString());
        System.out.println(toto == lolo);

        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(coco);
        monDepInfo.inscrire(popo);
        System.out.println(monDepInfo);

        monDepInfo.desinscrire(toto);
        System.out.println(monDepInfo);
    }

}

