package com.elacazacu.classesandobjects.autoservicetask;

public class Tool {
    String name;
    double price;
    double weight;
    long uniqueCode;
    boolean isUsed;
    boolean isElevator;
    boolean needsElectricity;
    int quantity;

    public Tool(String name) {
        this.name = name;
        System.out.println("Un obiect de tip tool a fost creat, numele lui este " + this.name);
    }
    public Tool() {
        System.out.println("O nouă uneltă a fost creată în cadrul programului. Nu dispunem despre detaliile ei"
                + " pentru detalii Numele este " + this.name + " iar greutatea este " + this.weight);
    }

}
