package com.example;

public class Shelter {
    public static void main(String[] args){
        Dog dog = new Dog(2, "haski");
        Dog dog1= new Dog(5,"pitbull");
        dog.setName("Mike");
        dog.bark();
        dog1.bark();
        System.out.println(dog);
        System.out.println(dog1);
    }
}
