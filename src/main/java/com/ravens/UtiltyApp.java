package com.ravens;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



    public class UtiltyApp extends Application{
        PassParam pass = new PassParam();
        Button button;
        Button button2;

        public static void main (String[] args) {
            launch(args);


        }

        @Override
        public void start(Stage primaryStage) throws Exception {

            primaryStage.setTitle("Whorley's Utility Application");
            button = new Button();
            button2 = new Button();

            //button.setText("Click Here For Warriors");
            button2.setText(String.valueOf(pass.add(456, 3458)));

            StackPane layout = new StackPane();
            layout.getChildren().addAll(button2);
            //layout.getBackground().getImages().add();

            Scene scene = new Scene(layout, 350, 300);
            primaryStage.setScene(scene);
            primaryStage.show();


        }
    }

