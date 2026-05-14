package ud6.ejemplos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventConsume extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        /***
         * Campo de texto que al presionar las teclas del teclado imprime
         * un mensaje en consola con el ćodigo de tecla pulsada
         ***/
        TextField campoTexto = new TextField();
        campoTexto
                .setOnKeyPressed((KeyEvent evento) -> System.out.println("Se ha pulsado la tecla " + evento.getCode()));

        Scene scene = new Scene(campoTexto, 400, 400);

        /***
         * Filtro de evento que detiene la propagación de un evento de teclado
         * cuando el caracter escrito no es un número
         ***/
        scene.addEventFilter(KeyEvent.KEY_TYPED, e -> {
            if (!Character.isDigit(e.getCharacter().charAt(0)) && e.getCharacter().charAt(0) != '-') {
                e.consume();
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}
