//Q. Write a program to create a class called Teaching having one
//        member nameOfSubject and another class called NonTeaching
//        having member typeOfWork. Both the classes extend the
//        Employee class. Provide information of two Teaching and two
//        NonTeaching employees. Print all the information of employee by
//        the given empNo.

package Lab_Practicals;
class Employee {
    String name;
    int empNo, age, sal;

    public Employee(String name, int empNo, int sal, int age) {
        this.name = name;
        this.empNo = empNo;
        this.sal = sal;
        this.age = age;
    }
}

class Teaching extends Employee {
    String nameOfSubject;

    public Teaching(String name, int empNo, int sal, int age, String nameOfSubject) {
        super(name, empNo, sal, age);
        this.nameOfSubject = nameOfSubject;
    }
}

class NonTeaching extends Employee {
    String typeOfWork;

    public NonTeaching(String name, int empNo, int sal, int age, String typeOfWork) {
        super(name, empNo, sal, age);
        this.typeOfWork = typeOfWork;
    }
}

public class practical_25 {
    public static void main(String[] args) {
        Teaching t1 = new Teaching("John", 1, 50000, 24, "Math");
        Teaching t2 = new Teaching("Mary", 2, 60000, 25, "English");
        NonTeaching nt1 = new NonTeaching("Bob", 3, 40000, 27, "Janitor");
        NonTeaching nt2 = new NonTeaching("Alice", 4, 45000, 22, "Cafeteria worker");

        Employee[] employees = { t1, t2, nt1, nt2 };
        int empNo = 2;

        for (Employee e : employees) {
            if (e.empNo == empNo) {
                if (e instanceof Teaching) {
                    Teaching t = (Teaching) e;
                    System.out.println("Name: " + t.name);
                    System.out.println("Employee Number: " + t.empNo);
                    System.out.println("Salary: $" + t.sal);
                    System.out.println("Age: " + t.age);
                    System.out.println("Name of Subject: " + t.nameOfSubject);
                } else if (e instanceof NonTeaching) {
                    NonTeaching nt = (NonTeaching) e;
                    System.out.println("Name: " + nt.name);
                    System.out.println("Employee Number: " + nt.empNo);
                    System.out.println("Salary: $" + nt.sal);
                    System.out.println("Age: " + nt.age);
                    System.out.println("Type of Work: " + nt.typeOfWork);
                }
            }
        }
    }
}
