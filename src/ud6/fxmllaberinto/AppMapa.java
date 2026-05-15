package ud6.fxmllaberinto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMapa extends Application{

    static Partida partida = new Partida();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Laberinto");
        Parent root = FXMLLoader.load(AppMapa.class.getResource("Laberinto.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        scene.getWindow().sizeToScene();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
