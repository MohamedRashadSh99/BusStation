/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busa;

import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class BusA extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException, FileNotFoundException, ClassNotFoundException {
    CreatingFiles creat = new CreatingFiles();
   
        
         creat.load1();
     
         creat.load2();
        options o = new options(creat);
        primaryStage.setScene(o.getroot(primaryStage));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
    
//         creat.load1();
        //   creat.load2();
        launch(args);
    }

}
