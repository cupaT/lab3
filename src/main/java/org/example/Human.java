package org.example;

import java.util.*;

public class Human implements Comparable<Human> {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human other) {
        return this.age - other.age; // Сравнение по возрасту
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }

    // Класс для компаратора по фамилии
    public static class HumanComparatorByLastName implements Comparator<Human> {
        @Override
        public int compare(Human h1, Human h2) {
            return h1.getLastName().compareTo(h2.getLastName());
        }
    }
}
