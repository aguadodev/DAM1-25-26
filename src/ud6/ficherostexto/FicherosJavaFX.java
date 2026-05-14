package ud6.ficherostexto;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FicherosJavaFX extends Application {

    @Override
    public void start(Stage stage) {

        FileChooser chooser = new FileChooser();
        chooser.setTitle("Selecciona un archivo");
        chooser.setInitialDirectory(new File("D:\\Oscar\\Programacion\\DAM1-25-26\\"));
        chooser.setInitialFileName("FicheroAGuardar.txt");
        //chooser.setSelectedExtensionFilter(null);

        //File file = chooser.showOpenDialog(null);
        File file = chooser.showSaveDialog(null);

        if (file != null) {
            System.out.println(file.getAbsolutePath());
        }

        // cerrar la app
        javafx.application.Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
