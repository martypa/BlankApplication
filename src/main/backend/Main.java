package main.backend;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import main.gui.MainFrameController;
import main.gui.ScreensController;


public class Main {
    
    private ScreensController mainContainer;
    public MainFrameController mainFrameController;




    
    public Main(ScreensController mainContainer){
        this.mainContainer = mainContainer;
        this.mainFrameController = mainContainer.getLoader(BlankApp.screen1ID).getController();
    }
    
    
    public void start(){
        initListener();
    }

    public void initListener(){


        mainFrameController.finishButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });


    }
    
    
}
