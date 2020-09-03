package be.jpaSchoolOut.Proj;


import be.jpaSchoolOut.Proj.model.Couse;
import be.jpaSchoolOut.Proj.model.Exam;
import be.jpaSchoolOut.Proj.model.Person;
import be.jpaSchoolOut.Proj.model.User;
import be.jpaSchoolOut.Proj.services.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        public static void main(String[] args) throws SQLException {
            int mainChoice;
            int subChoice = -1;


            do {
                showMenu();
                mainChoice = requestIntInput(0, 3);

                if (mainChoice != 0) {
                    showSubMenu(mainChoice);
                    subChoice = requestIntInput(0, 10);

                    handleUserChoice(mainChoice, subChoice);
                }
            } while (mainChoice != 0 && subChoice != 0);
        }

        private static void handleUserChoice(int mainChoice, int subChoice) throws SQLException {

            UserService userService = new UserService();
            PersonService personService = new PersonService();
            ModuleService moduleService = new ModuleService();
            ExamService examService = new ExamService();
            CouseService couseService = new CouseService();
            User user= new User();
            Person person= new Person();
            Module module = new Module();
            Exam exam = new Exam();
            Couse couse = new Couse();

            Scanner keyboard = new Scanner(System.in);

           if (mainChoice == 1) { //User table

                if (subChoice == 1) {
                    //adding User


                    System.out.println("Enter user details");

                    System.out.println("login");
                    user.setLogin(keyboard.next());

                    System.out.println("password");
                    user.setPasswaordhash(keyboard.next());

                    System.out.println("state");
                    user.setActive(keyboard.hasNext());

                    user.setPerson(person);

                    userService.createUser(user);
                }

                if(subChoice == 2) {
                    //update user


                    System.out.println("enter which feid u want to update");

                    System.out.println("state");
                    user.setActive(keyboard.hasNext());

                    userService.updateUser(user);

                }

                if(subChoice == 3) {
                    //getuserbyid

                    userService.getUserbyloginname(user.getLogin()) ;
                }

                if(subChoice == 4) {
                    //deleting user

                    userService.delUser(user.getLogin());
                }

                if(subChoice == 5) {
                    //displaying all users

                    List<User> users = userService.getAllUsers();
                    users.forEach(user1 -> System.out.println(user1.getLogin()));
                }



                }

        }

    }



}
