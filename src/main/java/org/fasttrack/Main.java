package org.fasttrack;

import org.fasttrack.tema17.Person;
import org.fasttrack.tema17.PersonService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Person p1 = new Person("Stance", "George", 20, "Alesd");
        Person p2 = new Person("Stance", "Mihaela", 15, "Oradea");
        Person p3 = new Person("Comanici", "Roxana", 14, "Cluj");
        Person p4 = new Person("Andronici", "Raul", 61, "Timisoara");
        Person p5 = new Person("John", "Doe", 25, "New York");
        Person p6 = new Person("Bob", "Johnson", 22, "Cluj");
        Person p7 = new Person("Alice", "Smith", 30, "Oradea");

        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
        PersonService personService = new PersonService(personList);
        List<String> cities = Arrays.asList("Oradea", "Cluj");

        System.out.println(personService.addBothNames());
        System.out.println(personService.showMajorPers().toString());
        System.out.println(personService.peopleFromOradea());
        System.out.println(personService.peopleFromSpecCities(cities));
        System.out.println(personService.firstNamesCapitalized());
        System.out.println(personService.printSpecNames());
        System.out.println(personService.printPersSpecAge());
        System.out.println(personService.firstNameStarsWithA());
        System.out.println(personService.printUniqueNames());
        System.out.println(personService.sortPersByFirstName());
        System.out.println(personService.sortPersByLastName());
        System.out.println(personService.multipleSorting());

    }


}