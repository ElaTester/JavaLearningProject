package com.elacazacu.accessmodifiers.peopleevidence;

public class Person {
    // Aceasta proprietate este legata de clasa - Variabila de Clasa, este privata si poate fi accesata numai in cadrul persoanei.
    private static int numarTotalDePersoane;

    // Aceasta este o variabila de instanta si este declarata ca fiind privata - poate fi accesata doar din clasa Person.
    private int age;

    // Genul și numele sunt variabile de instanță, deoarece descriu subiecții clasei. Public înseamnă că pot fi accesate de oriunde în proiect.
    public String gender;
    public String name;
    public boolean isRetired;

    // Cuvantul cheie Final descrie un modificator de non acces, ceea ce inseamna ca aceasta proprietate nu va fi modificata in timpul executiei si trebuie sa fie initializata odata ce obiectul este creat.
    private final long CNP;
    public String address;

    // Proprietatea protected poate fi accesata numai din clasele care apartin pachetului peopleevidence si din subclasele acestuia.
    protected String phone;

    // Proprietatea default poate fi accesata numai din clasele care apartin peopleevidence.
    double height;
    String eyeColor;
    double weight;
    String education;
    String nationality;
    boolean isMarried;

    String readingBook;
    String emailAddress;
    String occupation;

    // Constructor cu un singur parametru care are un parametru obligatoriu
    public Person(long CNPObligatoriuLaCreare){
        CNP = CNPObligatoriuLaCreare;
        numarTotalDePersoane++;
    }
    // Constructor cu mai multi parametri care contine si parametrul CNP obligatoriu
    public Person(long CNP, String name, boolean isMarried, int age, boolean isRetired){
        this.CNP = CNP;
        this.name = name;
        this.isMarried = isMarried;
        this.isRetired = isRetired;
        this.age = age;
        numarTotalDePersoane++;
    }
    public static void printNumarDePersoane(){
        System.out.println("Numarul total de persoane este: " + numarTotalDePersoane);
    }
    public long getCNP(){
        return CNP;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", CNP=" + CNP +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", height=" + height +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", education='" + education + '\'' +
                ", isMarried=" + isMarried +
                ", readingBook='" + readingBook + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}