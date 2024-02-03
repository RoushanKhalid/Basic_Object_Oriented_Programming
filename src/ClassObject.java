class Pen { // blueprint
    String color; // properties // data
    String type; // properties // data

    public void write() {
        System.out.println("Writing Something"); // members
    }

    public void printColor() { // members
        System.out.println(this.color);
    }
}

class Student { // class definition
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ClassObject { // class name should match filename
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpen";

        pen1.write(); // method/function
        pen2.write(); // method/function

        pen1.printColor(); // this.data includes the specific attribute for that method
        pen2.printColor(); // this.data includes the specific attribute for that method

        Student s1 = new Student();
        s1.name = "Khalid";
        s1.age = 23;
        s1.printInfo();

        Student s2 = new Student();
        s2.name = "YouKn0wWho";
        s2.age = 27;
        s2.printInfo();
    }
}