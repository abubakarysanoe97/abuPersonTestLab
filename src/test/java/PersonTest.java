import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testConstructorWithName() {
        //Given
        Person person = new Person();
        String expectedName = "John";

        //When
        person = new Person(expectedName);

        //Then
        assertEquals(expectedName, person.getName());
    }
    @Test
    public void PersonAgeTest() {
        int expectedAge = 30;
        Person person = new Person(expectedAge);
        assertEquals(expectedAge, person.getAge());
    }
    @Test
    public void PersonNameAndAgeTest() {
        Person person = new Person("Mikey",15);
        String expectedName = "Mikey";
        int expectedAge = 15;
        person = new Person(expectedName, expectedAge);

        assertEquals(expectedName, person.getName());
        assertEquals(expectedAge, person.getAge());
    }

    @Test
    public void testSetName() {
        Person person = new Person("Alice");
        String newName = "Alice";
        person.setName(newName);
        assertEquals(newName, person.getName());
    }

@Test
    public void testSetAge() {
        Person person = new Person(16);
        int newAge = 16;
        person.setAge(newAge);
        assertEquals(newAge, person.getAge());
    }
    @Test
    public void testGetName() {
        Person person = new Person("Abu");
        String actualName = person.getName();
        String expectedName = "Abu";
        assertEquals(expectedName, actualName);
    }
    @Test
    public void testGetAge() {
        Person person = new Person( 1);
        Integer actualAge = person.getAge();
        Integer expectedAge = 1;
        assertEquals(expectedAge, actualAge);
    }
        @Test
        public void testAddName() {
            List<String> listOfNames = new ArrayList<>();
            String nameToAdd ="Joey";
            listOfNames.add(nameToAdd);
            assertTrue(listOfNames.contains(nameToAdd));
    }
    @Test
    public void NameRemovedTest() {
        List<String> listOfNames = new ArrayList<>();
        String nameToRemove = "Curry";
        listOfNames.remove(nameToRemove);
        assertFalse(listOfNames.contains(nameToRemove));
    }

        @Test
        public void testGetSizeOfList() {
            Person person = new Person();
            person.addName("Mikey");
            person.addName("Moe");
            person.addName("Danny");
            int size = person.getSizeOfList();
            int expectedSize = 3;
            assertEquals(expectedSize, size);
        }


}