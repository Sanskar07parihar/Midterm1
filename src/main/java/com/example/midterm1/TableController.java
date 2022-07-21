package com.example.midterm1;

import com.example.midterm1.Student;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class TableController implements Initializable {

    @FXML
    private TableColumn<Student, Integer> studentcol;

    @FXML
    private TableColumn<Student, String> firstnamecol;

    @FXML
    private TableColumn<Student, String> gendercol;

    @FXML
    private TableColumn<Student, String> lastnamecol;

    @FXML
    private TableColumn<Student, String> majorcol;

    @FXML
    private TableColumn<Student, String> provincecol;

    @FXML
    private TableColumn<Student, Integer> avggradecol;
    @FXML
    private TableColumn<Student, String> telephonecol;
    @FXML
    private TableView<Student> Tableview;
    @FXML
    private Label label;
    @FXML
    private ComboBox<String> comboboxid;
    @FXML
    private Button buttonid;

    public void initialize(URL url, ResourceBundle resourceBundle) {

        firstnamecol.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        lastnamecol.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        majorcol.setCellValueFactory(new PropertyValueFactory<>("major_code"));
        gendercol.setCellValueFactory(new PropertyValueFactory<>("gender"));
        avggradecol.setCellValueFactory(new PropertyValueFactory<>("average_grade"));
        provincecol.setCellValueFactory(new PropertyValueFactory<>("province"));
        studentcol.setCellValueFactory(new PropertyValueFactory<>("student_number"));
        telephonecol.setCellValueFactory(new PropertyValueFactory<>("telephone_number"));
        Tableview.getItems().addAll(Dbutility.getStudentsFromDB());
        label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
        List<String> provincename= Arrays.asList("AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT");

        comboboxid.getItems().addAll(provincename);
        label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));

        comboboxid.valueProperty().addListener((obs, oldValue, newValue) -> {
            switch (newValue) {
                case "AB" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("AB"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "BC" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("BC"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "MB" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("MB"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NB" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("NB"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NL" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("NL"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NS" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("NS"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NT" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("NT"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "NU" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("NU"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "ON" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("ON"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "PE" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("PE"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "QC" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("QC"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "SK" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("SK"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
                case "YT" -> {
                    Tableview.getItems().clear();
                    Tableview.getItems().addAll(Dbutility.getStudentsByProvince("YT"));
                    label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
                }
            }
        });
        buttonid.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Tableview.getItems().clear();
                Tableview.getItems().addAll(Dbutility.getStudentsFromDB());
                label.setText("Number Of Students: " + String.valueOf(Tableview.getItems().size()));
            }
        });
    }
}

