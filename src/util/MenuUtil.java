package util;

public class MenuUtil {
    public static void selectMenu(int menu) {
        switch (menu) {
            case 1:
                StudentUtil.registrStudents();
                break;
            case 2:
                StudentUtil.printAllRegistration();
                break;
            case 3:
                StudentUtil.findStudentsAndPrint();
                break;
            case 4:
                StudentUtil.updateUtilStudents();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
    public  static String requireName(){
        return InputUtil.requireText("enter name");
    }
    public  static String requireSurName(){
        return InputUtil.requireText("enter surname");
    }
    public  static int requireAge(){
        return InputUtil.requireNumber("enter age");
    }
    public  static String requireClassName(){
        return InputUtil.requireText("enter class");

    }
}
