package fr.umontpellier.iut.exo1;

import java.time.LocalDate;

import static java.time.Month.JANUARY;

public class GestionEtudiants {
    public static void main(String[] args) {
        Etudiant lolo = new Etudiant("Deiana", "Philippe", LocalDate.of(1997, JANUARY, 31), "fifou34@caramail.com", "18 rue Morgue");
        Etudiant toto = new Etudiant("Deiana", "Philippe", LocalDate.of(1997, JANUARY, 31), "fifou34@caramail.com", "18 rue Morgue");

        System.out.println(lolo.toString());
        System.out.println(lolo==toto);
        }

    }

