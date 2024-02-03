class Student { // class definition
    String name;
    int age;

    Student() { // non parameterised
        System.out.println("Constructor is being called");
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Contructor {
    public static void main(String[] args) {
        System.out.println("Hello");
        Student s1 = new Student();
        s1.age = 99;
        s1.name = "Ben10";
        Constructor() {
            System.out.println("Joy Bangla");
        }
        s1.printInfo();
    }
}
