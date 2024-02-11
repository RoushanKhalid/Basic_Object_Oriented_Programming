class Student {
    String name;
    static String school; // Declare static variable

    public static void changeSchool() {
        school = "Senhati Govt. High School";
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student.school = "Senhati High School"; // Access static variable using class name
        System.out.println(Student.school);

        Student.changeSchool(); // Call changeSchool() method

        Student s1 = new Student();
        s1.name = "Sk. Roushan Khalid";

        System.out.println(s1.name);
        System.out.println(Student.school); // Access static variable using class name
        System.out.println(s1.school); // Without accessing static variable
    }
}
