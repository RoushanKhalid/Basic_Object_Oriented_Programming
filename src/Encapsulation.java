class Human {
    private String myName;
    private int myAge;
    private String herName;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getHerName() {
        return herName;
    }

    public void setHerName(String herName) {
        this.herName = herName;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();

        h1.setMyName("Khalid");
        h1.setMyAge(23);
        h1.setHerName("Prima");

        System.out.println("My Name: " + h1.getMyName());
        System.out.println("My Age: " + h1.getMyAge());
        System.out.println("Her Name: " + h1.getHerName());
    }
}
// https://www.youtube.com/watch?v=YbqneqDIZh8