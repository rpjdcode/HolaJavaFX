package dad.holamundo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaJava extends Application{
	
	private Label etiqueta;
	private Button boton;
	private TextField campoTexto;
	private VBox root;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Cuadro de texto
		campoTexto = new TextField();
		campoTexto.setPromptText("Introduce un nombre");
		campoTexto.setMaxWidth(150);
		
		// Etiqueta
		etiqueta = new Label();
		etiqueta.setText("Aquí saldrá el saludo");
		
		// Boton
		boton = new Button();
		boton.setText("Saludar");
		boton.setOnAction(e -> onSaludarButtonAction(e));
		boton.setDefaultButton(true);
		
		// Panel con disposición vertical
		root = new VBox();
		root.setSpacing(15);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(campoTexto, etiqueta, boton);
		
		// Creamos la escena
		Scene escena = new Scene(root, 320, 200);
		
		// Configuramos la ventana
		primaryStage.setTitle("Hola Mundo mejorado");
		primaryStage.setScene(escena);
		primaryStage.show();
		
	}
	
	private void onSaludarButtonAction(ActionEvent e) {
		String nombre = campoTexto.getText();
		etiqueta.setText("¡¡¡Hola " + nombre + "!!!");
		etiqueta.setStyle("-fx-text-fill: red; -fx-font: bold 40 consolas;");
		boton.setStyle("-fx-border-color: yellow;");
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
