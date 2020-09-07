package be.jpaSchoolOut.Proj;


import be.jpaSchoolOut.Proj.model.*;
import be.jpaSchoolOut.Proj.model.Module;
import be.jpaSchoolOut.Proj.services.*;

public class Main {

    public static void main(String[] args) {


           /* int mainChoice;
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



                }*/

            UserService userService = new UserService();
            PersonService personService = new PersonService();
            //ModuleService moduleService = new ModuleService();
            //ExamService examService = new ExamService();
            //CourseService courseService = new CourseService();
            
            User user= new User();
            Person person1= new Person();
            Person person2= new Person();
            Person person3= new Person();

            person1.setGender(Gender.FEMALE);
            person1.setFamilyname("Chireddy");
            person1.setFirstname("Lavanya");
            personService.createPerson(person1);

        person2.setGender(Gender.FEMALE);
        person2.setFamilyname("Chireddy");
        person2.setFirstname("Bhavana");
        personService.createPerson(person2);

        person3.setGender(Gender.FEMALE);
        person3.setFamilyname("Lakkireddy");
        person3.setFirstname("Aswath");
        personService.createPerson(person3);

        user.setLogin("BhavanaC");
        user.setActive(true);
        user.setPasswaordhash("Intec123");
        user.setPerson(person2);
        userService.createUser(user);


        user.setLogin("AswathL");
        user.setActive(true);
        user.setPasswaordhash("Intec123");
        user.setPerson(person3);
        userService.createUser(user);

        user.setLogin("LavanyaC");
        user.setActive(true);
        user.setPasswaordhash("Intec123");
        user.setPerson(person1);
        userService.createUser(user);

        System.out.println(userService.getAllUsers());


        }

    }




