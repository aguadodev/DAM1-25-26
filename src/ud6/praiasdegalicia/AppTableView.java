package ud6.praiasdegalicia;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppTableView extends Application {
    static Praia[] praias;
    public static void main(String[] args) {
        // Carga las playas desde el fichero JSON en un array de Praias
        praias = Util.importarPraias("praias.json");

        // TODO Resuelve el problema propuesto
        // ...
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        TableView<Praia> tableView = new TableView<>();
        ObservableList<Praia> lista = FXCollections.observableArrayList(praias);
        tableView.setItems(lista);
        tableView.getItems().addAll(praias);
        // Añadir columnas a la tabla
        TableColumn<Praia, String> nameColumn = new TableColumn<>("Nombre");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>(praias[0].getClass().getDeclaredFields()[1].getName()));
        TableColumn<Praia, String> locationColumn = new TableColumn<>("Concello");
        locationColumn.setCellValueFactory(new PropertyValueFactory<>(praias[0].getClass().getDeclaredFields()[2].getName()));
        TableColumn<Praia, String> tresColumn = new TableColumn<>("Provincia");
        tresColumn.setCellValueFactory(new PropertyValueFactory<>(praias[0].getClass().getDeclaredFields()[3].getName()));
        tableView.getColumns().setAll(nameColumn, locationColumn, tresColumn);

        Parent root = new VBox(tableView);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
