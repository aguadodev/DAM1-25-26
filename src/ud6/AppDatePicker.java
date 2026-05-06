package ud6;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppDatePicker extends Application {

    Scene scene;
    VBox vbox;
    Label label;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        DatePicker datePicker = new DatePicker();
        datePicker.setOnAction(e -> {
            LocalDate fecha = datePicker.getValue();
            if (fecha.isAfter(LocalDate.now())) {
                long dias = ChronoUnit.DAYS.between(LocalDate.now(), fecha);
                label.setText("Faltan " + dias + " días para la fecha seleccionada.");
            } else {
                label.setText("La fecha seleccionada ya ha pasado.");
            }
        });
        label = new Label("");
        vbox = new VBox(datePicker, label);
        scene = new Scene(vbox, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
