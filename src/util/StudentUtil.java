package util;

import beans.Student;
import main.Config;

public class StudentUtil {
    public static Student fillStudent() {

        String name = MenuUtil.requireName();
            String surname = MenuUtil.requireSurName();
        int age = MenuUtil.requireAge();
        String classname = MenuUtil.requireClassName();
        Student st = new Student(name, surname, classname, age);

        return st;

    }

    public static void printAllRegistration() {

        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i + 1) + "." + st.getFulInfo());
        }
    }

    public static void registrStudents() {

        int count = InputUtil.requireNumber("How many students Registration");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + ".Registration");

            Config.students[i] = StudentUtil.fillStudent();

        }
        System.out.println("Registration completed successful");
        StudentUtil.printAllRegistration();

    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("TYPE NAME , SURNAME , CLASS");

        Student[] tapilanStudentler = findStudents(text);

        for (int i = 0; i < tapilanStudentler.length; i++) {
            System.out.println(tapilanStudentler[i].getFulInfo());
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getSurname().contains(text) || st.getSurname().contains(text) || st.getClassname().contains(text)) {
                count++;
            }


        }

        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getSurname().contains(text) || st.getSurname().contains(text) || st.getClassname().contains(text)) {
                result[found++] = st;
            }
        }
        return result;
    }

    public static void updateUtilStudents() {
        StudentUtil.printAllRegistration();
        int i = InputUtil.requireNumber("necenci telebenin melumatlarin deyismek isdeyirsiz");
        Student s = StudentUtil.fillStudent();
        Config.students[i - 1] = s;
    }

    public static void updateUtilSameStudents() {
        StudentUtil.printAllRegistration();
        int i = InputUtil.requireNumber("necenci telebenin melumatlarin deyismek isdeyirsiz");
        Student s = StudentUtil.fillStudent();
        Config.students[i - 1] = s;

        String changeParam = InputUtil.requireText("deyismek isdediyiniz yeri syazin mes: 'name','surname' ");

        if (changeParam.contains("'name'")) {
            s.setName(MenuUtil.requireName());
        }
        if (changeParam.contains("'surname'")) {
            s.setSurname(MenuUtil.requireSurName());
        }
        if (changeParam.contains("'age'")) {
            s.setAge(MenuUtil.requireAge());
        }
        if (changeParam.contains("'classname'")) {
            s.setClassname(MenuUtil.requireClassName());
        }
    }

    public static void updateUtilSameStudentsSplit() {
        StudentUtil.printAllRegistration();
        int index = InputUtil.requireNumber("necenci telebenin melumatlarin deyismek isdeyirsiz");
        Student s = StudentUtil.fillStudent();
        Config.students[index - 1] = s;

        String changeParam = InputUtil.requireText("deyismek isdediyiniz yeri syazin mes: name,surname");

        String[] parametrs = changeParam.split(",");

        for (int i = 0; i < parametrs.length; i++) {
            String param = parametrs[i];

            if (param.equalsIgnoreCase("name")) {
                s.setName(MenuUtil.requireName());
            } else if (param.equalsIgnoreCase("surname")) {
                s.setSurname(MenuUtil.requireSurName());
            }  else if (param.equalsIgnoreCase("age")) {
                s.setAge(MenuUtil.requireAge());
            }else if (param.equalsIgnoreCase("classname")) {
                s.setClassname(MenuUtil.requireClassName());
            }
        }
    }

}
