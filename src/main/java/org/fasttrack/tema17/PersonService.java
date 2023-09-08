package org.fasttrack.tema17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonService {

    protected List<Person> personList;

    public PersonService(List<Person> list) {
        this.personList = list;
    }

    @Override
    public String toString() {
        return personList.toString();
    }

    public List<String> addBothNames() {

        return personList.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());
    }

    public List<Person> showMajorPers() {

        return personList.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public List<Person> peopleFromOradea() {

        return personList.stream()
                .filter(person -> person.getCity().equals("Oradea"))
                .collect(Collectors.toList());
    }

    public List<Person> peopleFromSpecCities(List<String> cities) {

        return personList.stream()
                .filter(person -> cities.contains(person.getCity()))
                .collect(Collectors.toList());
    }

    public List<String> firstNamesCapitalized() {

        return personList.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> printSpecNames() {

        return personList.stream()
                .map(person -> person.getLastName() + " " + person.getFirstName().charAt(0))
                .collect(Collectors.toList());
    }

    public List<Person> printPersSpecAge() {

        return personList.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() < 60)
                .collect(Collectors.toList());
    }

    public List<Person> firstNameStarsWithA() {

        return personList.stream()
                .filter(person -> person.getFirstName().contains("A"))
                .collect(Collectors.toList());
    }

    public List<String> printUniqueNames() {

        return personList.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Person> sortPersByFirstName() {

        return personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
    }

    public List<Person> sortPersByLastName() {

        return personList.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
    }

    public List<Person> multipleSorting() {

        return personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName)
                        .thenComparing(Person::getAge))
                .collect(Collectors.toList());
    }

}
