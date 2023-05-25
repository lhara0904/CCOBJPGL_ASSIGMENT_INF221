package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.*;

public class friendController {

    @FXML
    Button cessBtn, loloBtn, tentenBtn, terterBtn, bugoyBtn;

    Cess te = new Cess();
    Lolo tin = new Lolo();
    Bugoy goy = new Bugoy();
    Terter ter = new Terter();
    Tenten ten = new Tenten();

    public void initialize() {

        te.setRating("wow");
        te.setTaste("Maganda");

        tin.setRating("sheesh");
        tin.setTaste("Pogi");

        goy.setRating("is tall");
        goy.setTaste("Pogi");

        ter.setRating("pogi");
        ter.setTaste("laki mo");

        ten.setRating("shish ");
        ten.setTaste("Pogi");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(cessBtn)) {
            alert.setContentText("Cess " + te.getRating() + " and " + te.getTaste());
        }

        if (sourceButton == loloBtn) {
            alert.setContentText("Tenten" + tin.getRating() + " and " + tin.getTaste());
        }

        if (sourceButton == tentenBtn) {
            alert.setContentText("Lolo " + goy.getRating() + " and " + goy.getTaste());
        }

        if (sourceButton == terterBtn) {
            alert.setContentText("Terter " + ter.getRating() + " and " + ter.getTaste());
        }

        if (sourceButton == bugoyBtn) {
            alert.setContentText("Bugoy " + ten.getRating() + " and " + ten.getTaste());
        }

        alert.showAndWait();

    }

}
