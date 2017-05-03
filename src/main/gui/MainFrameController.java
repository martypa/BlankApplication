package main.gui;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainFrameController implements Initializable, ControlledScreen {
    
    ScreensController myController;


     public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
     
    }

    @FXML
    public Button finishButton;




}
