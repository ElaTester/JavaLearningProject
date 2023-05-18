package com.elacazacu.accessmodifiers;

import com.elacazacu.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person elenaMalina = new Person(2005016012311l);
        elenaMalina.address = "strada Vasile Lupu, 24";
        elenaMalina.gender = "Woman";
        System.out.println(elenaMalina.toString());
        Person.printNumarDePersoane();

        Person ionPostica = new Person(2016015671235l, "Ion Postica", false, 27, false);
        ionPostica.address = "strada Ion Creanga, 45";
        ionPostica.gender ="Man";
        if (ionPostica.isRetired) {
            System.out.println("Ion este la pensie");
        } else {
            System.out.println("Ion nu este iesit(a) la pensie");
        }
        System.out.println(ionPostica.toString());
        Person.printNumarDePersoane();

        Person tatianaBordian = new Person(2006785674321l, "Tatiana Bordian", true, 30, false);
        tatianaBordian.gender ="Woman";
        tatianaBordian.address = "strada Ismail 56";
        if (tatianaBordian.isRetired) {
            System.out.println("Tatiana este la pensie");
        } else {
            System.out.println("Tatiana nu este iesit(a) la pensie");
        }
        System.out.println(tatianaBordian.toString());
        Person.printNumarDePersoane();

        Person leilaBuga = new Person(3456789087237l, "Leila Buga", false, 19, false);
        leilaBuga.gender = "Woman";
        leilaBuga.address = "strada Bucuresti, 34";
        if (leilaBuga.isRetired) {
            System.out.println("Leila este la pensie");
        } else {
            System.out.println("Leila nu este iesit(a) la pensie");
        }
        System.out.println(leilaBuga.toString());
        Person.printNumarDePersoane();

        Person romanCenusa = new Person(5674563452341l, "Roman", true, 70, true);
        romanCenusa.gender = "Man";
        romanCenusa.address = "strada Miorita, 67";
        if (romanCenusa.isRetired) {
            System.out.println("Roman este la pensie");
        } else {
            System.out.println("Roman nu este iesit(a) la pensie");
        }
        System.out.println(leilaBuga.toString());
        Person.printNumarDePersoane();
    }
}