/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busa;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class options {

//ArrayList<String> trans = a.getTrans();
    int index = 0;

   CreatingFiles c =new CreatingFiles();

    public options(CreatingFiles c) {
        this.c=c;
    }
    public Scene getroot(Stage primaryStage)  {
        TextField T1 = new TextField();
        TextField T2 = new TextField();
         T1.setMaxSize(100, 30);
        T2.setMaxSize(100, 30);
        Image image = new Image(getClass().getResourceAsStream("a.jpg"), 1200, 1200, false, false);
        ImageView BackGround = new ImageView(image);
        BackGround.setX(0);
        BackGround.setY(0);
        BackGround.setFitHeight(600);
        BackGround.setFitWidth(600);
        BackGround.setPreserveRatio(true);
        
        Image i10 = new Image(getClass().getResourceAsStream("2.jpg"), 100, 100, false, false);
        Button b3 = new Button();
        b3.setGraphic(new ImageView(i10));
        Image i11 = new Image(getClass().getResourceAsStream("33.jpg"), 100, 100, false, false);
        Button b4 = new Button();
        b4.setGraphic(new ImageView(i11));
        Image i12 = new Image(getClass().getResourceAsStream("44.jpg"), 100, 100, false, false);
        Button b5 = new Button();
        b5.setGraphic(new ImageView(i12));
        
        StackPane root = new StackPane();
        root.setMargin(T1, new Insets(0, 300, 200, 200));
        root.setMargin(T2, new Insets(0, 0, 200, 200));
        root.setMargin(b5, new Insets(300, 300, 200, 200));
        root.setMargin(b4, new Insets(300, 0, 200, 200));
        root.setMargin(b3, new Insets(300, 600, 200, 200));
       
  
    
        root.getChildren().addAll(BackGround, T2, b3, b4, b5,T1);

        
        b3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
             if(T1.getText().equals("a")&&T2.getText().equals("1"))   
             { ma m=new ma(c);
                  primaryStage.setScene(m.get(primaryStage));
            }
            }
        });

        b4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(T1.getText().equals("b")&&T2.getText().equals("2"))    
                { simple m=new simple(c);
                  primaryStage.setScene(m.get(primaryStage));
            }
            }
        });
        b5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(T1.getText().equals("c")&&T2.getText().equals("3"))    
                { 
                dri m=new dri(c);
                  primaryStage.setScene(m.d(primaryStage));
            }}
        });
        Scene scene = new Scene(root, 600, 600);

        return scene;

    }
}
