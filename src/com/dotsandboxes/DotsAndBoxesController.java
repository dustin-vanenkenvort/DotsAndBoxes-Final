package com.dotsandboxes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.awt.event.*;


public class DotsAndBoxesController {

   // GUI controls defined in FXML and used by the controller's code
   // Seperated into regions as they're several values defined.

   //region Buttons
   @FXML
   private Button dot00;
   private boolean flag00;
   @FXML
   private Button dot20;
   private boolean flag20;
   @FXML
   private Button dot40;
   private boolean flag40;
   @FXML
   private Button dot60;
   private boolean flag60;
   @FXML
   private Button dot80;
   private boolean flag80;
   @FXML
   private Button dot02;
   private boolean flag02;
   @FXML
   private Button dot22;
   private boolean flag22;
   @FXML
   private Button dot42;
   private boolean flag42;
   @FXML
   private Button dot62;
   private boolean flag62;
   @FXML
   private Button dot82;
   private boolean flag82;
   @FXML
   private Button dot04;
   private boolean flag04;
   @FXML
   private Button dot24;
   private boolean flag24;
   @FXML
   private Button dot44;
   private boolean flag44;
   @FXML
   private Button dot64;
   private boolean flag64;
   @FXML
   private Button dot84;
   private boolean flag84;
   @FXML
   private Button dot06;
   private boolean flag06;
   @FXML
   private Button dot26;
   private boolean flag26;
   @FXML
   private Button dot46;
   private boolean flag46;
   @FXML
   private Button dot66;
   private boolean flag66;
   @FXML
   private Button dot86;
   private boolean flag86;
   @FXML
   private Button dot08;
   private boolean flag08;
   @FXML
   private Button dot28;
   private boolean flag28;
   @FXML
   private Button dot48;
   private boolean flag48;
   @FXML
   private Button dot68;
   private boolean flag68;
   @FXML
   private Button dot88;
   private boolean flag88;

   //endregion
   Button [] buttons = {dot00, dot02, dot04, dot06, dot08, dot20, dot22, dot24, dot26, dot28, dot40, dot42, dot44, dot46, dot48, dot60, dot62, dot64, dot66, dot68, dot80, dot82, dot84, dot86, dot88};
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
   private Label lblPlayerOne;

   @FXML
   private Label lblPlayerOneScore;

   @FXML
   private Label lblPlayerTwo;

   @FXML
   private Label lblPlayerTwoScore;

