class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Called : Non-parameterised");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public void printInfo(String name) {
        System.out.println("Called : name parameterised");
        System.out.println("Name: " + name);
    }

    public void printInfo(int age) {
        System.out.println("Called : age parameterised");
        System.out.println("Age: " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Called : name and age parameterised");

        this.name = name;
        this.age = age;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Polymorphism");
        Student s1 = new Student();
        s1.name = "Khalid";
        s1.age = 23;
        s1.printInfo();
        s1.printInfo("Sk. Roushan Khalid");
        s1.printInfo(999);
        s1.printInfo(s1.name, s1.age);
        s1.printInfo("SRK", 17);

        System.out.println("After calling printInfo(String name, int age):");
        s1.printInfo();
    }
}