package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo3 extends Application {
    TextField txtNumero1, txtNumero2;
    Label lblResultado;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Controles
        txtNumero1 = new TextField();
        txtNumero1.setPromptText("Escribe un número...");
        txtNumero2 = new TextField();
        txtNumero2.setPromptText("Escribe un número...");
        lblResultado = new Label("Aquí se mostrará el resultado...");

        Button btnSumar = new Button("Sumar");

        // Eventos
        btnSumar.setOnAction(e -> mostrarSuma());
        txtNumero1.setOnKeyTyped(e ->  mostrarSuma());
        txtNumero2.setOnKeyTyped(e ->  mostrarSuma());

        VBox root = new VBox(txtNumero1, txtNumero2, btnSumar, lblResultado);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void mostrarSuma() {
        try {
            Double resultado = Double.valueOf(txtNumero1.getText()) + Double.valueOf(txtNumero2.getText());
            lblResultado.setText(resultado.toString());
        } catch (Exception e) {
            lblResultado.setText("Algún número no es válido");
        }

        
    }

    public static void main(String[] args) {
        launch();
    }

}
