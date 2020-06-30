package pusblisher;

import editor.Autenticator;
import editor.Editor;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import listeners.ButtonBlueListener;
import listeners.ButtonGreenListener;
import listeners.ButtonRedListener;

public class Main extends Application {
	
	@Override
	public void start(Stage arg0) throws Exception {
		//Creo la ventana
		Stage stage = new Stage();
		VBox root = new VBox();
		//Creo los botones
		TextField user=new TextField("Usuario");
		TextField pass=new TextField("Contraseña");
		Button Premium = new Button("Premium");
		Button Bluebt = new Button("Blue");
		Button Redbt = new Button("Red");
		Button Greenbt = new Button("Green");
		//Creo el editor y suscribo los botones a un cada evento
		Editor editor = new Editor();
		//crear el autenticador y llamar a su metodo inicializador
		Autenticator aut=new Autenticator();
		aut.Initializer(user.getText(), pass.getText());
		
        editor.events.subscribe("clickOnBlue", new ButtonBlueListener(/*Bluebt,root*/));
        editor.events.subscribe("clickOnRed", new ButtonRedListener(/*Redbt,root*/));
        editor.events.subscribe("clickOnGreen", new ButtonGreenListener(/*Greenbt,root*/));
        
        try {
        	
        	editor.cambiarColorAzul(Bluebt,root);
        	editor.cambiarColorRojo(Redbt,root);
        	editor.cambiarColorVerde(Greenbt,root);         
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		root.getChildren().addAll(user,pass,Premium,Bluebt,Redbt,Greenbt);
		root.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, 400,400);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
