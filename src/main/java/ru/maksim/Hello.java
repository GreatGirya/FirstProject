package ru.maksim;


public class Hello{

    public static void main(String[] args) {

        Person bob = new Person();
        bob.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person sam = new Person("Sam", 25);
        sam.displayInfo();
    }
}
class Person{

    String name;
    int age;
    Person()
    {
        name = "Undefined";
        age = 16;
    }
    Person(String n)
    {
        name = n;
        age = 18;
    }
    Person(String n, int a)
    {
        name = n;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
