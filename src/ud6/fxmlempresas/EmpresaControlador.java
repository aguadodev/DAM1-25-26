package ud6.fxmlempresas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

public class EmpresaControlador implements Initializable {

    @FXML
    private ListView<Empresa> lstEmpresas;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtWeb;

    @FXML
    void actualizar(ActionEvent event) {
    }

    @FXML
    void agregar(ActionEvent event) {
        // @TODO Validar valores
        Empresa e = new Empresa(
                Integer.parseInt(txtId.getText()),
                txtNombre.getText(),
                txtWeb.getText());
        // @TODO Comprobar que la empresa no está en la lista
        lstEmpresas.getItems().add(e);
    }

    @FXML
    void borrar(ActionEvent event) {
        Empresa e = new Empresa(Integer.parseInt(txtId.getText()));
        lstEmpresas.getItems().remove(e);
    }

    @FXML
    void guardar(ActionEvent event) {

        FileChooser chooser = new FileChooser();
        chooser.setTitle("Selecciona un archivo");
        chooser.setInitialDirectory(new File("D:\\Oscar\\Programacion\\DAM1-25-26\\"));
        chooser.setInitialFileName("empresas.txt");
        // chooser.setSelectedExtensionFilter(null);

        // File file = chooser.showOpenDialog(null);
        // @TODO anclar a la ventana actual
        File file = chooser.showSaveDialog(null);

        if (file != null) {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(file.getAbsolutePath()))) {
                for (Empresa e : lstEmpresas.getItems()) {
                    out.write(e.toString());
                    out.newLine();
                }
            } catch (Exception e) {

            }

        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lstEmpresas.getItems().addAll(AppEmpresas.empresas);
    }

}
