class StaticStudent {
    String name;
    static String school; // Declare static variable

    public static void changeSchool() {
        school = "Senhati Govt. High School";
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        StaticStudent.school = "Senhati High School"; // Access static variable using class name
        System.out.println(StaticStudent.school);

        StaticStudent.changeSchool(); // Call changeSchool() method

        StaticStudent s1 = new StaticStudent();
        s1.name = "Sk. Roushan Khalid";

        System.out.println(s1.name);
        System.out.println(StaticStudent.school); // Access static variable using class name
        System.out.println(s1.school); // Without accessing static variable
    }
}
