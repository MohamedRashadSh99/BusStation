/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class book  {
    CreatingFiles c =new CreatingFiles();
    ArrayList<Trips> list = new ArrayList<Trips>();
     ArrayList<Trips> list1 = new ArrayList<Trips>();
    int index = 0;

  

   public book(CreatingFiles c) {
        this.c=c;
    }

 public Scene d(Stage PrimaryStage){

Label l1 = new Label("from");
        Label l2 = new Label("to");
        Label l3 = new Label("vichael");
        Label l4 = new Label("seats");
        Label T1 = new Label();
        Label T2 = new Label();
        Label T3 = new Label();
        Label T4 = new Label();

        Image i12 = new Image(getClass().getResourceAsStream("t.jpg"), 50, 50, false, false);
        Button b5 = new Button();
        b5.setGraphic(new ImageView(i12));
        Image i10 = new Image(getClass().getResourceAsStream("back.png"), 50, 50, false, false);
        Button b3 = new Button();
        b3.setGraphic(new ImageView(i10));
       Image i100 = new Image(getClass().getResourceAsStream("de.png"), 50, 50, false, false);
        Button b4 = new Button();
        b4.setGraphic(new ImageView(i100));
        StackPane root = new StackPane();
        Image image = new Image(getClass().getResourceAsStream("11.jpg"), 1200, 1200, false, false);
        ImageView BackGround = new ImageView(image);
        BackGround.setX(0);
        BackGround.setY(0);
        BackGround.setFitHeight(600);
        BackGround.setFitWidth(600);
        BackGround.setPreserveRatio(true);
      //   root.setMargin(l1, new Insets(0, 100, 0, 0));
        //    root.setMargin(T1, new Insets(0, 0, 0, 0));
        //  root.setMargin(b3, new Insets(0, 260, 10, 0));
        //    root.setMargin(l2, new Insets(150, 100, 10, 0));
        //    root.setMargin(T2, new Insets(150, 0, 10, 0));
        //  root.setMargin(b6, new Insets(150, 260, 10, 0));
        root.setMargin(l3, new Insets(300, 100, 10, 0));
        root.setMargin(T3, new Insets(300, 0, 10, 0));
        //  root.setMargin(b9, new Insets(300, 260, 10, 0));
        root.setMargin(l4, new Insets(450, 100, 10, 0));
        root.setMargin(T4, new Insets(450, 0, 10, 0));
        root.setMargin(b3, new Insets(200, 600, 200, 200));
        root.setMargin(b4, new Insets(400, 600, 200, 200));
        root.setMargin(b5, new Insets(0, 600, 200, 200));
        root.setMargin(T1, new Insets(0, 0, 200, 200));
        root.setMargin(l1, new Insets(0, 100, 200, 200));
        root.setMargin(T2, new Insets(100, 0, 200, 200));
        root.setMargin(l2, new Insets(100, 100, 200, 200));
        root.getChildren().addAll(BackGround);
         list = c.getList2();
         list1=c.getList1();
         if(list.size()>0)
         {T1.setText(list.get(0).getSource());
        T2.setText(list.get(0).getDistination());
        T3.setText(list.get(0).getVehicle());
        T4.setText(list.get(0).getSeats());}
         else
             {T1.setText("");
        T2.setText("");
        T3.setText("");
        T4.setText("");}
             
        root.getChildren().addAll(T1, T2, T3, T4, l1, l2, l3, l4, b5, b3);
        b3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                simple w = new simple(c);

                PrimaryStage.setScene(w.get(PrimaryStage));

            }
        });
         b5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                 int size = list.size();
                System.out.println("size=" + size + "index=" + index);
                //flag =1;
                if(size==0)
                {
                     T1.setText("empty");
                }
             else{if (index >= list.size() - 1) {
                    index = -1;
                }
                index++;
                T1.setText(list.get(index).getSource());
                T2.setText(list.get(index).getDistination());
                T3.setText(list.get(index).getVehicle());
                T4.setText(list.get(index).getSeats());
             }
            }

            
        });
    
      
 Scene scene = new Scene(root, 600, 600);

        return scene;
    }
}
