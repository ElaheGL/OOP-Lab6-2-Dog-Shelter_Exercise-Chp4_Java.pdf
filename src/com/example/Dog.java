package com.example;

public class Dog {
    private int age;
    private String name,breed;
    public Dog(int a,String b){
        this(b);
        this.age=a;

    }
    public Dog(String breed , int age){
        this.age=age;
        this.breed=breed;
    }
    public Dog(String breed){
        this.breed=breed;
    }

    public void setName(String name ){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public String getBreed() {
        return breed;
    }
    public void bark(){
        System.out.println("woof woof");
    }
    public String toString(){
        return "Dog [breed=" + breed + ",name = "+ name+ ", age ="+ age+ "]";
    }
}
