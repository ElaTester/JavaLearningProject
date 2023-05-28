package com.elacazacu.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal charlieDog = new Dog("Charlie");

        System.out.println("Nemele obiectului charlieDog este :" + charlieDog.getName());
        charlieDog.setName("Charlie Vaccined");
        System.out.println("Nemele actualizat a lui charlieDog este :" + charlieDog.getName());

        charlieDog.eat();
        charlieDog.makeSound();

        AnimalInterface rexDog = new Dog("Rex");
        rexDog.makeSound();

        Dog zikDog = new Dog("Zik");
        zikDog.eat();
        zikDog.makeSound();

        Cat leoKisa = new Cat("Leo");
        leoKisa.eat();
        leoKisa.makeSound();

        Animal barniFox = new Fox("Barni");
        Dog mikiDog = new Dog("Miki");
        Cat lionCat = new Cat("Lion");

        barniFox.eat();
        mikiDog.makeSound();
        lionCat.eat();
    }
}