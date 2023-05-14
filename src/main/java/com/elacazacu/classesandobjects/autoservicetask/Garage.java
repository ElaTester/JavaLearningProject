package com.elacazacu.classesandobjects.autoservicetask;

public class Garage {
    String name;
    String address;
    String numberID;
    boolean hasComputerDiagnostics;
    int carCapacity;

    Garage (String adresaDataLaCreare, String numeleDatLaCreare) {
        this.address = adresaDataLaCreare;
        this.name = numeleDatLaCreare;
        System.out.println("A fost creat un garaj cu numele" + numeleDatLaCreare);
    }
}