   private boolean player = true;

//   private void mousePressed(MouseEvent ev) {
//      dot02.setStyle("-fx-background-color: black;");
//   }
   @FXML
   private void dotClicked(ActionEvent event) {
      Game game = new Game();
      if(event.getSource() == dot00) {
         dot00.setStyle("-fx-background-color: black;");
         flag00 =true;
         if(flag20 == true && player == true){
            lbl10.setStyle("-fx-background-color: blue;");
            dot00.setStyle("-fx-background-color: grey;");
            dot20.setStyle("-fx-background-color: grey;");
            flag00 = false;
            flag20 = false;
            player= false;
         }else if(flag20 == true && player == false) {
            lbl10.setStyle("-fx-background-color: red;");
            dot00.setStyle("-fx-background-color: grey;");
            dot20.setStyle("-fx-background-color: grey;");
            flag00 = false;
            flag20 = false;
            player= true;
         }else if(flag02 == true && player == true){
            lbl01.setStyle("-fx-background-color: blue;");
            dot00.setStyle("-fx-background-color: grey;");
            dot02.setStyle("-fx-background-color: grey;");
            flag00 = false;
            flag02 = false;
            player=false;
         }else if(flag02 == true && player == false){
            lbl01.setStyle("-fx-background-color: red;");
            dot00.setStyle("-fx-background-color: grey;");
            dot02.setStyle("-fx-background-color: grey;");
            flag00 = false;
            flag02 = false;
            player=true;
         }
      }else if(event.getSource() == dot02) {
         dot02.setStyle("-fx-background-color: black;");
         flag02 =true;
         if(flag00 == true && player == true){
            lbl01.setStyle("-fx-background-color: blue;");
            dot02.setStyle("-fx-background-color: grey;");
            dot00.setStyle("-fx-background-color: grey;");
            flag02 = false;
            flag00 = false;
            player= false;
         }else if(flag00 == true && player == false) {
            lbl01.setStyle("-fx-background-color: red;");
            dot02.setStyle("-fx-background-color: grey;");
            dot00.setStyle("-fx-background-color: grey;");
            flag02 = false;
            flag00 = false;
            player= true;
         }else if(flag22 == true && player == true){
            lbl12.setStyle("-fx-background-color: blue;");
            dot02.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag02 = false;
            flag22 = false;
            player=false;
         }else if(flag22 == true && player == false){
            lbl12.setStyle("-fx-background-color: red;");
            dot02.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag02 = false;
            flag22 = false;
            player=true;
         }else if(flag04 == true && player == true){
            lbl03.setStyle("-fx-background-color: blue;");
            dot02.setStyle("-fx-background-color: grey;");
            dot04.setStyle("-fx-background-color: grey;");
            flag02 = false;
            flag04 = false;
            player=false;
         }else if(flag04 == true && player == false){
            lbl03.setStyle("-fx-background-color: red;");
            dot02.setStyle("-fx-background-color: grey;");
            dot04.setStyle("-fx-background-color: grey;");
            flag02 = false;
            flag04 = false;
            player=true;
         }
      }else if(event.getSource() == dot04) {
         dot04.setStyle("-fx-background-color: black;");
         flag04 =true;
         if(flag02 == true && player == true){
            lbl03.setStyle("-fx-background-color: blue;");
            dot04.setStyle("-fx-background-color: grey;");
            dot02.setStyle("-fx-background-color: grey;");
            flag04 = false;
            flag02 = false;
            player= false;
         }else if(flag02 == true && player == false) {
            lbl03.setStyle("-fx-background-color: red;");
            dot04.setStyle("-fx-background-color: grey;");
            dot02.setStyle("-fx-background-color: grey;");
            flag04 = false;
            flag02 = false;
            player= true;
         }else if(flag24 == true && player == true){
            lbl14.setStyle("-fx-background-color: blue;");
            dot04.setStyle("-fx-background-color: grey;");
            dot24.setStyle("-fx-background-color: grey;");
            flag04 = false;
            flag24 = false;
            player=false;
         }else if(flag24 == true && player == false){
            lbl14.setStyle("-fx-background-color: red;");
            dot04.setStyle("-fx-background-color: grey;");
            dot24.setStyle("-fx-background-color: grey;");
            flag04 = false;
            flag24 = false;
            player=true;
         }else if(flag06 == true && player == true){
            lbl05.setStyle("-fx-background-color: blue;");
            dot04.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag04 = false;
            flag06 = false;
            player=false;
         }else if(flag06 == true && player == false){
            lbl05.setStyle("-fx-background-color: red;");
            dot04.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag04 = false;
            flag06 = false;
            player=true;
         }
      }else if(event.getSource() == dot06) {
         dot06.setStyle("-fx-background-color: black;");
         flag06 =true;
         if(flag04 == true && player == true){
            lbl05.setStyle("-fx-background-color: blue;");
            dot06.setStyle("-fx-background-color: grey;");
            dot04.setStyle("-fx-background-color: grey;");
            flag06 = false;
            flag04 = false;
            player= false;
         }else if(flag04 == true && player == false) {
            lbl05.setStyle("-fx-background-color: red;");
            dot06.setStyle("-fx-background-color: grey;");
            dot04.setStyle("-fx-background-color: grey;");
            flag06 = false;
            flag04 = false;
            player = true;
         }else if(flag26 == true && player == true){
            lbl16.setStyle("-fx-background-color: blue;");
            dot06.setStyle("-fx-background-color: grey;");
            dot26.setStyle("-fx-background-color: grey;");
            flag06 = false;
            flag26 = false;
            player= false;
         }else if(flag26 == true && player == false) {
            lbl16.setStyle("-fx-background-color: red;");
            dot06.setStyle("-fx-background-color: grey;");
            dot26.setStyle("-fx-background-color: grey;");
            flag06 = false;
            flag26 = false;
            player = true;
         }else if(flag08 == true && player == true){
            lbl07.setStyle("-fx-background-color: blue;");
            dot06.setStyle("-fx-background-color: grey;");
            dot08.setStyle("-fx-background-color: grey;");
            flag06 = false;
            flag08 = false;
            player= false;
         }else if(flag08 == true && player == false) {
            lbl07.setStyle("-fx-background-color: blue;");
            dot06.setStyle("-fx-background-color: grey;");
            dot08.setStyle("-fx-background-color: grey;");
            flag06 = false;
            flag08 = false;
            player= true;
         }
      }else if(event.getSource() == dot08) {
         dot08.setStyle("-fx-background-color: black;");
         flag08 =true;
         if(flag06 == true && player == true){
            lbl07.setStyle("-fx-background-color: blue;");
            dot08.setStyle("-fx-background-color: grey;");
            dot06.setStyle("-fx-background-color: grey;");
            flag08 = false;
            flag06 = false;
            player= false;
         }else if(flag06 == true && player == false) {
            lbl07.setStyle("-fx-background-color: blue;");
            dot08.setStyle("-fx-background-color: grey;");
            dot06.setStyle("-fx-background-color: grey;");
            flag08 = false;
            flag06 = false;
            player= true;
         }else if(flag28 == true && player == true){
            lbl18.setStyle("-fx-background-color: blue;");
            dot08.setStyle("-fx-background-color: grey;");
            dot28.setStyle("-fx-background-color: grey;");
            flag08 = false;
            flag28 = false;
            player= false;
         }else if(flag28 == true && player == false) {
            lbl18.setStyle("-fx-background-color: blue;");
            dot08.setStyle("-fx-background-color: grey;");
            dot28.setStyle("-fx-background-color: grey;");
            flag08 = false;
            flag28 = false;
            player= true;
         }
      }else if(event.getSource() == dot20) {
         dot20.setStyle("-fx-background-color: black;");
         flag20 =true;
         if(flag00 == true && player == true){
            lbl10.setStyle("-fx-background-color: blue;");
            dot20.setStyle("-fx-background-color: grey;");
            dot00.setStyle("-fx-background-color: grey;");
            flag20 = false;
            flag00 = false;
            player= false;
         }else if(flag00 == true && player == false) {
            lbl10.setStyle("-fx-background-color: blue;");
            dot20.setStyle("-fx-background-color: grey;");
            dot00.setStyle("-fx-background-color: grey;");
            flag20 = false;
            flag00 = false;
            player= true;
         }else if(flag22 == true && player == true){
            lbl21.setStyle("-fx-background-color: blue;");
            dot20.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag20 = false;
            flag22 = false;
            player= false;
         }else if(flag22 == true && player == false) {
            lbl21.setStyle("-fx-background-color: blue;");
            dot20.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag20 = false;
            flag22 = false;
            player= true;
         }else if(flag40 == true && player == true){
            lbl30.setStyle("-fx-background-color: blue;");
            dot20.setStyle("-fx-background-color: grey;");
            dot40.setStyle("-fx-background-color: grey;");
            flag20 = false;
            flag40 = false;
            player= false;
         }else if(flag40 == true && player == false) {
            lbl30.setStyle("-fx-background-color: blue;");
            dot20.setStyle("-fx-background-color: grey;");
            dot40.setStyle("-fx-background-color: grey;");
            flag20 = false;
            flag40 = false;
            player= true;
         }
      }else if(event.getSource() == dot22) {
         dot22.setStyle("-fx-background-color: black;");
         flag22 =true;
         if(flag20 == true && player == true){
            lbl21.setStyle("-fx-background-color: blue;");
            dot22.setStyle("-fx-background-color: grey;");
            dot20.setStyle("-fx-background-color: grey;");
            flag22 = false;
            flag20 = false;
            player= false;
         }else if(flag20 == true && player == false) {
            lbl21.setStyle("-fx-background-color: blue;");
            dot22.setStyle("-fx-background-color: grey;");
            dot20.setStyle("-fx-background-color: grey;");
            flag22 = false;
            flag20 = false;
            player= true;
         }else if(flag42 == true && player == true){
            lbl32.setStyle("-fx-background-color: blue;");
            dot22.setStyle("-fx-background-color: grey;");
            dot42.setStyle("-fx-background-color: grey;");
            flag22 = false;
            flag42 = false;
            player= false;
         }else if(flag42 == true && player == false) {
            lbl32.setStyle("-fx-background-color: blue;");
            dot22.setStyle("-fx-background-color: grey;");
            dot42.setStyle("-fx-background-color: grey;");
            flag22 = false;
            flag42 = false;
            player= true;
         }else if(flag24 == true && player == true){
            lbl23.setStyle("-fx-background-color: blue;");
            dot22.setStyle("-fx-background-color: grey;");
            dot24.setStyle("-fx-background-color: grey;");
            flag22 = false;
            flag24 = false;
            player= false;
         }else if(flag24 == true && player == false) {
            lbl23.setStyle("-fx-background-color: blue;");
            dot22.setStyle("-fx-background-color: grey;");
            dot24.setStyle("-fx-background-color: grey;");
            flag22 = false;
            flag24 = false;
            player= true;
         }else if(flag02 == true && player == true){
            lbl12.setStyle("-fx-background-color: blue;");
            dot22.setStyle("-fx-background-color: grey;");
            dot02.setStyle("-fx-background-color: grey;");
            flag22 = false;
            flag02 = false;
            player= false;
         }else if(flag02 == true && player == false) {
            lbl12.setStyle("-fx-background-color: blue;");
            dot22.setStyle("-fx-background-color: grey;");
            dot02.setStyle("-fx-background-color: grey;");
            flag22 = false;
            flag02 = false;
            player= true;
         }
      }else if(event.getSource() == dot24) {
         dot24.setStyle("-fx-background-color: black;");
         flag24 =true;
         if(flag22 == true && player == true){
            lbl23.setStyle("-fx-background-color: blue;");
            dot24.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag24 = false;
            flag22 = false;
            player= false;
         }else if(flag22 == true && player == false) {
            lbl23.setStyle("-fx-background-color: blue;");
            dot24.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag24 = false;
            flag22 = false;
            player= true;
         }else if(flag44 == true && player == true){
            lbl34.setStyle("-fx-background-color: blue;");
            dot24.setStyle("-fx-background-color: grey;");
            dot44.setStyle("-fx-background-color: grey;");
            flag24 = false;
            flag44 = false;
            player= false;
         }else if(flag44 == true && player == false) {
            lbl34.setStyle("-fx-background-color: blue;");
            dot24.setStyle("-fx-background-color: grey;");
            dot44.setStyle("-fx-background-color: grey;");
            flag24 = false;
            flag44 = false;
            player= true;
         }else if(flag26 == true && player == true){
            lbl25.setStyle("-fx-background-color: blue;");
            dot24.setStyle("-fx-background-color: grey;");
            dot26.setStyle("-fx-background-color: grey;");
            flag24 = false;
            flag26 = false;
            player= false;
         }else if(flag26 == true && player == false) {
            lbl25.setStyle("-fx-background-color: blue;");
            dot24.setStyle("-fx-background-color: grey;");
            dot26.setStyle("-fx-background-color: grey;");
            flag24 = false;
            flag26 = false;
            player= true;
         }else if(flag04 == true && player == true){
            lbl14.setStyle("-fx-background-color: blue;");
            dot24.setStyle("-fx-background-color: grey;");
            dot04.setStyle("-fx-background-color: grey;");
            flag24 = false;
            flag04 = false;
            player= false;
         }else if(flag04 == true && player == false) {
            lbl14.setStyle("-fx-background-color: blue;");
            dot24.setStyle("-fx-background-color: grey;");
            dot04.setStyle("-fx-background-color: grey;");
            flag24 = false;
            flag04 = false;
            player= false;
            player= true;
         }
      }else if(event.getSource() == dot26) {
         dot26.setStyle("-fx-background-color: black;");
         flag26 =true;
         if(flag24 == true && player == true){
            lbl25.setStyle("-fx-background-color: blue;");
            dot26.setStyle("-fx-background-color: grey;");
            dot24.setStyle("-fx-background-color: grey;");
            flag26 = false;
            flag24 = false;
            player= false;
         }else if(flag24 == true && player == false) {
            lbl25.setStyle("-fx-background-color: blue;");
            dot26.setStyle("-fx-background-color: grey;");
            dot24.setStyle("-fx-background-color: grey;");
            flag26 = false;
            flag24 = false;
            player= true;
         }else if(flag46 == true && player == true){
            lbl36.setStyle("-fx-background-color: blue;");
            dot26.setStyle("-fx-background-color: grey;");
            dot46.setStyle("-fx-background-color: grey;");
            flag26 = false;
            flag46 = false;
            player= false;
         }else if(flag46 == true && player == false) {
            lbl36.setStyle("-fx-background-color: blue;");
            dot26.setStyle("-fx-background-color: grey;");
            dot46.setStyle("-fx-background-color: grey;");
            flag26 = false;
            flag46 = false;
            player= true;
         }else if(flag28 == true && player == true){
            lbl27.setStyle("-fx-background-color: blue;");
            dot26.setStyle("-fx-background-color: grey;");
            dot28.setStyle("-fx-background-color: grey;");
            flag26 = false;
            flag28 = false;
            player= false;
         }else if(flag28 == true && player == false) {
            lbl27.setStyle("-fx-background-color: blue;");
            dot26.setStyle("-fx-background-color: grey;");
            dot28.setStyle("-fx-background-color: grey;");
            flag26 = false;
            flag28 = false;
            player= true;
         }else if(flag06 == true && player == true){
            lbl16.setStyle("-fx-background-color: blue;");
            dot26.setStyle("-fx-background-color: grey;");
            dot06.setStyle("-fx-background-color: grey;");
            flag26 = false;
            flag06 = false;
            player= false;
         }else if(flag06 == true && player == false) {
            lbl16.setStyle("-fx-background-color: blue;");
            dot26.setStyle("-fx-background-color: grey;");
            dot06.setStyle("-fx-background-color: grey;");
            flag26 = false;
            flag06 = false;
            player= true;
         }
      }else if(event.getSource() == dot28) {
         dot28.setStyle("-fx-background-color: black;");
         flag28 =true;
         if(flag26 == true && player == true){
            lbl27.setStyle("-fx-background-color: blue;");
            dot28.setStyle("-fx-background-color: grey;");
            dot26.setStyle("-fx-background-color: grey;");
            flag28 = false;
            flag26 = false;
            player= false;
         }else if(flag26 == true && player == false) {
            lbl27.setStyle("-fx-background-color: blue;");
            dot28.setStyle("-fx-background-color: grey;");
            dot26.setStyle("-fx-background-color: grey;");
            flag28 = false;
            flag26 = false;
            player= true;
         }else if(flag48 == true && player == true){
            lbl38.setStyle("-fx-background-color: blue;");
            dot28.setStyle("-fx-background-color: grey;");
            dot48.setStyle("-fx-background-color: grey;");
            flag28 = false;
            flag48 = false;
            player= false;
         }else if(flag48 == true && player == false) {
            lbl38.setStyle("-fx-background-color: blue;");
            dot28.setStyle("-fx-background-color: grey;");
            dot48.setStyle("-fx-background-color: grey;");
            flag28 = false;
            flag48 = false;
            player= true;
         }else if(flag08 == true && player == true){
            lbl18.setStyle("-fx-background-color: blue;");
            dot28.setStyle("-fx-background-color: grey;");
            dot08.setStyle("-fx-background-color: grey;");
            flag28 = false;
            flag08 = false;
            player= false;
         }else if(flag08 == true && player == false) {
            lbl18.setStyle("-fx-background-color: blue;");
            dot28.setStyle("-fx-background-color: grey;");
            dot08.setStyle("-fx-background-color: grey;");
            flag28 = false;
            flag08 = false;
            player= true;
         }
      }else if(event.getSource() == dot40) {
         dot40.setStyle("-fx-background-color: black;");
         flag40 =true;
         if(flag60 == true && player == true){
            lbl50.setStyle("-fx-background-color: blue;");
            dot40.setStyle("-fx-background-color: grey;");
            dot60.setStyle("-fx-background-color: grey;");
            flag40 = false;
            flag60 = false;
            player= false;
         }else if(flag60 == true && player == false) {
            lbl50.setStyle("-fx-background-color: blue;");
            dot40.setStyle("-fx-background-color: grey;");
            dot60.setStyle("-fx-background-color: grey;");
            flag40 = false;
            flag60 = false;
            player= true;
         }else if(flag42 == true && player == true){
            lbl41.setStyle("-fx-background-color: blue;");
            dot40.setStyle("-fx-background-color: grey;");
            dot42.setStyle("-fx-background-color: grey;");
            flag40 = false;
            flag42 = false;
            player= false;
         }else if(flag42 == true && player == false) {
            lbl41.setStyle("-fx-background-color: blue;");
            dot40.setStyle("-fx-background-color: grey;");
            dot42.setStyle("-fx-background-color: grey;");
            flag40 = false;
            flag42 = false;
            player= true;
         }else if(flag20 == true && player == true){
            lbl30.setStyle("-fx-background-color: blue;");
            dot40.setStyle("-fx-background-color: grey;");
            dot20.setStyle("-fx-background-color: grey;");
            flag40 = false;
            flag20 = false;
            player= false;
         }else if(flag20 == true && player == false) {
            lbl30.setStyle("-fx-background-color: blue;");
            dot40.setStyle("-fx-background-color: grey;");
            dot20.setStyle("-fx-background-color: grey;");
            flag40 = false;
            flag20 = false;
            player= true;
         }
      }else if(event.getSource() == dot42) {
         dot42.setStyle("-fx-background-color: black;");
         flag42 =true;
         if(flag40== true && player == true){
            lbl41.setStyle("-fx-background-color: blue;");
            dot42.setStyle("-fx-background-color: grey;");
            dot40.setStyle("-fx-background-color: grey;");
            flag42 = false;
            flag40 = false;
            player= false;
         }else if(flag40 == true && player == false) {
            lbl41.setStyle("-fx-background-color: blue;");
            dot42.setStyle("-fx-background-color: grey;");
            dot40.setStyle("-fx-background-color: grey;");
            flag42 = false;
            flag40 = false;
            player= true;
         }else if(flag62== true && player == true){
            lbl52.setStyle("-fx-background-color: blue;");
            dot42.setStyle("-fx-background-color: grey;");
            dot62.setStyle("-fx-background-color: grey;");
            flag42 = false;
            flag62 = false;
            player= false;
         }else if(flag62 == true && player == false) {
            lbl52.setStyle("-fx-background-color: blue;");
            dot42.setStyle("-fx-background-color: grey;");
            dot62.setStyle("-fx-background-color: grey;");
            flag42 = false;
            flag62 = false;
            player= true;
         }else if(flag44== true && player == true){
            lbl43.setStyle("-fx-background-color: blue;");
            dot42.setStyle("-fx-background-color: grey;");
            dot44.setStyle("-fx-background-color: grey;");
            flag42 = false;
            flag44 = false;
            player= false;
         }else if(flag44 == true && player == false) {
            lbl43.setStyle("-fx-background-color: blue;");
            dot42.setStyle("-fx-background-color: grey;");
            dot44.setStyle("-fx-background-color: grey;");
            flag42 = false;
            flag44 = false;
            player= true;
         }else if(flag22== true && player == true){
            lbl32.setStyle("-fx-background-color: blue;");
            dot42.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag42 = false;
            flag22 = false;
            player= false;
         }else if(flag22 == true && player == false) {
            lbl32.setStyle("-fx-background-color: blue;");
            dot42.setStyle("-fx-background-color: grey;");
            dot22.setStyle("-fx-background-color: grey;");
            flag42 = false;
            flag22 = false;
            player= false;
            player= true;
         }
      }else if(event.getSource() == dot44) {
         dot44.setStyle("-fx-background-color: black;");
         flag44 =true;
         if(flag42== true && player == true){
            lbl43.setStyle("-fx-background-color: blue;");
            dot44.setStyle("-fx-background-color: grey;");
            dot42.setStyle("-fx-background-color: grey;");
            flag44 = false;
            flag42 = false;
            player= false;
         }else if(flag42 == true && player == false) {
            lbl43.setStyle("-fx-background-color: blue;");
            dot44.setStyle("-fx-background-color: grey;");
            dot42.setStyle("-fx-background-color: grey;");
            flag44 = false;
            flag42 = false;
            player= true;
         }else if(flag64== true && player == true){
            lbl54.setStyle("-fx-background-color: blue;");
            dot44.setStyle("-fx-background-color: grey;");
            dot64.setStyle("-fx-background-color: grey;");
            flag44 = false;
            flag64 = false;
            player= false;
         }else if(flag64 == true && player == false) {
            lbl54.setStyle("-fx-background-color: blue;");
            dot44.setStyle("-fx-background-color: grey;");
            dot64.setStyle("-fx-background-color: grey;");
            flag44 = false;
            flag64 = false;
            player= true;
         }else if(flag46== true && player == true){
            lbl45.setStyle("-fx-background-color: blue;");
            dot44.setStyle("-fx-background-color: grey;");
            dot46.setStyle("-fx-background-color: grey;");
            flag44 = false;
            flag46 = false;
            player= false;
         }else if(flag46 == true && player == false) {
            lbl45.setStyle("-fx-background-color: blue;");
            dot44.setStyle("-fx-background-color: grey;");
            dot46.setStyle("-fx-background-color: grey;");
            flag44 = false;
            flag46 = false;
            player= true;
         }else if(flag24== true && player == true){
            lbl34.setStyle("-fx-background-color: blue;");
            dot44.setStyle("-fx-background-color: grey;");
            dot24.setStyle("-fx-background-color: grey;");
            flag44 = false;
            flag24 = false;
            player= false;
         }else if(flag24 == true && player == false) {
            lbl34.setStyle("-fx-background-color: blue;");
            dot44.setStyle("-fx-background-color: grey;");
            dot24.setStyle("-fx-background-color: grey;");
            flag44 = false;
            flag24 = false;
            player= true;
         }
      }else if(event.getSource() == dot46) {
         dot46.setStyle("-fx-background-color: black;");
         flag46 =true;
         if(flag44== true && player == true){
            lbl45.setStyle("-fx-background-color: blue;");
            dot46.setStyle("-fx-background-color: grey;");
            dot44.setStyle("-fx-background-color: grey;");
            flag46 = false;
            flag44 = false;
            player= false;
         }else if(flag44 == true && player == false) {
            lbl45.setStyle("-fx-background-color: blue;");
            dot46.setStyle("-fx-background-color: grey;");
            dot44.setStyle("-fx-background-color: grey;");
            flag46 = false;
            flag44 = false;
            player= true;
         }else if(flag66== true && player == true){
            lbl56.setStyle("-fx-background-color: blue;");
            dot46.setStyle("-fx-background-color: grey;");
            dot66.setStyle("-fx-background-color: grey;");
            flag46 = false;
            flag66 = false;
            player= false;
         }else if(flag66 == true && player == false) {
            lbl56.setStyle("-fx-background-color: blue;");
            dot46.setStyle("-fx-background-color: grey;");
            dot66.setStyle("-fx-background-color: grey;");
            flag46 = false;
            flag66 = false;
            player= true;
         }else if(flag48== true && player == true){
            lbl47.setStyle("-fx-background-color: blue;");
            dot46.setStyle("-fx-background-color: grey;");
            dot48.setStyle("-fx-background-color: grey;");
            flag46 = false;
            flag48 = false;
            player= false;
         }else if(flag48 == true && player == false) {
            lbl47.setStyle("-fx-background-color: blue;");
            dot46.setStyle("-fx-background-color: grey;");
            dot48.setStyle("-fx-background-color: grey;");
            flag46 = false;
            flag48 = false;
            player= true;
         }else if(flag26== true && player == true){
            lbl36.setStyle("-fx-background-color: blue;");
            dot46.setStyle("-fx-background-color: grey;");
            dot26.setStyle("-fx-background-color: grey;");
            flag46 = false;
            flag26 = false;
            player= false;
         }else if(flag26 == true && player == false) {
            lbl36.setStyle("-fx-background-color: blue;");
            dot46.setStyle("-fx-background-color: grey;");
            dot26.setStyle("-fx-background-color: grey;");
            flag46 = false;
            flag26 = false;
            player= true;
         }
      }else if(event.getSource() == dot48) {
         dot48.setStyle("-fx-background-color: black;");
         flag48 =true;
         if(flag46== true && player == true){
            lbl47.setStyle("-fx-background-color: blue;");
            dot48.setStyle("-fx-background-color: grey;");
            dot46.setStyle("-fx-background-color: grey;");
            flag48 = false;
            flag46 = false;
            player= false;
         }else if(flag46 == true && player == false) {
            lbl47.setStyle("-fx-background-color: blue;");
            dot48.setStyle("-fx-background-color: grey;");
            dot46.setStyle("-fx-background-color: grey;");
            flag48 = false;
            flag46 = false;
            player= true;
         }else if(flag68== true && player == true){
            lbl58.setStyle("-fx-background-color: blue;");
            dot48.setStyle("-fx-background-color: grey;");
            dot68.setStyle("-fx-background-color: grey;");
            flag48 = false;
            flag68 = false;
            player= false;
         }else if(flag68 == true && player == false) {
            lbl58.setStyle("-fx-background-color: blue;");
            dot48.setStyle("-fx-background-color: grey;");
            dot68.setStyle("-fx-background-color: grey;");
            flag48 = false;
            flag68 = false;
            player= true;
         }else if(flag28== true && player == true){
            lbl38.setStyle("-fx-background-color: blue;");
            dot48.setStyle("-fx-background-color: grey;");
            dot28.setStyle("-fx-background-color: grey;");
            flag48 = false;
            flag28 = false;
            player= false;
         }else if(flag28 == true && player == false) {
            lbl38.setStyle("-fx-background-color: blue;");
            dot48.setStyle("-fx-background-color: grey;");
            dot28.setStyle("-fx-background-color: grey;");
            flag48 = false;
            flag28 = false;
            player= true;
         }
      }else if(event.getSource() == dot60) {
         dot60.setStyle("-fx-background-color: black;");
         flag60 =true;
         if(flag80== true && player == true){
            lbl70.setStyle("-fx-background-color: blue;");
            dot60.setStyle("-fx-background-color: grey;");
            dot80.setStyle("-fx-background-color: grey;");
            flag60 = false;
            flag80 = false;
            player= false;
         }else if(flag80 == true && player == false) {
            lbl70.setStyle("-fx-background-color: blue;");
            dot60.setStyle("-fx-background-color: grey;");
            dot80.setStyle("-fx-background-color: grey;");
            flag60 = false;
            flag80 = false;
            player= true;
         }else if(flag62== true && player == true){
            lbl61.setStyle("-fx-background-color: blue;");
            dot60.setStyle("-fx-background-color: grey;");
            dot62.setStyle("-fx-background-color: grey;");
            flag60 = false;
            flag62 = false;
            player= false;
         }else if(flag62 == true && player == false) {
            lbl61.setStyle("-fx-background-color: blue;");
            dot60.setStyle("-fx-background-color: grey;");
            dot62.setStyle("-fx-background-color: grey;");
            flag60 = false;
            flag62 = false;
            player= true;
         }else if(flag40== true && player == true){
            lbl50.setStyle("-fx-background-color: blue;");
            dot60.setStyle("-fx-background-color: grey;");
            dot40.setStyle("-fx-background-color: grey;");
            flag60 = false;
            flag40 = false;
            player= false;
         }else if(flag40 == true && player == false) {
            lbl50.setStyle("-fx-background-color: blue;");
            dot60.setStyle("-fx-background-color: grey;");
            dot40.setStyle("-fx-background-color: grey;");
            flag60 = false;
            flag40 = false;
            player= true;
         }
      }else if(event.getSource() == dot62) {
         dot62.setStyle("-fx-background-color: black;");
         flag62 =true;
         if(flag60== true && player == true){
            lbl61.setStyle("-fx-background-color: blue;");
            dot62.setStyle("-fx-background-color: grey;");
            dot60.setStyle("-fx-background-color: grey;");
            flag62 = false;
            flag60 = false;
            player= false;
         }else if(flag60 == true && player == false) {
            lbl61.setStyle("-fx-background-color: blue;");
            dot62.setStyle("-fx-background-color: grey;");
            dot60.setStyle("-fx-background-color: grey;");
            flag62 = false;
            flag60 = false;
            player= true;
         }else if(flag82== true && player == true){
            lbl72.setStyle("-fx-background-color: blue;");
            dot62.setStyle("-fx-background-color: grey;");
            dot82.setStyle("-fx-background-color: grey;");
            flag62 = false;
            flag82 = false;
            player= false;
         }else if(flag82 == true && player == false) {
            lbl72.setStyle("-fx-background-color: blue;");
            dot62.setStyle("-fx-background-color: grey;");
            dot82.setStyle("-fx-background-color: grey;");
            flag62 = false;
            flag82 = false;
            player= true;
         }else if(flag64== true && player == true){
            lbl63.setStyle("-fx-background-color: blue;");
            dot62.setStyle("-fx-background-color: grey;");
            dot64.setStyle("-fx-background-color: grey;");
            flag62 = false;
            flag64 = false;
            player= false;
         }else if(flag64 == true && player == false) {
            lbl63.setStyle("-fx-background-color: blue;");
            dot62.setStyle("-fx-background-color: grey;");
            dot64.setStyle("-fx-background-color: grey;");
            flag62 = false;
            flag64 = false;
            player= true;
         }else if(flag42== true && player == true){
            lbl52.setStyle("-fx-background-color: blue;");
            dot62.setStyle("-fx-background-color: grey;");
            dot42.setStyle("-fx-background-color: grey;");
            flag62 = false;
            flag42 = false;
            player= false;
         }else if(flag42 == true && player == false) {
            lbl52.setStyle("-fx-background-color: blue;");
            dot62.setStyle("-fx-background-color: grey;");
            dot42.setStyle("-fx-background-color: grey;");
            flag62 = false;
            flag42 = false;
            player= false;
            player= true;
         }
      }else if(event.getSource() == dot64) {
         dot64.setStyle("-fx-background-color: black;");
         flag64 =true;
         if(flag62== true && player == true){
            lbl63.setStyle("-fx-background-color: blue;");
            dot64.setStyle("-fx-background-color: grey;");
            dot62.setStyle("-fx-background-color: grey;");
            flag64 = false;
            flag62 = false;
            player= false;
         }else if(flag62 == true && player == false) {
            lbl63.setStyle("-fx-background-color: blue;");
            dot64.setStyle("-fx-background-color: grey;");
            dot62.setStyle("-fx-background-color: grey;");
            flag64 = false;
            flag62 = false;
            player= true;
         }else if(flag84== true && player == true){
            lbl74.setStyle("-fx-background-color: blue;");
            dot64.setStyle("-fx-background-color: grey;");
            dot84.setStyle("-fx-background-color: grey;");
            flag64 = false;
            flag84 = false;
            player= false;
         }else if(flag84 == true && player == false) {
            lbl74.setStyle("-fx-background-color: blue;");
            dot64.setStyle("-fx-background-color: grey;");
            dot84.setStyle("-fx-background-color: grey;");
            flag64 = false;
            flag84 = false;
            player= true;
         }else if(flag66== true && player == true){
            lbl65.setStyle("-fx-background-color: blue;");
            dot64.setStyle("-fx-background-color: grey;");
            dot66.setStyle("-fx-background-color: grey;");
            flag64 = false;
            flag66 = false;
            player= false;
         }else if(flag66 == true && player == false) {
            lbl65.setStyle("-fx-background-color: blue;");
            dot64.setStyle("-fx-background-color: grey;");
            dot66.setStyle("-fx-background-color: grey;");
            flag64 = false;
            flag66 = false;
            player= true;
         }else if(flag44== true && player == true){
            lbl54.setStyle("-fx-background-color: blue;");
            dot64.setStyle("-fx-background-color: grey;");
            dot44.setStyle("-fx-background-color: grey;");
            flag64 = false;
            flag44 = false;
            player= false;
         }else if(flag44 == true && player == false) {
            lbl54.setStyle("-fx-background-color: blue;");
            dot64.setStyle("-fx-background-color: grey;");
            dot44.setStyle("-fx-background-color: grey;");
            flag64 = false;
            flag44 = false;
            player= true;
         }
      }else if(event.getSource() == dot66) {
         dot66.setStyle("-fx-background-color: black;");
         flag66 =true;
         if(flag64== true && player == true){
            lbl65.setStyle("-fx-background-color: blue;");
            dot66.setStyle("-fx-background-color: grey;");
            dot64.setStyle("-fx-background-color: grey;");
            flag66 = false;
            flag64 = false;
            player= false;
         }else if(flag64 == true && player == false) {
            lbl65.setStyle("-fx-background-color: blue;");
            dot66.setStyle("-fx-background-color: grey;");
            dot64.setStyle("-fx-background-color: grey;");
            flag66 = false;
            flag64 = false;
            player= true;
         }else if(flag86== true && player == true){
            lbl76.setStyle("-fx-background-color: blue;");
            dot66.setStyle("-fx-background-color: grey;");
            dot86.setStyle("-fx-background-color: grey;");
            flag66 = false;
            flag86 = false;
            player= false;
         }else if(flag86 == true && player == false) {
            lbl76.setStyle("-fx-background-color: blue;");
            dot66.setStyle("-fx-background-color: grey;");
            dot86.setStyle("-fx-background-color: grey;");
            flag66 = false;
            flag86 = false;
            player= true;
         }else if(flag68== true && player == true){
            lbl67.setStyle("-fx-background-color: blue;");
            dot66.setStyle("-fx-background-color: grey;");
            dot68.setStyle("-fx-background-color: grey;");
            flag66 = false;
            flag68 = false;
            player= false;
         }else if(flag68 == true && player == false) {
            lbl67.setStyle("-fx-background-color: blue;");
            dot66.setStyle("-fx-background-color: grey;");
            dot68.setStyle("-fx-background-color: grey;");
            flag66 = false;
            flag68 = false;
            player= true;
         }else if(flag46== true && player == true){
            lbl56.setStyle("-fx-background-color: blue;");
            dot66.setStyle("-fx-background-color: grey;");
            dot46.setStyle("-fx-background-color: grey;");
            flag66 = false;
            flag46 = false;
            player= false;
         }else if(flag46 == true && player == false) {
            lbl56.setStyle("-fx-background-color: blue;");
            dot66.setStyle("-fx-background-color: grey;");
            dot46.setStyle("-fx-background-color: grey;");
            flag66 = false;
            flag46 = false;
            player= true;
         }
      }else if(event.getSource() == dot68) {
         dot68.setStyle("-fx-background-color: black;");
         flag68 =true;
         if(flag66== true && player == true){
            lbl67.setStyle("-fx-background-color: blue;");
            dot68.setStyle("-fx-background-color: grey;");
            dot66.setStyle("-fx-background-color: grey;");
            flag68 = false;
            flag66 = false;
            player= false;
         }else if(flag66 == true && player == false) {
            lbl67.setStyle("-fx-background-color: blue;");
            dot68.setStyle("-fx-background-color: grey;");
            dot66.setStyle("-fx-background-color: grey;");
            flag68 = false;
            flag66 = false;
            player= true;
         }else if(flag88== true && player == true){
            lbl78.setStyle("-fx-background-color: blue;");
            dot68.setStyle("-fx-background-color: grey;");
            dot88.setStyle("-fx-background-color: grey;");
            flag68 = false;
            flag88 = false;
            player= false;
         }else if(flag88 == true && player == false) {
            lbl78.setStyle("-fx-background-color: blue;");
            dot68.setStyle("-fx-background-color: grey;");
            dot88.setStyle("-fx-background-color: grey;");
            flag68 = false;
            flag88 = false;
            player= true;
         }else if(flag48== true && player == true){
            lbl58.setStyle("-fx-background-color: blue;");
            dot68.setStyle("-fx-background-color: grey;");
            dot48.setStyle("-fx-background-color: grey;");
            flag68 = false;
            flag48 = false;
            player= false;
         }else if(flag48 == false && player == false) {
            lbl58.setStyle("-fx-background-color: blue;");
            dot68.setStyle("-fx-background-color: grey;");
            dot48.setStyle("-fx-background-color: grey;");
            flag68 = false;
            flag48 = false;
            player= true;
         }
      }else if(event.getSource() == dot80) {
         dot80.setStyle("-fx-background-color: black;");
         flag80 =true;
         if(flag82== true && player == true){
            lbl81.setStyle("-fx-background-color: blue;");
            dot80.setStyle("-fx-background-color: grey;");
            dot82.setStyle("-fx-background-color: grey;");
            flag80 = false;
            flag82 = false;
            player= false;
         }else if(flag82 == true && player == false) {
            lbl81.setStyle("-fx-background-color: blue;");
            dot80.setStyle("-fx-background-color: grey;");
            dot82.setStyle("-fx-background-color: grey;");
            flag80 = false;
            flag82 = false;
            player= true;
         }else if(flag60== true && player == true){
            lbl70.setStyle("-fx-background-color: blue;");
            dot80.setStyle("-fx-background-color: grey;");
            dot60.setStyle("-fx-background-color: grey;");
            flag80 = false;
            flag60 = false;
            player= false;
         }else if(flag60 == true && player == false) {
            lbl70.setStyle("-fx-background-color: blue;");
            dot80.setStyle("-fx-background-color: grey;");
            dot60.setStyle("-fx-background-color: grey;");
            flag80 = false;
            flag60 = false;
            player= true;
         }
      }else if(event.getSource() == dot82) {
         dot82.setStyle("-fx-background-color: black;");
         flag82 =true;
         if(flag80== true && player == true){
            lbl81.setStyle("-fx-background-color: blue;");
            dot82.setStyle("-fx-background-color: grey;");
            dot80.setStyle("-fx-background-color: grey;");
            flag82 = false;
            flag80 = false;
            player= false;
         }else if(flag80 == true && player == false) {
            lbl81.setStyle("-fx-background-color: blue;");
            dot82.setStyle("-fx-background-color: grey;");
            dot80.setStyle("-fx-background-color: grey;");
            flag82 = false;
            flag80 = false;
            player= true;
         }else if(flag84== true && player == true){
            lbl83.setStyle("-fx-background-color: blue;");
            dot82.setStyle("-fx-background-color: grey;");
            dot84.setStyle("-fx-background-color: grey;");
            flag82 = false;
            flag84 = false;
            player= false;
         }else if(flag84 == true && player == false) {
            lbl83.setStyle("-fx-background-color: blue;");
            dot82.setStyle("-fx-background-color: grey;");
            dot84.setStyle("-fx-background-color: grey;");
            flag82 = false;
            flag84 = false;
            player= true;
         }else if(flag62== true && player == true){
            lbl72.setStyle("-fx-background-color: blue;");
            dot82.setStyle("-fx-background-color: grey;");
            dot62.setStyle("-fx-background-color: grey;");
            flag82 = false;
            flag62 = false;
            player= false;
         }else if(flag62 == true && player == false) {
            lbl72.setStyle("-fx-background-color: blue;");
            dot82.setStyle("-fx-background-color: grey;");
            dot62.setStyle("-fx-background-color: grey;");
            flag82 = false;
            flag62 = false;
            player= true;
         }
      }else if(event.getSource() == dot84) {
         dot84.setStyle("-fx-background-color: black;");
         flag84 =true;
         if(flag82== true && player == true){
            lbl83.setStyle("-fx-background-color: blue;");
            dot84.setStyle("-fx-background-color: grey;");
            dot82.setStyle("-fx-background-color: grey;");
            flag84 = false;
            flag82 = false;
            player= false;
         }else if(flag82 == true && player == false) {
            lbl83.setStyle("-fx-background-color: blue;");
            dot84.setStyle("-fx-background-color: grey;");
            dot82.setStyle("-fx-background-color: grey;");
            flag84 = false;
            flag82 = false;
            player= true;
         }else if(flag86== true && player == true){
            lbl85.setStyle("-fx-background-color: blue;");
            dot84.setStyle("-fx-background-color: grey;");
            dot86.setStyle("-fx-background-color: grey;");
            flag84 = false;
            flag86 = false;
            player= false;
         }else if(flag86 == true && player == false) {
            lbl85.setStyle("-fx-background-color: blue;");
            dot84.setStyle("-fx-background-color: grey;");
            dot86.setStyle("-fx-background-color: grey;");
            flag84 = false;
            flag86 = false;
            player= true;
         }else if(flag64== true && player == true){
            lbl74.setStyle("-fx-background-color: blue;");
            dot84.setStyle("-fx-background-color: grey;");
            dot64.setStyle("-fx-background-color: grey;");
            flag84 = false;
            flag64 = false;
            player= false;
         }else if(flag64 == true && player == false) {
            lbl74.setStyle("-fx-background-color: blue;");
            dot84.setStyle("-fx-background-color: grey;");
            dot64.setStyle("-fx-background-color: grey;");
            flag84 = false;
            flag64 = false;
            player= true;
         }
      }else if(event.getSource() == dot86) {
         dot86.setStyle("-fx-background-color: black;");
         flag86 =true;
         if(flag84== true && player == true){
            lbl85.setStyle("-fx-background-color: blue;");
            dot86.setStyle("-fx-background-color: grey;");
            dot84.setStyle("-fx-background-color: grey;");
            flag86 = false;
            flag84 = false;
            player= false;
         }else if(flag84 == true && player == false) {
            lbl85.setStyle("-fx-background-color: blue;");
            dot86.setStyle("-fx-background-color: grey;");
            dot84.setStyle("-fx-background-color: grey;");
            flag86 = false;
            flag84 = false;
            player= true;
         }else if(flag88== true && player == true){
            lbl87.setStyle("-fx-background-color: blue;");
            dot86.setStyle("-fx-background-color: grey;");
            dot88.setStyle("-fx-background-color: grey;");
            flag86 = false;
            flag88 = false;
            player= false;
         }else if(flag88 == true && player == false) {
            lbl87.setStyle("-fx-background-color: blue;");
            dot86.setStyle("-fx-background-color: grey;");
            dot88.setStyle("-fx-background-color: grey;");
            flag86 = false;
            flag88 = false;
            player= true;
         }else if(flag66== true && player == true){
            lbl76.setStyle("-fx-background-color: blue;");
            dot86.setStyle("-fx-background-color: grey;");
            dot66.setStyle("-fx-background-color: grey;");
            flag86 = false;
            flag66 = false;
            player= false;
         }else if(flag66 == true && player == false) {
            lbl76.setStyle("-fx-background-color: blue;");
            dot86.setStyle("-fx-background-color: grey;");
            dot66.setStyle("-fx-background-color: grey;");
            flag86 = false;
            flag66 = false;
            player= true;
         }
      }else if(event.getSource() == dot88) {
         dot88.setStyle("-fx-background-color: black;");
         flag88 =true;
         if(flag86== true && player == true){
            lbl87.setStyle("-fx-background-color: blue;");
            dot88.setStyle("-fx-background-color: grey;");
            dot86.setStyle("-fx-background-color: grey;");
            flag88 = false;
            flag86 = false;
            player= false;
         }else if(flag86 == true && player == false) {
            lbl87.setStyle("-fx-background-color: blue;");
            dot88.setStyle("-fx-background-color: grey;");
            dot86.setStyle("-fx-background-color: grey;");
            flag88 = false;
            flag86 = false;
            player= true;
         }else if(flag68== true && player == true){
            lbl78.setStyle("-fx-background-color: blue;");
            dot88.setStyle("-fx-background-color: grey;");
            dot68.setStyle("-fx-background-color: grey;");
            flag88 = false;
            flag68 = false;
            player= false;
         }else if(flag68 == true && player == false) {
            lbl78.setStyle("-fx-background-color: blue;");
            dot88.setStyle("-fx-background-color: grey;");
            dot68.setStyle("-fx-background-color: grey;");
            flag88 = false;
            flag68 = false;
            player= true;
         }
      }

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
      lbl.setStyle("-fx-background-color: black;");
      GridPane.setHalignment(lbl, HPos.CENTER);
      lbl.setMinWidth(25);
      lbl.setMinHeight(5);
      lbl.setMaxWidth(25);
      lbl.setMaxHeight(5);
   }

   private void initializeVerticalLabel(Label lbl) {
      lbl.setStyle("-fx-background-color: black;");
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
