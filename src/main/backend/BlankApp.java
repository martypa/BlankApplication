package main.backend;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import main.gui.ScreensController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author marty
 */
public class BlankApp extends Application {

    public static String screen1ID = "MainFrame";
    public static String screen1File = "/main/gui/MainFrame.fxml";


    @Override
    public void start(Stage primaryStage) {

        Application.setUserAgentStylesheet(STYLESHEET_MODENA);

        ScreensController mainContainer = new ScreensController();

        mainContainer.loadScreen("MainFrame", "/main/gui/MainFrame.fxml");

        mainContainer.setScreen(this.screen1ID);
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                System.exit(0);
            }

        });

        Main main = new Main(mainContainer);
        main.start();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
