package com.dotsandboxes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class DotsAndBoxesController {

   // GUI controls defined in FXML and used by the controller's code
   //region Buttons
   @FXML
   private Button dot00;

   @FXML
   private Button dot20;

   @FXML
   private Button dot40;

   @FXML
   private Button dot60;

   @FXML
   private Button dot80;

   @FXML
   private Button dot02;

   @FXML
   private Button dot22;

   @FXML
   private Button dot42;

   @FXML
   private Button dot62;

   @FXML
   private Button dot82;

   @FXML
   private Button dot04;

   @FXML
   private Button dot24;

   @FXML
   private Button dot44;

   @FXML
   private Button dot64;

   @FXML
   private Button dot84;

   @FXML
   private Button dot06;

   @FXML
   private Button dot26;

   @FXML
   private Button dot46;

   @FXML
   private Button dot66;

   @FXML
   private Button dot86;

   @FXML
   private Button dot08;

   @FXML
   private Button dot28;

   @FXML
   private Button dot48;

   @FXML
   private Button dot68;

   @FXML
   private Button dot88;
   //endregion

   //region VerticalLabels
   @FXML
   private Label lbl01;

   @FXML
   private Label lbl03;

   @FXML
   private Label lbl05;

   @FXML
   private Label lbl07;

   @FXML
   private Label lbl21;

   @FXML
   private Label lbl23;

   @FXML
   private Label lbl25;

   @FXML
   private Label lbl27;

   @FXML
   private Label lbl41;

   @FXML
   private Label lbl43;

   @FXML
   private Label lbl45;

   @FXML
   private Label lbl47;

   @FXML
   private Label lbl61;

   @FXML
   private Label lbl63;

   @FXML
   private Label lbl65;

   @FXML
   private Label lbl67;

   @FXML
   private Label lbl81;

   @FXML
   private Label lbl83;

   @FXML
   private Label lbl85;

   @FXML
   private Label lbl87;

   //endregion

   //region HorizontalLabels
   @FXML
   private Label lbl10;

   @FXML
   private Label lbl30;

   @FXML
   private Label lbl50;

   @FXML
   private Label lbl70;

   @FXML
   private Label lbl12;

   @FXML
   private Label lbl32;

   @FXML
   private Label lbl52;

   @FXML
   private Label lbl72;

   @FXML
   private Label lbl14;

   @FXML
   private Label lbl34;

   @FXML
   private Label lbl54;

   @FXML
   private Label lbl74;

   @FXML
   private Label lbl16;

   @FXML
   private Label lbl36;

   @FXML
   private Label lbl56;

   @FXML
   private Label lbl76;

   @FXML
   private Label lbl18;

   @FXML
   private Label lbl38;

   @FXML
   private Label lbl58;

   @FXML
   private Label lbl78;

   //endregion

   @FXML
   private void dotClicked(ActionEvent event) {



   }

   // called by FXMLLoader to initialize the controller
   public void initialize() {

      //region InitializeButtons
      initializeButton(dot00);
      initializeButton(dot20);
      initializeButton(dot40);
      initializeButton(dot60);
      initializeButton(dot80);
      initializeButton(dot02);
      initializeButton(dot22);
      initializeButton(dot42);
      initializeButton(dot62);
      initializeButton(dot82);
      initializeButton(dot04);
      initializeButton(dot24);
      initializeButton(dot44);
      initializeButton(dot64);
      initializeButton(dot84);
      initializeButton(dot06);
      initializeButton(dot26);
      initializeButton(dot46);
      initializeButton(dot66);
      initializeButton(dot86);
      initializeButton(dot08);
      initializeButton(dot28);
      initializeButton(dot48);
      initializeButton(dot68);
      initializeButton(dot88);
      //endregion

      //region InitializeVerticalLabels
      initializeVerticalLabel(lbl01);
      initializeVerticalLabel(lbl03);
      initializeVerticalLabel(lbl05);
      initializeVerticalLabel(lbl07);
      initializeVerticalLabel(lbl21);
      initializeVerticalLabel(lbl23);
      initializeVerticalLabel(lbl25);
      initializeVerticalLabel(lbl27);
      initializeVerticalLabel(lbl41);
      initializeVerticalLabel(lbl43);
      initializeVerticalLabel(lbl45);
      initializeVerticalLabel(lbl47);
      initializeVerticalLabel(lbl61);
      initializeVerticalLabel(lbl63);
      initializeVerticalLabel(lbl65);
      initializeVerticalLabel(lbl67);
      initializeVerticalLabel(lbl81);
      initializeVerticalLabel(lbl83);
      initializeVerticalLabel(lbl85);
      initializeVerticalLabel(lbl87);

      //endregion

      //region InitializeHorizontalLabels
      initializeHorizontalLabel(lbl10);
      initializeHorizontalLabel(lbl30);
      initializeHorizontalLabel(lbl50);
      initializeHorizontalLabel(lbl70);
      initializeHorizontalLabel(lbl12);
      initializeHorizontalLabel(lbl32);
      initializeHorizontalLabel(lbl52);
      initializeHorizontalLabel(lbl72);
      initializeHorizontalLabel(lbl14);
      initializeHorizontalLabel(lbl34);
      initializeHorizontalLabel(lbl54);
      initializeHorizontalLabel(lbl74);
      initializeHorizontalLabel(lbl16);
      initializeHorizontalLabel(lbl36);
      initializeHorizontalLabel(lbl56);
      initializeHorizontalLabel(lbl76);
      initializeHorizontalLabel(lbl18);
      initializeHorizontalLabel(lbl38);
      initializeHorizontalLabel(lbl58);
      initializeHorizontalLabel(lbl78);
      //endregion

   }

   private void initializeHorizontalLabel(Label lbl) {
      lbl.setStyle("-fx-background-color: red;");
      GridPane.setHalignment(lbl, HPos.CENTER);
      lbl.setMinWidth(25);
      lbl.setMinHeight(5);
      lbl.setMaxWidth(25);
      lbl.setMaxHeight(5);
   }

   private void initializeVerticalLabel(Label lbl) {
      lbl.setStyle("-fx-background-color: red;");
      GridPane.setHalignment(lbl, HPos.CENTER);
      lbl.setMinWidth(5);
      lbl.setMinHeight(25);
      lbl.setMaxWidth(5);
      lbl.setMaxHeight(25);
   }

   private void initializeButton(Button btn) {
      btn.setMinWidth(25);
      btn.setMinHeight(25);
      btn.setMaxWidth(25);
      btn.setMaxHeight(25);
   }
}
