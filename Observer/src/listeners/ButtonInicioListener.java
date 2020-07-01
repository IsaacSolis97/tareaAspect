package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ButtonInicioListener implements EventListener {

	public ButtonInicioListener(/*Button boton,Pane root*/) {
		//this.boton=boton;
		//this.root=root;
		
	}
	
	@Override
	public void update(String eventType, Button boton, Pane root) {
		boton.setOnAction(e -> {});
		
	}

}
