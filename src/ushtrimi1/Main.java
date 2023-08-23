package ushtrimi1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "Tirana, Albania");
        System.out.println("Person: " + person);

        Student student = new Student("Alice Smith", "New York, USA", 5, 8.7);
        System.out.println("Student: " + student);

        Pedagog pedagog = new Pedagog("Dr. James Brown", "London, UK", 3, 2500.0);
        System.out.println("Pedagog: " + pedagog);
    }
}
