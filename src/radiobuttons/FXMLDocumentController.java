/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobuttons;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author dchen
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    final ToggleGroup group;

    @FXML
    private RadioButton postlatefringe = new RadioButton("POST LATE FRINGE");
    @FXML
    private RadioButton earlymorning = new RadioButton("EARLY MORNING");
    @FXML
    private RadioButton daytime = new RadioButton("DAYTIME");
    @FXML
    private RadioButton earlyfringe = new RadioButton("EARLY FRINGE");
    @FXML
    private RadioButton primeaccess = new RadioButton("PRIME ACCESS");
    @FXML
    private RadioButton primetime = new RadioButton("PRIME TIME");
    @FXML
    private RadioButton latenews = new RadioButton("LATE NEWS");

    boolean rbpl = false, rbem = false, rbdt = false, rbef = false, rbpa = false, rbpt = false, rbln = false;

    public FXMLDocumentController() {
        this.group = new ToggleGroup();
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if (rbpl == true) {
            label.setText("POST LATE FRINGE");
        } else if (rbem == true) {
            label.setText("EARLY MORNING");
        } else if (rbdt == true) {
            label.setText("DAYTIME");
        } else if (rbef == true) {
            label.setText("EARLY FRINGE");
        } else if (rbpa == true) {
            label.setText("PRIME ACCESS");
        } else if (rbpt == true) {
            label.setText("PRIME TIME");
        } else if (rbln == true) {
            label.setText("LATE NEWS");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        postlatefringe.setToggleGroup(group);
        postlatefringe.setUserData("POST LATE FRINGE");
        earlymorning.setToggleGroup(group);
        earlymorning.setUserData("EARLY MORNING");
        daytime.setToggleGroup(group);
        daytime.setUserData("DAYTIME");
        earlyfringe.setToggleGroup(group);
        earlyfringe.setUserData("EARLY FRINGE");
        primeaccess.setToggleGroup(group);
        primeaccess.setUserData("PRIME ACCESS");
        primetime.setToggleGroup(group);
        primetime.setUserData("PRIME TIME");
        latenews.setToggleGroup(group);
        latenews.setUserData("LATE NEWS");

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                if (group.getSelectedToggle() != null) {
                    if (group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("POST LATE FRINGE")) {
                        rbpl = true;
                        rbem = false;
                        rbdt = false;
                        rbef = false;
                        rbpa = false;
                        rbpt = false;
                        rbln = false;
                    } else if (group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("EARLY MORNING")) {
                        rbpl = false;
                        rbem = true;
                        rbdt = false;
                        rbef = false;
                        rbpa = false;
                        rbpt = false;
                        rbln = false;
                    } else if (group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("DAYTIME")) {
                        rbpl = false;
                        rbem = false;
                        rbdt = true;
                        rbef = false;
                        rbpa = false;
                        rbpt = false;
                        rbln = false;
                    } else if (group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("EARLY FRINGE")) {
                        rbpl = false;
                        rbem = false;
                        rbdt = false;
                        rbef = true;
                        rbpa = false;
                        rbpt = false;
                        rbln = false;
                    } else if (group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("PRIME ACCESS")) {
                        rbpl = false;
                        rbem = false;
                        rbdt = false;
                        rbef = false;
                        rbpa = true;
                        rbpt = false;
                        rbln = false;
                    } else if (group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("PRIME TIME")) {
                        rbpl = false;
                        rbem = false;
                        rbdt = false;
                        rbef = false;
                        rbpa = false;
                        rbpt = true;
                        rbln = false;
                    } else if (group.getSelectedToggle().getUserData().toString().equalsIgnoreCase("LATE NEWS")) {
                        rbpl = false;
                        rbem = false;
                        rbdt = false;
                        rbef = false;
                        rbpa = false;
                        rbpt = false;
                        rbln = true;
                    }
                }
            }
        });

    }
}
