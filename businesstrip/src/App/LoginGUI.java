package App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener{
	Gui gui = new Gui();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (Gui.txtfield.getText().equals(Gui.Username) && Gui.txtfield1.getText().equals(Gui.Password)) {

//          String[] choices = { "taxi", "hotel", "air ticket", "train", "food" };
//          String input = choices[0];
//          System.out.println(input);
      }

      else if (Gui.txtfield.getText().equals(Gui.Username)) {
          System.out.println("Invalid Password!");
      } else if (Gui.txtfield1.getText().equals(Gui.Password)) {
          System.out.println("Invalid Username!");
      } else {
          System.out.println("Invalid Username & Password!");
      }
	}

}
