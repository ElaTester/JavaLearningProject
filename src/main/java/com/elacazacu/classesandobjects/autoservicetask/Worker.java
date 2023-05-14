package com.elacazacu.classesandobjects.autoservicetask;

public class Worker {
    String name;
    String speciality;
    double height;
    double weight;
    int age;

    public Worker(String specificulDeLucru) {
        this.speciality = specificulDeLucru;
        System.out.println("Un lucrator a fost inregistrat ca " + this.speciality);
    }
}
