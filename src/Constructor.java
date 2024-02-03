class Student { // class definition
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() { // non-parameterized constructor
        System.out.println("non-parameterized Constructor is being called");
    }

    Student(String name, int age) { // parameterized constructor
        System.out.println("parameterized Constructor is being called");
        this.age = age; // this.age = object's age & age = parameters age
        this.name = name;
    }

}

public class Constructor {
    Constructor() { // constructor for Constructor class
        System.out.println("Joy Bangla Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        Student s1 = new Student();
        s1.age = 99;
        s1.name = "Ben10";
        s1.printInfo();

        Student s2 = new Student("Baymax", 69);
        s2.printInfo();

        Constructor constructor = new Constructor(); // an object of the Constructor class
    }
}