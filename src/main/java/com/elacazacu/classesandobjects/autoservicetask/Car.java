package com.elacazacu.classesandobjects.autoservicetask;

public class Car {

    String plateNumber;
    String color;
    String make;
    String model;
    int kmWhenEnteredTheService;
    int productionYear;
    int km;
    double carPrice;

//    Constructorul de mai jos primeste 3 parametri de intrare, in rezultat ca crea un obiect Car despre care se va cunoaste
//    marca, modelul,  culoarea dar nu si alte detalii precum plateNumber sau km
    public Car(String makeParametruDeIntrare, String modelFormalParameter, String colorLocalVariable, int productionYear) {
        this.make = makeParametruDeIntrare;
        this.model = modelFormalParameter;
        this.color = colorLocalVariable;
        this.productionYear = productionYear;
    }
    public Car(String numarulDeInmatriculare){
        this.plateNumber = numarulDeInmatriculare;
        System.out.println("A fost creata o masina despre care cunoastem numai numarul de inmatriculare" +numarulDeInmatriculare);
    }

}
