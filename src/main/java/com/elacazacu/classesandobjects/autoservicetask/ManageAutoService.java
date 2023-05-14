package com.elacazacu.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
//        Declararea si initializarea obiectelor folosind toate tipurile de constructori
        Car hyundaiTucson = new Car("Tucson", "Hyundai", "Alba",2016);

        hyundaiTucson.plateNumber = "CEV 010";
        hyundaiTucson.kmWhenEnteredTheService = 115300;

        System.out.println("Masina " + hyundaiTucson.make + " de model " + hyundaiTucson.model + " de culoare " + hyundaiTucson.color +
                " are numarul de imatriculare " + hyundaiTucson.plateNumber + " si kilometrajul " + hyundaiTucson.kmWhenEnteredTheService);

        hyundaiTucson.carPrice = 20000;
        System.out.println("Masina a fost procurata cu " + hyundaiTucson.carPrice+ " euro ");

        Car fordFocus = new Car(" III 222");
        Car hyundaiSantafe = new Car(" AVA 323");

        Tool cheie = new Tool("Cheia franceza");
        cheie.weight = 0.8;
        cheie.quantity = 250;
        cheie.isElevator = true;
        cheie.isUsed = false;
        cheie.needsElectricity = true;
        cheie.uniqueCode = 24357299;

        System.out.println("Instrumentul cu numele " + cheie.name + " are greutatea de " + cheie.weight + " a fost procurata in numar de " +
                cheie.quantity + " unitati cu codul " + cheie.uniqueCode + " Piesele procurate sunt uzate - " + cheie.isUsed);
        System.out.println("Avem elevator in garaj - " + cheie.isElevator + " Elevatorul necesita conectarea la electricitate - " +
                cheie.needsElectricity );

        Worker fedeaBalansirovsic = new Worker("Balansirovsic");
        fedeaBalansirovsic.age = 25;
        fedeaBalansirovsic.height = 186;
        fedeaBalansirovsic.name = "Fedea";

        System.out.println("La garaj lucreaza" + fedeaBalansirovsic.name + " in varsta de " + fedeaBalansirovsic.age +
                " de inaltime " + fedeaBalansirovsic.height);

        Garage garajulLuiFedea = new Garage(" Buiucani", " FedeaAutoService");

        System.out.println("Adresa garajului lui Fedea este" + garajulLuiFedea.address);
    }
}
