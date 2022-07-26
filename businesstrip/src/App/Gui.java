package App;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import java.util.Scanner; // I use scanner because it's command line.
import java.awt.*;
import java.awt.event.*;  

final public class Gui extends JFrame{
	//Scanner input1 = new Scanner(System.in);
//    System.out.println("Enter Username : ");
//    String username = "admin";//input1.next();
    static JTextField txtfield = new JTextField("Nazwa uzytkownika:");
    static JTextField txtfield1 = new JTextField("Haslo:");
    //Scanner input2 = new Scanner(System.in);
//    System.out.println("Enter Password : ");
    //String password = "123";//input2.next();
    static String Username;
    static String Username2;
    static String Password;
    
        public static void main(String[] a) {
        	JButton login = new JButton("Login");
        	LoginGUI log = new LoginGUI();	
            Password = "123";
            Username = "admin";
            Username2 = "user";            
            JFrame frame = new JFrame();
            
            login.addActionListener(log);
            frame.setLayout(new GridLayout(3,1));
    		frame.setSize(300,300);
    		frame.setDefaultLookAndFeelDecorated(true);  
    		
    		frame.getContentPane().add(txtfield);
    		frame.getContentPane().add(txtfield1);// Adds Button to content pane of frame
    		frame.getContentPane().add(login);
    		frame.setVisible(true);
    		


    }

		
}
