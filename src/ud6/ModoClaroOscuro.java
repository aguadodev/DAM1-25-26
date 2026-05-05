package ud6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ModoClaroOscuro extends Application {

    Scene scene;
    VBox vbox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        ToggleButton toggleButton = new ToggleButton("Modo oscuro");
        toggleButton.setOnAction(e -> {
            toggleButton.setText("Modo claro");
            vbox.setStyle(toggleButton.isSelected() ? "-fx-background-color: black; -fx-text-fill: white;" : "-fx-background-color: white; -fx-text-fill: black;");
        });
        vbox = new VBox(toggleButton);
        scene = new Scene(vbox, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
