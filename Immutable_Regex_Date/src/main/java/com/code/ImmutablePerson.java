package com.code;

public final class ImmutablePerson {
    private final String name;
    private final String surname;
    private final Integer age;

    public ImmutablePerson(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public ImmutablePerson instanceofThisImmutableClass() {
        return new ImmutablePerson(this.name, this.surname, this.age);
    }

    public static void main(String[] args) {


        ImmutablePerson immutablePerson = new ImmutablePerson("Salam", "Sagol", 2);
        ImmutablePerson immutablePerson1 = immutablePerson.instanceofThisImmutableClass();

        System.out.println(immutablePerson.name);
        System.out.println(immutablePerson1.name);
        System.out.println(immutablePerson == immutablePerson1);






    }

}
