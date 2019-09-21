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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class simple {

    CreatingFiles c = new CreatingFiles();
    ArrayList<Trips> list = new ArrayList<Trips>();
    ArrayList<Trips> list1 = new ArrayList<Trips>();
    int index = 0;

    public simple(CreatingFiles c) {
        this.c = c;
    }

    public Scene get(Stage PrimaryStage) {
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
        Image i10 = new Image(getClass().getResourceAsStream("55.jpg"), 50, 50, false, false);
        Button b3 = new Button();
        b3.setGraphic(new ImageView(i10));
        Image i11 = new Image(getClass().getResourceAsStream("aa.jpg"), 50, 50, false, false);
        Button b4 = new Button();
        b4.setGraphic(new ImageView(i11));
        Image i111 = new Image(getClass().getResourceAsStream("back.png"), 50, 50, false, false);
        Button b31 = new Button();
        b31.setGraphic(new ImageView(i111));

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
        root.setMargin(b31, new Insets(600, 600, 200, 200));
        list = c.getList1();
        list1 = c.getList2();
        T1.setText(list.get(0).getSource());
        T2.setText(list.get(0).getDistination());
        T3.setText(list.get(0).getVehicle());
        T4.setText(list.get(0).getSeats());
        root.getChildren().addAll(BackGround);
        root.getChildren().addAll(T1, T2, T3, T4, l1, l2, l3, l4, b5, b3, b4, b31);
        b31.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                options w = new options(c);

                PrimaryStage.setScene(w.getroot(PrimaryStage));

            }
        });
        b5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                int size = list.size();
                System.out.println("size=" + size + "index=" + index);
                //flag =1;
                if (index >= list.size() - 1) {
                    index = -1;
                }
                index++;
                T1.setText(list.get(index).getSource());
                T2.setText(list.get(index).getDistination());
                T3.setText(list.get(index).getVehicle());
                T4.setText(list.get(index).getSeats());

            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                int size = list.size();
                System.out.println("size=" + size + "index=" + index);

                String x = T4.getText();
                int y = Integer.valueOf(x);
                y = y - 1;
                String z = String.valueOf(y);
                list.get(index).setSeats(z);
                Trips trip1 = new Trips(T1.getText(), T2.getText(), T3.getText(), z);
                list1.add(trip1);
                try {
                    c.save2();
                } catch (IOException ex) {
                    Logger.getLogger(simple.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(simple.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    c.save1();
                } catch (IOException ex) {
                    Logger.getLogger(simple.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(simple.class.getName()).log(Level.SEVERE, null, ex);
                }
               options w = new options(c);

               PrimaryStage.setScene(w.getroot(PrimaryStage));

            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                book b=new book(c);
                PrimaryStage.setScene(b.d(PrimaryStage));
            }
        });
        Scene scene = new Scene(root, 600, 600);

        return scene;
    }
}
