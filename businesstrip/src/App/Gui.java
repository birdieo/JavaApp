package App;

import javax.swing.JOptionPane;

import java.util.Scanner; // I use scanner because it's command line.


public class Gui {

        public static void main(String[] a) {
            String Username;
            String Username2;
            String Password;


            Password = "123";
            Username = "admin";
            Username2 = "user";



            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter Username : ");
            String username = input1.next();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Password : ");
            String password = input2.next();


            if (username.equals(Username) && password.equals(Password)) {

                String[] choices = { "taxi", "hotel", "air ticket", "train", "food" };
                String input = (String) JOptionPane.showInputDialog(null, "Receipts",
                        "Reimbursement claim", JOptionPane.QUESTION_MESSAGE, null, // Use
                        // default
                        // icon
                        choices, // Array of choices
                        choices[1]); // Initial choice
                System.out.println(input);
            }

            else if (username.equals(Username)) {
                System.out.println("Invalid Password!");
            } else if (password.equals(Password)) {
                System.out.println("Invalid Username!");
            } else {
                System.out.println("Invalid Username & Password!");
            }


    }
}
