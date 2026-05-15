package ud6.fxmllaberinto;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class LaberintoController implements Initializable {

    @FXML
    private VBox vBox;

    private GridPane gridPane = new GridPane();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int[][] mapa = AppMapa.partida.mapa;

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                Label lbl = new Label();
                
                if (i == AppMapa.partida.posInicio[0] && j == AppMapa.partida.posInicio[1])
                    lbl.setStyle("-fx-background-color: red;");
                else if (mapa[i][j] == 1) {
                    lbl.setStyle("-fx-background-color: navy;");
                }
                lbl.setPrefSize(50, 50);

                //lbl.setOnMouseClicked(e -> lbl.setStyle("-fx-background-color: red;"));

                gridPane.add(lbl, j, i);
            }
        }

        vBox.getChildren().add(gridPane);
    }

    @FXML
    void mover(KeyEvent e) {
        switch (e.getCharacter()) {
            default:
                System.out.println(e.getCharacter());
        }
    }    

}
