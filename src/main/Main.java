package main;

import beans.Student;
import util.*;

import java.security.PrivateKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu=0;
        while (true) {  menu=InputUtil.requireNumber("\nwhat do ou want to do ?" +
                "+\n1.Registration students" +
                "+\n2.Show all students" +
                "+\n3.Find students" +
                "+\n4.Update students"+
                "\n5.Exit");

    MenuUtil.selectMenu(menu);






}
    }

}
