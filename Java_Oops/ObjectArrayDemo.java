package Java_Oops;

class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void details() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ObjectArrayDemo {

    public static void main(String[] args) {

        // Creating an array of Student objects
        Student[] students = new Student[2];

        // Initializing each object
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);

        // Displaying details using enhanced for-loop
        for (Student student : students) {
            student.details();
        }
    }
}
