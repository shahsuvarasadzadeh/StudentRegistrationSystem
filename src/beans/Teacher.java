package beans;

public class Teacher {
    private String name;
    private String surname;
    private String classname;
    private int age;

    public Teacher() {

    }

    public Teacher(String name, String surname, String classname, int age) {
        this.age = age;
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
