package ud6.ejemplos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXEstilos extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lbl = new Label("Label");
        lbl.setStyle("-fx-text-fill: red;");
        TextField txt = new TextField("Texto");
        Button btn = new Button("Botón");
        //btn.setStyle("-fx-background-color: blue;");
        VBox vBox = new VBox(lbl, txt, btn);


        Scene scene = new Scene(vBox);
        scene.getStylesheets().add("ud6/estilos.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
