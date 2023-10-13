import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private final List<String> listOfNames = new ArrayList<>();

    public Person() {
        this.name = "demoName";
    }


    public Person(String name) {
        //  Need Test Case
        this.name = name;
    }

    public Person(int age) {
        //  Need Test Case
        this.age = age;
    }

    public Person(String name, int age) {
        //  Need Test Case
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        //  Need Test Case
        this.name = name;
    }

    public void setAge(int age) {
        //  Need Test Case
        this.age = age;
    }

    public String getName() {
        //  Need Test Case
        return name;
    }

    public Integer getAge() {
        //  Need Test Case
        return age;
    }


    public void addName(String name){

        this.listOfNames.add(name);
    }

    public void removeName(String name){
        listOfNames.add("Kobe");
        listOfNames.add("Curry");
        listOfNames.add("Embiid");

        // Remove a name from the list
        String nameToRemove = "Curry";
        listOfNames.remove("Curry");
    }

    public int getSizeOfList(){
        return listOfNames.size();
    }

}
