package Java_Oops.inheritance;

class Person{

    String first;
    String last;

    Person(String first, String last)
    {
        this.first=first;
        this.last=last;
    }

    void display()
    {
        System.out.println(first+ " " +last);
    }


}

class Stud extends Person{

    double gpa;
    Stud(String first, String last,double gpa) {
    super(first, last);// ki jab wo inherit kr rha hai person ko toh uski first and last ki value bhi daalna jarruri toh ye constructor call kr rha hai super() , person class ka aur usme first and last ki value daal de rha hai .

    this.gpa=gpa;
      
    }

    void showGpa()
    {
        System.out.println("Gpa is "+ gpa);
    }
    
}


class Employee extends Person{

    int salary;

    Employee(String first, String last, int salary){

        super(first, last);
        this.salary=salary;

    }

    void showSalary()
    {
        System.out.println("salary is "+ salary);
    }

}



public class superClass {

    // Super : used in constructor or method oevrloading , call the parents contructor to instilise value
    public static void main(String[] args) {

        Person person =new Person("vishal", "sinha");
        Stud students =new Stud("aayush","sinha", 98.08);
        Employee employee = new Employee("mukul","rajput",1200489);

       
        person.display();
        students.display();
        students.showGpa();
        employee.display();
        employee.showSalary();
        
    }
}
