package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo4_ColorFondo extends Application{
    VBox vBox;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // En lugar de un TextField y un Button usamos un ChoiceBox
        ChoiceBox<String> cb = new ChoiceBox<>();
        cb.getItems().addAll("black", "green", "red", "white");
        cb.setOnAction(e -> vBox.setStyle("-fx-background-color: " + cb.getValue() + ";"));
        vBox = new VBox(cb);
        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}
