package com.dotsandboxes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DotsAndBoxes extends Application {
   @Override
   public void start(Stage stage) throws Exception {
      Parent root = 
         FXMLLoader.load(getClass().getResource("DotsAndBoxes.fxml"));

      Scene scene = new Scene(root);
      //cannot be resized as the labels don't align properly when moved.
      stage.setResizable(false);
      stage.setTitle("Dots and Boxes"); // displayed in window's title bar
      stage.setScene(scene); // attach scene to stage
      stage.show(); // display the stage
   }

   public static void main(String[] args) {
      // create a DotsAndBoxes object and call its start method
      launch(args); 
   }
}
