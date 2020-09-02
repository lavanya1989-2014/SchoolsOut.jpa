package be.jpaSchoolOut.Proj;


import java.sql.SQLException;

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

    }



}
