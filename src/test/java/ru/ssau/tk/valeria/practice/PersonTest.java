package ru.ssau.tk.valeria.practice;

import org.testng.annotations.Test;

import org.testng.Assert;

public class PersonTest {
    @Test
    public static void testingFirstName() {
        Person person = new Person();
        person.setFirstName("Valeria");
        Assert.assertEquals(person.getFirstName(), "Valeria");
    }

    @Test
    public static void testingLastName() {
        Person person = new Person();
        person.setLastName("Atapina");
        Assert.assertEquals(person.getLastName(), "Atapina");
    }

    @Test
    public static void testingPassportId() {
        Person person = new Person();
        person.setPassportId(1234);
        Assert.assertEquals(person.getPassportId(), 1234);
    }

    @Test
    public static void testingConstructorWithoutParameters() {
        Person person = new Person();
        Assert.assertEquals(person.getFirstName(), "Unknown");
        Assert.assertEquals(person.getLastName(), "Unknown");
        Assert.assertEquals(person.getPassportId(), 0);
        Assert.assertEquals(person.getGender(), Gender.MALE);
    }

    @Test
    public static void testingConstructorWithOneParameter() {
        Person person = new Person(1234);
        Assert.assertEquals(person.getPassportId(), 1234);
    }

    @Test
    public static void testingConstructorWithTwoParameter() {
        Person person = new Person("Valeria", "Atapina");
        Assert.assertEquals(person.getFirstName(), "Valeria");
        Assert.assertEquals(person.getLastName(), "Atapina");
    }

    @Test
    public static void testingConstructorWithThreeParameters() {
        Person person = new Person("Valeria", "Atapina", 1234);
        Assert.assertEquals(person.getFirstName(), "Valeria");
        Assert.assertEquals(person.getLastName(), "Atapina");
        Assert.assertEquals(person.getPassportId(), 1234);
    }

    @Test
    public static void testingConstructorWithFourParameters() {
        Person person = new Person("Valeria", "Atapina", 1234, Gender.FEMALE);
        Assert.assertEquals(person.getFirstName(), "Valeria");
        Assert.assertEquals(person.getLastName(), "Atapina");
        Assert.assertEquals(person.getPassportId(), 1234);
        Assert.assertEquals(person.getGender(), Gender.FEMALE);
    }

    @Test
    public static void testToString() {
        Person person = new Person("Valeria", "Atapina");
        Assert.assertEquals(person.toString(), "Это Valeria Atapina");
    }
}