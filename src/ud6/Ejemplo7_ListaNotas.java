package ud6;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo7_ListaNotas extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lblAlumno = new Label("Alumn@:");
        TextField txtAlumno = new TextField("Pepe");
        Label lblNota = new Label("nota:");
        TextField txtNota = new TextField("7");
        Button btnAdd = new Button("Añadir");
        ListView<Alumno> lstAlumnos = new ListView<>();

        btnAdd.setOnAction(e -> {
            Alumno alumno = new Alumno(txtAlumno.getText(), Integer.parseInt(txtNota.getText()));
            lstAlumnos.getItems().add(alumno);
            lstAlumnos.getItems().sort((a1, a2) -> a1.nombre.compareTo(a2.nombre));
        });


        lstAlumnos.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> System.out.println(newSelection));
        


        VBox vBox = new VBox(lblAlumno, txtAlumno, lblNota, txtNota, btnAdd, lstAlumnos);
        Scene scene = new Scene(vBox);
        lstAlumnos.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> System.out.println("Ratón entrando en la lista..."));
        lstAlumnos.addEventHandler(MouseEvent.MOUSE_EXITED, e -> System.out.println("Ratón saliendo en la lista..."));
        scene.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> System.out.println("Ratón entrando en la escena..."));

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}

class Alumno {
    String nombre;
    int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + " (" + nota + ")";
    }



    
}