package beans;

public class Student {
    private String name;
    private String surname;
    private String classname;
    private int age;

    public Student() {

    }

    public Student(String name, String surname, String classname, int age) {
        this.age = age;
        this.name = name;
        this.classname = classname;
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

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFulInfo(){
        return this.getName()+" "+this.getSurname()+" "+this.getAge()+" "+this.getClassname();
    }
}

