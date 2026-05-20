package ud6.practicas;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EntrenamientoFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(EntrenamientoFX.class.getResource("EntrenamientoVista.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Registro de Entrenamientos");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
    
}
