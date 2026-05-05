package ud6;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AppJavaFX extends Application{

    static int contador = 0;
    Button button;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Contenido...
        button = new Button("Púlsame");

        button.setOnAction(e -> respuestaButton());
        Scene scene = new Scene(button, 350, 200);
        stage.setScene(scene);
        stage.setTitle("Botón para pulsar y contar");
        stage.setResizable(false);
        stage.show();
    }

    private void respuestaButton() {
        contador++;
        System.out.println(contador);
        button.setText("Pulsado " + contador + " vez/veces");
    }

}
