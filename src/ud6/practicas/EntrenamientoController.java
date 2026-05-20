package ud6.practicas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EntrenamientoController {

    @FXML
    private DatePicker dateFecha;

    @FXML
    private ListView<Entrenamiento> lstRegistros;

    @FXML
    private TextField txtKm;

    @FXML
    private TextField txtNombre;


    @FXML
    void addRegistro(ActionEvent event) {
        // Obtener y validar datos de la GUI
        String nombre = txtNombre.getText();
        LocalDate fecha = dateFecha.getValue();
        int km = Integer.parseInt(txtKm.getText());
        
        // Instanciar Entrenamiento
        Entrenamiento e = new Entrenamiento(nombre, fecha, km);

        // Añadirlo a la lista
        lstRegistros.getItems().add(e);

        // Mantener lista ordenada por fecha
        lstRegistros.getItems().sort((e1, e2) -> e1.fecha.compareTo(e2.fecha));        

        // Borrar campos
        txtNombre.clear();
        dateFecha.setValue(null);
        txtKm.clear();
    }

    @FXML
    void abrirFichero(ActionEvent event) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Entrenamientos.dat"))) {
            lstRegistros.getItems().clear();
            ArrayList<Entrenamiento> lista = (ArrayList<Entrenamiento>) in.readObject();
            lstRegistros.getItems().addAll(lista);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    @FXML
    void guardarFichero(ActionEvent event) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Entrenamientos.dat"))) {
            List<Entrenamiento> lista = new ArrayList<>(lstRegistros.getItems());
            out.writeObject(lista);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
