package org.fasttrack.tema17;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PersonServiceTest {

    private List<Person> persons;
    private PersonService personService;

    @Before
    public void setUp() {
        persons = new ArrayList<>();
        persons.add(new Person("John", "Doe", 25, "New York"));
        persons.add(new Person("Alice", "Smith", 30, "Oradea"));
        persons.add(new Person("Bob", "Johnson", 22, "Cluj"));
        personService = new PersonService(persons);
    }

    @Test
    public void addBothNamesTest() {

        List<String> expectedNames = new ArrayList<>();
        expectedNames.add("John Doe");
        expectedNames.add("Alice Smith");
        expectedNames.add("Bob Johnson");

        List<String> actualNames = personService.addBothNames();

        assertEquals(expectedNames, actualNames);
    }

    @Test
    public void showMajorPersTest() {

        List<Person> expectedPers = personService.personList;
        List<Person> actualPers = personService.showMajorPers();

        assertEquals(expectedPers, actualPers);
    }

    @Test
    public void peopleFromOradeaTest() {

        List<Person> expectedOradeaResidents = new ArrayList<>();
        expectedOradeaResidents.add(new Person("Alice", "Smith", 30, "Oradea"));
        List<Person> actualOradeaResidents = personService.peopleFromOradea();
        for (int i = 0; i < expectedOradeaResidents.size(); i++) {
            assertEquals(expectedOradeaResidents.get(i).getFirstName(), actualOradeaResidents.get(i).getFirstName());
            assertEquals(expectedOradeaResidents.get(i).getLastName(), actualOradeaResidents.get(i).getLastName());
            assertEquals(expectedOradeaResidents.get(i).getAge(), actualOradeaResidents.get(i).getAge());
            assertEquals(expectedOradeaResidents.get(i).getCity(), actualOradeaResidents.get(i).getCity());
        }
    }

    @Test
    public void peopleFromSpecCitiesTest() {

        List<Person> expectedPersons = new ArrayList<>();
        List<String> expectedCities = Arrays.asList("Oradea", "Cluj");
        expectedPersons.add(new Person("Alice", "Smith", 30, "Oradea"));
        expectedPersons.add(new Person("Bob", "Johnson", 22, "Cluj"));


        List<Person> actualPersons = personService.peopleFromSpecCities(expectedCities);
        for (int i = 0; i < expectedPersons.size(); i++) {
            assertEquals(expectedPersons.get(i).getFirstName(),actualPersons.get(i).getFirstName());
            assertEquals(expectedPersons.get(i).getLastName(), actualPersons.get(i).getLastName());
            assertEquals(expectedPersons.get(i).getAge(), actualPersons.get(i).getAge());
            assertEquals(expectedPersons.get(i).getCity(), actualPersons.get(i).getCity());
        }
    }

    @Test
    public void firstNamesCapitalizedTest() {

        List<String> actualNames = Arrays.asList("JOHN", "ALICE", "BOB");
        List<String> expectedNames = personService.firstNamesCapitalized();
        assertEquals(actualNames, expectedNames);
    }

    @Test
    public void printSpecNamesTest() {

        List<String> actualNames = Arrays.asList("Doe J", "Smith A", "Johnson B");
        List<String> expectedNames = personService.printSpecNames();
        assertEquals(actualNames, expectedNames);
    }

    @Test
    public void printPersSpecAgeTest() {

        List<Person> actualPers = new ArrayList<>();
        actualPers.add(new Person("John", "Doe", 25, "New York"));
        actualPers.add(new Person("Alice", "Smith", 30, "Oradea"));
        actualPers.add(new Person("Bob", "Johnson", 22, "Cluj"));

        List<Person> expectedPers = personService.printPersSpecAge();
        for (int i = 0; i < expectedPers.size(); i++) {
            assertEquals(expectedPers.get(i).getFirstName(),actualPers.get(i).getFirstName());
            assertEquals(expectedPers.get(i).getLastName(), actualPers.get(i).getLastName());
            assertEquals(expectedPers.get(i).getAge(), actualPers.get(i).getAge());
            assertEquals(expectedPers.get(i).getCity(), actualPers.get(i).getCity());
        }
    }

    @Test
    public void firstNameStarsWithATest() {

        List<Person> actualPers = new ArrayList<>();
        actualPers.add(new Person("Alice", "Smith", 30, "Oradea"));
        List<Person> expectedPers = personService.firstNameStarsWithA();
        for (int i = 0; i < expectedPers.size(); i++) {
            assertEquals(expectedPers.get(i).getFirstName(),actualPers.get(i).getFirstName());
            assertEquals(expectedPers.get(i).getLastName(), actualPers.get(i).getLastName());
            assertEquals(expectedPers.get(i).getAge(), actualPers.get(i).getAge());
            assertEquals(expectedPers.get(i).getCity(), actualPers.get(i).getCity());
        }

    }

    @Test
    public void printUniqueNamesTest() {

        List<String> actualPers = Arrays.asList("John", "Alice", "Bob");
        List<String> expectedPers = personService.printUniqueNames();
        assertEquals(actualPers, expectedPers);
    }

    @Test
    public void sortPersByFirstNameTest() {

        List<Person> actualPers = new ArrayList<>();
        actualPers.add(new Person("Alice", "Smith", 30, "Oradea"));
        actualPers.add(new Person("Bob", "Johnson", 22, "Cluj"));
        actualPers.add(new Person("John", "Doe", 25, "New York"));

        List<Person> expectedPers = personService.sortPersByFirstName();
        for (int i = 0; i < expectedPers.size(); i++) {
            assertEquals(expectedPers.get(i).getFirstName(),actualPers.get(i).getFirstName());
            assertEquals(expectedPers.get(i).getLastName(), actualPers.get(i).getLastName());
            assertEquals(expectedPers.get(i).getAge(), actualPers.get(i).getAge());
            assertEquals(expectedPers.get(i).getCity(), actualPers.get(i).getCity());
        }
    }

    @Test
    public void sortPersByLastNameTest() {

        List<Person> actualPers = new ArrayList<>();
        actualPers.add(new Person("John", "Doe", 25, "New York"));
        actualPers.add(new Person("Bob", "Johnson", 22, "Cluj"));
        actualPers.add(new Person("Alice", "Smith", 30, "Oradea"));

        List<Person> expectedPers = personService.sortPersByLastName();
        for (int i = 0; i < expectedPers.size(); i++) {
            assertEquals(expectedPers.get(i).getFirstName(),actualPers.get(i).getFirstName());
            assertEquals(expectedPers.get(i).getLastName(), actualPers.get(i).getLastName());
            assertEquals(expectedPers.get(i).getAge(), actualPers.get(i).getAge());
            assertEquals(expectedPers.get(i).getCity(), actualPers.get(i).getCity());
        }

    }

    @Test
    public void multipleSortingTest() {

        List<Person> actualPers = new ArrayList<>();
        actualPers.add(new Person("Alice", "Smith", 30, "Oradea"));
        actualPers.add(new Person("Bob", "Johnson", 22, "Cluj"));
        actualPers.add(new Person("John", "Doe", 25, "New York"));

        List<Person> expectedPers = personService.multipleSorting();
        for (int i = 0; i < expectedPers.size(); i++) {
            assertEquals(expectedPers.get(i).getFirstName(),actualPers.get(i).getFirstName());
            assertEquals(expectedPers.get(i).getLastName(), actualPers.get(i).getLastName());
            assertEquals(expectedPers.get(i).getAge(), actualPers.get(i).getAge());
            assertEquals(expectedPers.get(i).getCity(), actualPers.get(i).getCity());
        }
        
    }
}
