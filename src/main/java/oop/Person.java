package oop;

import java.time.Year;

public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public int getAge(){
        int year = Year.now().getValue();
        return year - birthYear;
    }
    public void input(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public void output(){
        System.out.println(toString());
    }
    public void changeName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        person1.input("Piter", 1995);
        person2.input("Olya", 1997);
        person3.input("Ira", 1999);
        person4.input("Nick", 1998);
        person5.input("Olaf", 1994);
        person1.output();
    }
}
