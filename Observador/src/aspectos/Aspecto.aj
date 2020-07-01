package aspectos;
import javax.swing.JOptionPane;

import listeners.*;

public aspect Aspecto {
        //pointcut tracedCall():
		//execution(void ButtonBlueListener.update(String,..));
		//call (void listeners..(String,..));
		//after(): tracedCall(){
			//JOptionPane.showMessageDialog(null, "Cambiando color...");
	//}
		
	pointcut tracedCall1():
			execution(void pusblisher.Main.start(..));
			after(): tracedCall1(){
				JOptionPane.showMessageDialog(null, "BIEVENIDO A TU PROGRAMA");
		}
}
