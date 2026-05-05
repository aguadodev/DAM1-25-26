package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Controles
        TextField textField = new TextField("Texto inicial...");
        Button button = new Button("Púlsame");
        CheckBox checkBox = new CheckBox("Mostrar por consola");
        Label label = new Label();
        button.setOnAction(e -> {
            if (checkBox.isSelected())
                System.out.println(textField.getText());
            else                  
                label.setText(textField.getText());
        }
    );
        

        // Contenedor (nodo raíz)
        VBox vbox = new VBox(textField, button, checkBox, label);

        // Escena
        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);

        // Escenario / Ventana
        primaryStage.setTitle("Cuadro de texto, botón y etiqueta");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}
