package com.dotsandboxes;
import java.lang.String;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;

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

   private boolean player = true; //true = player 1 turn

   private int boxes[] = new int [16];
   private int playerOneScore= 0;
   private int playerTwoScore= 0;
   private int [][] gameBoard = new int [9][9]; //eventually move all this to game class
   private int total = 0;
   private Boolean scoredOnce;


   private void addButtons(){
      for(int i= 0; i<9; i=i+2){
         for(int k= 0; k<9; k=k+2) {
            this.total += gameBoard[i][k];
         }
      }
   }

   private void buttonCheck(){
      addButtons();
      if(this.total>3){
         this.total = 0;
         flag00= false; dot00.setStyle("-fx-background-color: grey;"); gameBoard[0][0]=0;
         flag02= false; dot02.setStyle("-fx-background-color: grey;"); gameBoard[0][2]=0;
         flag04= false; dot04.setStyle("-fx-background-color: grey;"); gameBoard[0][4]=0;
         flag06= false; dot06.setStyle("-fx-background-color: grey;"); gameBoard[0][6]=0;
         flag08= false; dot08.setStyle("-fx-background-color: grey;"); gameBoard[0][8]=0;
         flag20= false; dot20.setStyle("-fx-background-color: grey;"); gameBoard[2][0]=0;
         flag22= false; dot22.setStyle("-fx-background-color: grey;"); gameBoard[2][2]=0;
         flag24= false; dot24.setStyle("-fx-background-color: grey;"); gameBoard[2][4]=0;
         flag26= false; dot26.setStyle("-fx-background-color: grey;"); gameBoard[2][6]=0;
         flag28= false; dot28.setStyle("-fx-background-color: grey;"); gameBoard[2][8]=0;
         flag40= false; dot40.setStyle("-fx-background-color: grey;"); gameBoard[4][0]=0;
         flag42= false; dot42.setStyle("-fx-background-color: grey;"); gameBoard[4][2]=0;
         flag44= false; dot44.setStyle("-fx-background-color: grey;"); gameBoard[4][4]=0;
         flag46= false; dot46.setStyle("-fx-background-color: grey;"); gameBoard[4][6]=0;
         flag48= false; dot48.setStyle("-fx-background-color: grey;"); gameBoard[4][8]=0;
         flag60= false; dot60.setStyle("-fx-background-color: grey;"); gameBoard[6][0]=0;
         flag62= false; dot62.setStyle("-fx-background-color: grey;"); gameBoard[6][2]=0;
         flag64= false; dot64.setStyle("-fx-background-color: grey;"); gameBoard[6][4]=0;
         flag66= false; dot66.setStyle("-fx-background-color: grey;"); gameBoard[6][6]=0;
         flag68= false; dot68.setStyle("-fx-background-color: grey;"); gameBoard[6][8]=0;
         flag80= false; dot80.setStyle("-fx-background-color: grey;"); gameBoard[8][0]=0;
         flag82= false; dot82.setStyle("-fx-background-color: grey;"); gameBoard[8][2]=0;
         flag84= false; dot84.setStyle("-fx-background-color: grey;"); gameBoard[8][4]=0;
         flag86= false; dot86.setStyle("-fx-background-color: grey;"); gameBoard[8][6]=0;
         flag88= false; dot88.setStyle("-fx-background-color: grey;"); gameBoard[8][8]=0;
      }
   }

   private void addPoint(Boolean player, Boolean scoredOnce){
      if(!player){
         playerOneScore+=1;
         lblPlayerOneScore.setText(Integer.toString(playerOneScore));
      }else{
         playerTwoScore+=1;
         lblPlayerTwoScore.setText(Integer.toString(playerTwoScore));
      }
      if (scoredOnce){
         this.player = !player;
      }
      else{
         this.player = player;
         this.scoredOnce = true;
      }
   }

   private void endOfGame(){
      if (playerOneScore + playerTwoScore == 16){
         if (playerOneScore > playerTwoScore){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("We have a WINNER!!!");
            alert.setHeaderText("Player 1 has won this game.");
            alert.setContentText("Take your picture now, when this window is closed the game will end!");
            alert.showAndWait().ifPresent(rs -> {
               if (rs == ButtonType.OK || rs == ButtonType.CLOSE) {
                  System.out.println("Game Ended");
                  System.exit(1);
               }
            });
         }
         else if (playerTwoScore > playerOneScore){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("We have a WINNER!!!");
            alert.setHeaderText("Player 2 has won this game.");
            alert.setContentText("Take your picture now, when this window is closed the game will end!");
            alert.showAndWait().ifPresent(rs -> {
               if (rs == ButtonType.OK || rs == ButtonType.CLOSE) {
                  System.out.println("Game Ended");
                  System.exit(1);
               }
            });
         }
         else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("It's a tie!!!");
            alert.setHeaderText("Player 1 and Player 2 have tied.");
            alert.setContentText("Take your picture now, when this window is closed the game will end!");
            alert.showAndWait().ifPresent(rs -> {
               if (rs == ButtonType.OK || rs == ButtonType.CLOSE) {
                  System.out.println("Game Ended");
                  System.exit(1);
               }
            });
         }
      }
   }

   private void scoring(){
      scoredOnce = false;
      if(gameBoard[0][1]+ gameBoard[2][1]+ gameBoard[1][2]+ gameBoard[1][0] == 4 && boxes[0] == 0){
         boxes[0] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[0][3]+ gameBoard[1][4]+ gameBoard[2][3]+ gameBoard[1][2] == 4 && boxes[1] == 0){
         boxes[1] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[0][5]+ gameBoard[1][6]+ gameBoard[2][5]+ gameBoard[1][4] == 4 && boxes[2] == 0){
         boxes[2] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[0][7]+ gameBoard[1][8]+ gameBoard[2][5]+ gameBoard[1][4] == 4 && boxes[3] == 0){
         boxes[3] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[2][1]+ gameBoard[3][2]+ gameBoard[4][1]+ gameBoard[3][0] == 4 && boxes[4] == 0){
         boxes[4] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[2][3]+ gameBoard[3][4]+ gameBoard[4][3]+ gameBoard[3][2] == 4 && boxes[5] == 0){
         boxes[5] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[2][5]+ gameBoard[3][6]+ gameBoard[4][5]+ gameBoard[3][4] == 4 && boxes[6] == 0){
         boxes[6] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[2][7]+ gameBoard[3][8]+ gameBoard[4][7]+ gameBoard[3][6] == 4 && boxes[7] == 0){
         boxes[7] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[4][1]+ gameBoard[5][2]+ gameBoard[6][1]+ gameBoard[5][0] == 4 && boxes[8] == 0){
         boxes[8] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[4][3]+ gameBoard[5][4]+ gameBoard[6][3]+ gameBoard[5][2] == 4 && boxes[9] == 0){
         boxes[9] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[4][5]+ gameBoard[5][6]+ gameBoard[6][5]+ gameBoard[5][4] == 4 && boxes[10] == 0){
         boxes[10] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[4][7]+ gameBoard[5][8]+ gameBoard[6][7]+ gameBoard[5][6] == 4 && boxes[11] == 0){
         boxes[11] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[6][1]+ gameBoard[7][2]+ gameBoard[8][1]+ gameBoard[7][0] == 4 && boxes[12] == 0){
         boxes[12] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[6][3]+ gameBoard[7][4]+ gameBoard[8][3]+ gameBoard[7][2] == 4 && boxes[13] == 0){
         boxes[13] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[6][5]+ gameBoard[7][6]+ gameBoard[8][5]+ gameBoard[7][4] == 4 && boxes[14] == 0){
         boxes[14] = 1;
         addPoint(player, scoredOnce);
      }
      if(gameBoard[6][7]+ gameBoard[7][8]+ gameBoard[8][7]+ gameBoard[7][6] == 4 && boxes[15] == 0){
         boxes[15] = 1;
         addPoint(player, scoredOnce);
      }
      endOfGame();
   }

   private void lineChange(Label lbl, Button btn, Button btn2, Boolean player) {
      if (player)
      {
         lbl.setStyle("-fx-background-color: blue;");
      }
      else
      {
         lbl.setStyle("-fx-background-color: red;");
      }

      btn.setStyle("-fx-background-color: grey;");
      btn2.setStyle("-fx-background-color: grey;");

      this.player = !player;
   }

   @FXML
   private void dotClicked(ActionEvent event) {
      if(event.getSource() == dot00) {
         dot00.setStyle("-fx-background-color: black;");
         flag00 =true;
         gameBoard[0][0]=1;
         buttonCheck();
         if(flag20 == true && player == true && gameBoard[0][1] == 0){
            lineChange(lbl10, dot00, dot20, player);
            flag00 = false;
            flag20 = false;
            gameBoard[0][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag20 == true && player == false && gameBoard[0][1] == 0) {
            lineChange(lbl10, dot00, dot20, player);
            flag00 = false;
            flag20 = false;
            gameBoard[0][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag02 == true && player == true && gameBoard[1][0] == 0){
            lineChange(lbl01, dot00, dot02, player);
            flag00 = false;
            flag02 = false;
            gameBoard[1][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag02 == true && player == false && gameBoard[1][0] == 0){
            lineChange(lbl01, dot00, dot02, player);
            flag00 = false;
            flag02 = false;
            gameBoard[1][0]= 1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot02) {
         dot02.setStyle("-fx-background-color: black;");
         flag02 =true;
         gameBoard[0][2]=1;
         buttonCheck();
         if(flag00 == true && player == true && gameBoard[1][0] == 0){
            lineChange(lbl01, dot02, dot00, player);
            flag02 = false;
            flag00 = false;
            gameBoard[1][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag00 == true && player == false && gameBoard[1][0] == 0) {
            lineChange(lbl01, dot02, dot00, player);
            flag02 = false;
            flag00 = false;
            gameBoard[1][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag22 == true && player == true && gameBoard[2][1] == 0){
            lineChange(lbl12, dot02, dot22, player);
            flag02 = false;
            flag22 = false;
            gameBoard[2][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag22 == true && player == false && gameBoard[2][1] == 0){
            lineChange(lbl12, dot02, dot22, player);
            flag02 = false;
            flag22 = false;
            gameBoard[2][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag04 == true && player == true && gameBoard[0][1] == 0){
            lineChange(lbl10, dot00, dot20, player);
            flag02 = false;
            flag04 = false;
            gameBoard[0][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag04 == true && player == false && gameBoard[0][1] == 0){
            lineChange(lbl10, dot00, dot20, player);
            flag02 = false;
            flag04 = false;
            gameBoard[0][1]= 1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot04) {
         dot04.setStyle("-fx-background-color: black;");
         flag04 =true;
         gameBoard[0][4]=1;
         buttonCheck();
         if(flag02 == true && player == true && gameBoard[3][0] == 0){
            lineChange(lbl03, dot04, dot02, player);
            flag04 = false;
            flag02 = false;
            gameBoard[3][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag02 == true && player == false && gameBoard[3][0] == 0) {
            lineChange(lbl03, dot04, dot02, player);
            flag04 = false;
            flag02 = false;
            gameBoard[3][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag24 == true && player == true && gameBoard[4][1] == 0){
            lineChange(lbl14, dot04, dot24, player);
            flag04 = false;
            flag24 = false;
            gameBoard[4][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag24 == true && player == false && gameBoard[4][1] == 0){
            lineChange(lbl14, dot04, dot24, player);
            flag04 = false;
            flag24 = false;
            gameBoard[4][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag06 == true && player == true && gameBoard[5][0] == 0){
            lineChange(lbl05, dot04, dot22, player);
            flag04 = false;
            flag06 = false;
            gameBoard[5][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag06 == true && player == false && gameBoard[5][0] == 0){
            lineChange(lbl05, dot04, dot22, player);
            flag04 = false;
            flag06 = false;
            gameBoard[5][0]= 1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot06) {
         dot06.setStyle("-fx-background-color: black;");
         flag06 =true;
         gameBoard[0][6]=1;
         buttonCheck();
         if(flag04 == true && player == true && gameBoard[5][0] == 0){
            lineChange(lbl05, dot06, dot04, player);
            flag06 = false;
            flag04 = false;
            gameBoard[5][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag04 == true && player == false && gameBoard[5][0] == 0) {
            lineChange(lbl05, dot06, dot04, player);
            flag06 = false;
            flag04 = false;
            gameBoard[5][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag26 == true && player == true && gameBoard[6][1] == 0){
            lineChange(lbl16, dot06, dot26, player);
            flag06 = false;
            flag26 = false;
            gameBoard[6][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag26 == true && player == false && gameBoard[6][1] == 0) {
            lineChange(lbl16, dot06, dot26, player);
            flag06 = false;
            flag26 = false;
            gameBoard[6][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag08 == true && player == true && gameBoard[7][0] == 0){
            lineChange(lbl07, dot06, dot08, player);
            flag06 = false;
            flag08 = false;
            gameBoard[7][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag08 == true && player == false && gameBoard[7][0] == 0) {
            lineChange(lbl07, dot06, dot08, player);
            flag06 = false;
            flag08 = false;
            gameBoard[7][0]= 1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot08) {
         dot08.setStyle("-fx-background-color: black;");
         flag08 =true;
         gameBoard[0][8]=1;
         buttonCheck();
         if(flag06 == true && player == true && gameBoard[7][0] == 0){
            lineChange(lbl07, dot08, dot06, player);
            flag08 = false;
            flag06 = false;
            gameBoard[7][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag06 == true && player == false && gameBoard[7][0] == 0) {
            lineChange(lbl07, dot08, dot06, player);
            flag08 = false;
            flag06 = false;
            gameBoard[7][0]= 1;
            scoring();
            PlayersTurn();
         }else if(flag28 == true && player == true && gameBoard[8][1] == 0){
            lineChange(lbl18, dot08, dot28, player);
            flag08 = false;
            flag28 = false;
            gameBoard[8][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag28 == true && player == false && gameBoard[8][1] == 0) {
            lineChange(lbl18, dot08, dot28, player);
            flag08 = false;
            flag28 = false;
            gameBoard[8][1]= 1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot20) {
         dot20.setStyle("-fx-background-color: black;");
         flag20 =true;
         gameBoard[2][0]=1;
         buttonCheck();
         if(flag00 == true && player == true && gameBoard[0][1] == 0){
            lineChange(lbl10, dot20, dot00, player);
            flag20 = false;
            flag00 = false;
            gameBoard[0][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag00 == true && player == false && gameBoard[0][1] == 0) {
            lineChange(lbl10, dot20, dot00, player);
            flag20 = false;
            flag00 = false;
            gameBoard[0][1]= 1;
            scoring();
            PlayersTurn();
         }else if(flag22 == true && player == true && gameBoard[1][2] == 0){
            lineChange(lbl21, dot20, dot22, player);
            flag20 = false;
            flag22 = false;
            gameBoard[1][2]= 1;
            scoring();
            PlayersTurn();
         }else if(flag22 == true && player == false && gameBoard[1][2] == 0) {
            lineChange(lbl21, dot20, dot22, player);
            flag20 = false;
            flag22 = false;
            gameBoard[1][2]= 1;
            scoring();
            PlayersTurn();
         }else if(flag40 == true && player == true && gameBoard[0][3] == 0){
            lineChange(lbl30, dot20, dot40, player);
            flag20 = false;
            flag40 = false;
            gameBoard[0][3]= 1;
            scoring();
            PlayersTurn();
         }else if(flag40 == true && player == false && gameBoard[0][3] == 0) {
            lineChange(lbl30, dot20, dot40, player);
            flag20 = false;
            flag40 = false;
            gameBoard[0][3]= 1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot22) {
         dot22.setStyle("-fx-background-color: black;");
         flag22 =true;
         gameBoard[2][2]=1;
         buttonCheck();
         if(flag20 == true && player == true && gameBoard[1][2] == 0){
            lineChange(lbl21, dot22, dot20, player);
            flag22 = false;
            flag20 = false;
            gameBoard[1][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag20 == true && player == false && gameBoard[1][2] == 0) {
            lineChange(lbl21, dot22, dot20, player);
            flag22 = false;
            flag20 = false;
            gameBoard[1][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag42 == true && player == true && gameBoard[2][3] == 0){
            lineChange(lbl32, dot22, dot42, player);
            flag22 = false;
            flag42 = false;
            gameBoard[2][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag42 == true && player == false && gameBoard[2][3] == 0) {
            lineChange(lbl32, dot22, dot42, player);
            flag22 = false;
            flag42 = false;
            gameBoard[2][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag24 == true && player == true && gameBoard[3][2] == 0){
            lineChange(lbl23, dot22, dot24, player);
            flag22 = false;
            flag24 = false;
            gameBoard[3][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag24 == true && player == false && gameBoard[3][2] == 0) {
            lineChange(lbl23, dot22, dot24, player);
            flag22 = false;
            flag24 = false;
            gameBoard[3][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag02 == true && player == true && gameBoard[2][1] == 0){
            lineChange(lbl12, dot22, dot02, player);
            flag22 = false;
            flag02 = false;
            gameBoard[2][1]=1;
            scoring();
            PlayersTurn();
         }else if(flag02 == true && player == false && gameBoard[2][1] == 0) {
            lineChange(lbl12, dot22, dot02, player);
            flag22 = false;
            flag02 = false;
            gameBoard[2][1]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot24) {
         dot24.setStyle("-fx-background-color: black;");
         flag24 =true;
         gameBoard[2][4]=1;
         buttonCheck();
         if(flag22 == true && player == true && gameBoard[3][2] == 0){
            lineChange(lbl23, dot24, dot22, player);
            flag24 = false;
            flag22 = false;
            gameBoard[3][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag22 == true && player == false && gameBoard[3][2] == 0) {
            lineChange(lbl23, dot24, dot22, player);
            flag24 = false;
            flag22 = false;
            gameBoard[3][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag44 == true && player == true && gameBoard[4][3] == 0){
            lineChange(lbl34, dot24, dot44, player);
            flag24 = false;
            flag44 = false;
            gameBoard[4][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag44 == true && player == false && gameBoard[4][3] == 0) {
            lineChange(lbl34, dot24, dot44, player);
            flag24 = false;
            flag44 = false;
            gameBoard[4][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag26 == true && player == true && gameBoard[5][2] == 0){
            lineChange(lbl25, dot24, dot26, player);
            flag24 = false;
            flag26 = false;
            gameBoard[5][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag26 == true && player == false && gameBoard[5][2] == 0) {
            lineChange(lbl25, dot24, dot26, player);
            flag24 = false;
            flag26 = false;
            gameBoard[5][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag04 == true && player == true && gameBoard[4][1] == 0){
            lineChange(lbl14, dot24, dot04, player);
            flag24 = false;
            flag04 = false;
            gameBoard[4][1]=1;
            scoring();
            PlayersTurn();
         }else if(flag04 == true && player == false && gameBoard[4][1] == 0) {
            lineChange(lbl14, dot24, dot04, player);
            flag24 = false;
            flag04 = false;
            gameBoard[4][1]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot26) {
         dot26.setStyle("-fx-background-color: black;");
         flag26 =true;
         gameBoard[2][6]=1;
         buttonCheck();
         if(flag24 == true && player == true && gameBoard[5][2] == 0){
            lineChange(lbl25, dot26, dot24, player);
            flag26 = false;
            flag24 = false;
            gameBoard[5][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag24 == true && player == false && gameBoard[5][2] == 0) {
            lineChange(lbl25, dot26, dot24, player);
            flag26 = false;
            flag24 = false;
            gameBoard[5][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag46 == true && player == true && gameBoard[6][3] == 0){
            lineChange(lbl36, dot26, dot46, player);
            flag26 = false;
            flag46 = false;
            gameBoard[6][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag46 == true && player == false && gameBoard[6][3] == 0) {
            lineChange(lbl36, dot26, dot46, player);
            flag26 = false;
            flag46 = false;
            gameBoard[6][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag28 == true && player == true && gameBoard[7][2] == 0){
            lineChange(lbl27, dot26, dot28, player);
            flag26 = false;
            flag28 = false;
            gameBoard[7][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag28 == true && player == false && gameBoard[7][2] == 0) {
            lineChange(lbl27, dot26, dot28, player);
            flag26 = false;
            flag28 = false;
            gameBoard[7][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag06 == true && player == true && gameBoard[6][1] == 0){
            lineChange(lbl16, dot26, dot06, player);
            flag26 = false;
            flag06 = false;
            gameBoard[6][1]=1;
            scoring();
            PlayersTurn();
         }else if(flag06 == true && player == false && gameBoard[6][1] == 0) {
            lineChange(lbl16, dot26, dot06, player);
            flag26 = false;
            flag06 = false;
            gameBoard[6][1]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot28) {
         dot28.setStyle("-fx-background-color: black;");
         flag28 =true;
         gameBoard[2][8]=1;
         buttonCheck();
         if(flag26 == true && player == true && gameBoard[7][2] == 0){
            lineChange(lbl27, dot28, dot26, player);
            flag28 = false;
            flag26 = false;
            gameBoard[7][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag26 == true && player == false && gameBoard[7][2] == 0) {
            lineChange(lbl27, dot28, dot26, player);
            flag28 = false;
            flag26 = false;
            gameBoard[7][2]=1;
            scoring();
            PlayersTurn();
         }else if(flag48 == true && player == true && gameBoard[8][3] == 0){
            lineChange(lbl38, dot28, dot48, player);
            flag28 = false;
            flag48 = false;
            gameBoard[8][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag48 == true && player == false && gameBoard[8][3] == 0) {
            lineChange(lbl38, dot28, dot48, player);
            flag28 = false;
            flag48 = false;
            gameBoard[8][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag08 == true && player == true && gameBoard[8][1] == 0){
            lineChange(lbl18, dot28, dot08, player);
            flag28 = false;
            flag08 = false;
            gameBoard[8][1]=1;
            scoring();
            PlayersTurn();
         }else if(flag08 == true && player == false && gameBoard[8][1] == 0) {
            lineChange(lbl18, dot28, dot08, player);
            flag28 = false;
            flag08 = false;
            gameBoard[8][1]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot40) {
         dot40.setStyle("-fx-background-color: black;");
         flag40 =true;
         gameBoard[4][0]=1;
         buttonCheck();
         if(flag60 == true && player == true && gameBoard[0][5] == 0){
            lineChange(lbl50, dot40, dot60, player);
            flag40 = false;
            flag60 = false;
            gameBoard[0][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag60 == true && player == false && gameBoard[0][5] == 0) {
            lineChange(lbl50, dot40, dot60, player);
            flag40 = false;
            flag60 = false;
            gameBoard[0][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag42 == true && player == true && gameBoard[1][4] == 0){
            lineChange(lbl41, dot40, dot42, player);
            flag40 = false;
            flag42 = false;
            gameBoard[1][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag42 == true && player == false && gameBoard[1][4] == 0) {
            lineChange(lbl41, dot40, dot42, player);
            flag40 = false;
            flag42 = false;
            gameBoard[1][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag20 == true && player == true && gameBoard[0][3] == 0){
            lineChange(lbl30, dot40, dot20, player);
            flag40 = false;
            flag20 = false;
            gameBoard[0][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag20 == true && player == false && gameBoard[0][3] == 0) {
            lineChange(lbl30, dot40, dot20, player);
            flag40 = false;
            flag20 = false;
            gameBoard[0][3]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot42) {
         dot42.setStyle("-fx-background-color: black;");
         flag42 =true;
         gameBoard[4][2]=1;
         buttonCheck();
         if(flag40== true && player == true && gameBoard[1][4] == 0){
            lineChange(lbl41, dot42, dot40, player);
            flag42 = false;
            flag40 = false;
            gameBoard[1][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag40 == true && player == false && gameBoard[1][4] == 0) {
            lineChange(lbl41, dot42, dot40, player);
            flag42 = false;
            flag40 = false;
            gameBoard[1][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag62== true && player == true && gameBoard[2][5] == 0){
            lineChange(lbl52, dot42, dot62, player);
            flag42 = false;
            flag62 = false;
            gameBoard[2][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag62 == true && player == false && gameBoard[2][5] == 0) {
            lineChange(lbl52, dot42, dot62, player);
            flag42 = false;
            flag62 = false;
            gameBoard[2][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag44== true && player == true && gameBoard[3][4] == 0){
            lineChange(lbl43, dot42, dot44, player);
            flag42 = false;
            flag44 = false;
            gameBoard[3][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag44 == true && player == false && gameBoard[3][4] == 0) {
            lineChange(lbl43, dot42, dot44, player);
            flag42 = false;
            flag44 = false;
            gameBoard[3][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag22== true && player == true && gameBoard[2][3] == 0){
            lineChange(lbl32, dot42, dot22, player);
            flag42 = false;
            flag22 = false;
            gameBoard[2][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag22 == true && player == false && gameBoard[2][3] == 0) {
            lineChange(lbl32, dot42, dot22, player);
            flag42 = false;
            flag22 = false;
            gameBoard[2][3]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot44) {
         dot44.setStyle("-fx-background-color: black;");
         flag44 =true;
         gameBoard[4][4]=1;
         buttonCheck();
         if(flag42== true && player == true && gameBoard[3][4] == 0){
            lineChange(lbl43, dot44, dot42, player);
            flag44 = false;
            flag42 = false;
            gameBoard[3][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag42 == true && player == false && gameBoard[3][4] == 0) {
            lineChange(lbl43, dot44, dot42, player);
            flag44 = false;
            flag42 = false;
            gameBoard[3][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag64== true && player == true && gameBoard[4][5] == 0){
            lineChange(lbl54, dot44, dot64, player);
            flag44 = false;
            flag64 = false;
            gameBoard[4][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag64 == true && player == false && gameBoard[4][5] == 0) {
            lineChange(lbl54, dot44, dot64, player);
            flag44 = false;
            flag64 = false;
            gameBoard[4][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag46== true && player == true && gameBoard[5][4] == 0){
            lineChange(lbl45, dot44, dot46, player);
            flag44 = false;
            flag46 = false;
            gameBoard[5][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag46 == true && player == false && gameBoard[5][4] == 0) {
            lineChange(lbl45, dot44, dot46, player);
            flag44 = false;
            flag46 = false;
            gameBoard[5][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag24== true && player == true && gameBoard[4][3] == 0){
            lineChange(lbl34, dot44, dot24, player);
            flag44 = false;
            flag24 = false;
            gameBoard[4][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag24 == true && player == false && gameBoard[4][3] == 0) {
            lineChange(lbl34, dot44, dot24, player);
            flag44 = false;
            flag24 = false;
            gameBoard[4][3]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot46) {
         dot46.setStyle("-fx-background-color: black;");
         flag46 =true;
         gameBoard[4][6]=1;
         buttonCheck();
         if(flag44== true && player == true && gameBoard[5][4] == 0){
            lineChange(lbl45, dot44, dot44, player);
            flag46 = false;
            flag44 = false;
            gameBoard[5][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag44 == true && player == false && gameBoard[5][4] == 0) {
            lineChange(lbl45, dot44, dot44, player);
            flag46 = false;
            flag44 = false;
            gameBoard[5][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag66== true && player == true && gameBoard[6][5] == 0){
            lineChange(lbl56, dot46, dot66, player);
            flag46 = false;
            flag66 = false;
            gameBoard[6][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag66 == true && player == false && gameBoard[6][5] == 0) {
            lineChange(lbl56, dot46, dot66, player);
            flag46 = false;
            flag66 = false;
            gameBoard[6][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag48== true && player == true && gameBoard[7][4] == 0){
            lineChange(lbl47, dot46, dot48, player);
            flag46 = false;
            flag48 = false;
            gameBoard[7][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag48 == true && player == false && gameBoard[7][4] == 0) {
            lineChange(lbl47, dot46, dot48, player);
            flag46 = false;
            flag48 = false;
            gameBoard[7][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag26== true && player == true && gameBoard[6][3] == 0){
            lineChange(lbl36, dot46, dot26, player);
            flag46 = false;
            flag26 = false;
            gameBoard[6][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag26 == true && player == false && gameBoard[6][3] == 0) {
            lineChange(lbl36, dot46, dot26, player);
            flag46 = false;
            flag26 = false;
            gameBoard[6][3]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot48) {
         dot48.setStyle("-fx-background-color: black;");
         flag48 =true;
         gameBoard[4][8]=1;
         buttonCheck();
         if(flag46== true && player == true && gameBoard[7][4] == 0){
            lineChange(lbl47, dot48, dot46, player);
            flag48 = false;
            flag46 = false;
            gameBoard[7][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag46 == true && player == false && gameBoard[7][4] == 0) {
            lineChange(lbl47, dot48, dot46, player);
            flag48 = false;
            flag46 = false;
            gameBoard[7][4]=1;
            scoring();
            PlayersTurn();
         }else if(flag68== true && player == true && gameBoard[8][5] == 0) {
            lineChange(lbl58, dot48, dot68, player);
            flag48 = false;
            flag68 = false;
            gameBoard[8][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag68 == true && player == false && gameBoard[8][5] == 0) {
            lineChange(lbl58, dot48, dot68, player);
            flag48 = false;
            flag68 = false;
            gameBoard[8][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag28== true && player == true && gameBoard[8][3] == 0){
            lineChange(lbl38, dot48, dot28, player);
            flag48 = false;
            flag28 = false;
            gameBoard[8][3]=1;
            scoring();
            PlayersTurn();
         }else if(flag28 == true && player == false && gameBoard[8][3] == 0) {
            lineChange(lbl38, dot48, dot28, player);
            flag48 = false;
            flag28 = false;
            gameBoard[8][3]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot60) {
         dot60.setStyle("-fx-background-color: black;");
         flag60 =true;
         gameBoard[6][0]=1;
         buttonCheck();
         if(flag80== true && player == true && gameBoard[0][7] == 0){
            lineChange(lbl70, dot60, dot80, player);
            flag60 = false;
            flag80 = false;
            gameBoard[0][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag80 == true && player == false && gameBoard[0][7] == 0) {
            lineChange(lbl70, dot60, dot80, player);
            flag60 = false;
            flag80 = false;
            gameBoard[0][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag62== true && player == true && gameBoard[1][6] == 0){
            lineChange(lbl61, dot60, dot62, player);
            flag60 = false;
            flag62 = false;
            gameBoard[1][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag62 == true && player == false && gameBoard[1][6] == 0) {
            lineChange(lbl61, dot60, dot62, player);
            flag60 = false;
            flag62 = false;
            gameBoard[1][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag40== true && player == true && gameBoard[0][5] == 0){
            lineChange(lbl50, dot60, dot40, player);
            flag60 = false;
            flag40 = false;
            gameBoard[0][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag40 == true && player == false && gameBoard[0][5] == 0) {
            lineChange(lbl50, dot60, dot40, player);
            flag60 = false;
            flag40 = false;
            gameBoard[0][5]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot62) {
         dot62.setStyle("-fx-background-color: black;");
         flag62 =true;
         gameBoard[6][2]=1;
         buttonCheck();
         if(flag60== true && player == true && gameBoard[1][6] == 0){
            lineChange(lbl61, dot62, dot60, player);
            flag62 = false;
            flag60 = false;
            gameBoard[1][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag60 == true && player == false && gameBoard[1][6] == 0) {
            lineChange(lbl61, dot62, dot60, player);
            flag62 = false;
            flag60 = false;
            gameBoard[1][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag82== true && player == true && gameBoard[2][7] == 0){
            lineChange(lbl72, dot62, dot82, player);
            flag62 = false;
            flag82 = false;
            gameBoard[2][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag82 == true && player == false && gameBoard[2][7] == 0) {
            lineChange(lbl72, dot62, dot82, player);
            flag62 = false;
            flag82 = false;
            gameBoard[2][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag64== true && player == true && gameBoard[3][6] == 0){
            lineChange(lbl63, dot62, dot64, player);
            flag62 = false;
            flag64 = false;
            gameBoard[3][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag64 == true && player == false && gameBoard[3][6] == 0) {
            lineChange(lbl63, dot62, dot64, player);
            flag62 = false;
            flag64 = false;
            gameBoard[3][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag42== true && player == true && gameBoard[2][5] == 0){
            lineChange(lbl52, dot62, dot42, player);
            flag62 = false;
            flag42 = false;
            gameBoard[2][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag42 == true && player == false && gameBoard[2][5] == 0) {
            lineChange(lbl52, dot62, dot42, player);
            flag62 = false;
            flag42 = false;
            gameBoard[2][5]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot64) {
         dot64.setStyle("-fx-background-color: black;");
         flag64 =true;
         gameBoard[6][4]=1;
         buttonCheck();
         if(flag62== true && player == true && gameBoard[3][6] == 0){
            lineChange(lbl63, dot64, dot62, player);
            flag64 = false;
            flag62 = false;
            gameBoard[3][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag62 == true && player == false && gameBoard[3][6] == 0) {
            lineChange(lbl63, dot64, dot62, player);
            flag64 = false;
            flag62 = false;
            gameBoard[3][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag84== true && player == true && gameBoard[4][7] == 0){
            lineChange(lbl74, dot64, dot84, player);
            flag64 = false;
            flag84 = false;
            gameBoard[4][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag84 == true && player == false && gameBoard[4][7] == 0) {
            lineChange(lbl74, dot64, dot84, player);
            flag64 = false;
            flag84 = false;
            gameBoard[4][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag66== true && player == true && gameBoard[5][6] == 0){
            lineChange(lbl65, dot64, dot66, player);
            flag64 = false;
            flag66 = false;
            gameBoard[5][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag66 == true && player == false && gameBoard[5][6] == 0) {
            lineChange(lbl65, dot64, dot66, player);
            flag64 = false;
            flag66 = false;
            gameBoard[5][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag44== true && player == true && gameBoard[4][5] == 0){
            lineChange(lbl54, dot64, dot44, player);
            flag64 = false;
            flag44 = false;
            gameBoard[4][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag44 == true && player == false && gameBoard[4][5] == 0) {
            lineChange(lbl54, dot64, dot44, player);
            flag64 = false;
            flag44 = false;
            gameBoard[4][5]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot66) {
         dot66.setStyle("-fx-background-color: black;");
         flag66 =true;
         gameBoard[6][6]=1;
         buttonCheck();
         if(flag64== true && player == true && gameBoard[5][6] == 0) {
            lineChange(lbl65, dot66, dot64, player);
            flag66 = false;
            flag64 = false;
            gameBoard[5][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag64 == true && player == false && gameBoard[5][6] == 0) {
            lineChange(lbl65, dot66, dot64, player);
            flag66 = false;
            flag64 = false;
            gameBoard[5][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag86== true && player == true && gameBoard[6][7] == 0){
            lineChange(lbl76, dot66, dot86, player);
            flag66 = false;
            flag86 = false;
            gameBoard[6][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag86 == true && player == false && gameBoard[6][7] == 0) {
            lineChange(lbl76, dot66, dot86, player);
            flag66 = false;
            flag86 = false;
            gameBoard[6][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag68== true && player == true && gameBoard[7][6] == 0){
            lineChange(lbl67, dot66, dot68, player);
            flag66 = false;
            flag68 = false;
            gameBoard[7][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag68 == true && player == false && gameBoard[7][6] == 0) {
            lineChange(lbl67, dot66, dot68, player);
            flag66 = false;
            flag68 = false;
            gameBoard[7][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag46== true && player == true && gameBoard[6][5] == 0){
            lineChange(lbl56, dot66, dot46, player);
            flag66 = false;
            flag46 = false;
            gameBoard[6][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag46 == true && player == false && gameBoard[6][5] == 0) {
            lineChange(lbl56, dot66, dot46, player);
            flag66 = false;
            flag46 = false;
            gameBoard[6][5]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot68) {
         dot68.setStyle("-fx-background-color: black;");
         flag68 =true;
         gameBoard[6][8]=1;
         buttonCheck();
         if(flag66== true && player == true && gameBoard[7][6] == 0){
            lineChange(lbl67, dot68, dot66, player);
            flag68 = false;
            flag66 = false;
            gameBoard[7][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag66 == true && player == false && gameBoard[7][6] == 0) {
            lineChange(lbl67, dot68, dot66, player);
            flag68 = false;
            flag66 = false;
            gameBoard[7][6]=1;
            scoring();
            PlayersTurn();
         }else if(flag88== true && player == true && gameBoard[8][7] == 0){
            lineChange(lbl78, dot68, dot88, player);
            flag68 = false;
            flag88 = false;
            gameBoard[8][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag88 == true && player == false && gameBoard[8][7] == 0) {
            lineChange(lbl78, dot68, dot88, player);
            flag68 = false;
            flag88 = false;
            gameBoard[8][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag48== true && player == true && gameBoard[8][5] == 0){
            lineChange(lbl58, dot68, dot48, player);
            flag68 = false;
            flag48 = false;
            gameBoard[8][5]=1;
            scoring();
            PlayersTurn();
         }else if(flag48 == false && player == false && gameBoard[8][5] == 0) {
            lineChange(lbl58, dot68, dot48, player);
            flag68 = false;
            flag48 = false;
            gameBoard[8][5]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot80) {
         dot80.setStyle("-fx-background-color: black;");
         flag80 =true;
         gameBoard[8][0]=1;
         buttonCheck();
         if(flag82== true && player == true && gameBoard[1][8] == 0){
            lineChange(lbl81, dot80, dot82, player);
            flag80 = false;
            flag82 = false;
            gameBoard[1][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag82 == true && player == false && gameBoard[1][8] == 0) {
            lineChange(lbl81, dot80, dot82, player);
            flag80 = false;
            flag82 = false;
            gameBoard[1][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag60== true && player == true && gameBoard[0][7] == 0){
            lineChange(lbl70, dot80, dot60, player);
            flag80 = false;
            flag60 = false;
            gameBoard[0][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag60 == true && player == false && gameBoard[0][7] == 0) {
            lineChange(lbl70, dot80, dot60, player);
            flag80 = false;
            flag60 = false;
            gameBoard[0][7]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot82) {
         dot82.setStyle("-fx-background-color: black;");
         flag82 =true;
         gameBoard[8][2]=1;
         buttonCheck();
         if(flag80== true && player == true && gameBoard[1][8] == 0){
            lineChange(lbl81, dot82, dot80, player);
            flag82 = false;
            flag80 = false;
            gameBoard[1][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag80 == true && player == false && gameBoard[1][8] == 0) {
            lineChange(lbl81, dot82, dot80, player);
            flag82 = false;
            flag80 = false;
            gameBoard[1][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag84== true && player == true && gameBoard[3][8] == 0){
            lineChange(lbl83, dot82, dot84, player);
            flag82 = false;
            flag84 = false;
            gameBoard[3][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag84 == true && player == false && gameBoard[3][8] == 0) {
            lineChange(lbl83, dot82, dot84, player);
            flag82 = false;
            flag84 = false;
            gameBoard[3][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag62== true && player == true && gameBoard[2][7] == 0){
            lineChange(lbl72, dot82, dot62, player);
            flag82 = false;
            flag62 = false;
            gameBoard[2][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag62 == true && player == false && gameBoard[2][7] == 0) {
            lineChange(lbl72, dot82, dot62, player);
            flag82 = false;
            flag62 = false;
            gameBoard[2][7]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot84) {
         dot84.setStyle("-fx-background-color: black;");
         flag84 =true;
         gameBoard[8][4]=1;
         buttonCheck();
         if(flag82== true && player == true && gameBoard[3][8] == 0){
            lineChange(lbl83, dot84, dot82, player);
            flag84 = false;
            flag82 = false;
            gameBoard[3][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag82 == true && player == false && gameBoard[3][8] == 0) {
            lineChange(lbl83, dot84, dot82, player);
            flag84 = false;
            flag82 = false;
            gameBoard[3][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag86== true && player == true && gameBoard[5][8] == 0){
            lineChange(lbl85, dot84, dot86, player);
            flag84 = false;
            flag86 = false;
            gameBoard[5][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag86 == true && player == false && gameBoard[5][8] == 0) {
            lineChange(lbl85, dot84, dot86, player);
            flag84 = false;
            flag86 = false;
            gameBoard[5][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag64== true && player == true && gameBoard[4][7] == 0){
            lineChange(lbl74, dot84, dot64, player);
            flag84 = false;
            flag64 = false;
            gameBoard[4][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag64 == true && player == false && gameBoard[4][7] == 0) {
            lineChange(lbl74, dot84, dot64, player);
            flag84 = false;
            flag64 = false;
            gameBoard[4][7]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot86) {
         dot86.setStyle("-fx-background-color: black;");
         flag86 =true;
         gameBoard[8][6]=1;
         buttonCheck();
         if(flag84== true && player == true && gameBoard[5][8] == 0){
            lineChange(lbl85, dot86, dot84, player);
            flag86 = false;
            flag84 = false;
            gameBoard[5][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag84 == true && player == false && gameBoard[5][8] == 0) {
            lineChange(lbl85, dot86, dot84, player);
            flag86 = false;
            flag84 = false;
            gameBoard[5][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag88== true && player == true && gameBoard[7][8] == 0){
            lineChange(lbl87, dot86, dot88, player);
            flag86 = false;
            flag88 = false;
            gameBoard[7][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag88 == true && player == false && gameBoard[7][8] == 0) {
            lineChange(lbl87, dot86, dot88, player);
            flag86 = false;
            flag88 = false;
            gameBoard[7][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag66== true && player == true && gameBoard[6][7] == 0) {
            lineChange(lbl76, dot86, dot66, player);
            flag86 = false;
            flag66 = false;
            gameBoard[6][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag66 == true && player == false && gameBoard[6][7] == 0) {
            lineChange(lbl76, dot86, dot66, player);
            flag86 = false;
            flag66 = false;
            gameBoard[6][7]=1;
            scoring();
            PlayersTurn();
         }
      }else if(event.getSource() == dot88) {
         dot88.setStyle("-fx-background-color: black;");
         flag88 =true;
         gameBoard[8][8]=1;
         buttonCheck();
         if(flag86== true && player == true && gameBoard[7][8] == 0){
            lineChange(lbl87, dot88, dot86, player);
            flag88 = false;
            flag86 = false;
            gameBoard[7][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag86 == true && player == false && gameBoard[7][8] == 0) {
            lineChange(lbl87, dot88, dot86, player);
            flag88 = false;
            flag86 = false;
            gameBoard[7][8]=1;
            scoring();
            PlayersTurn();
         }else if(flag68== true && player == true && gameBoard[8][7] == 0){
            lineChange(lbl78, dot88, dot68, player);
            flag88 = false;
            flag68 = false;
            gameBoard[8][7]=1;
            scoring();
            PlayersTurn();
         }else if(flag68 == true && player == false && gameBoard[8][7] == 0) {
            lineChange(lbl78, dot88, dot68, player);
            flag88 = false;
            flag68 = false;
            gameBoard[8][7]=1;
            scoring();
            PlayersTurn();
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

      PlayersTurn();
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
      btn.setStyle("-fx-background-color: grey;");
      btn.setMinWidth(25);
      btn.setMinHeight(25);
      btn.setMaxWidth(25);
      btn.setMaxHeight(25);
   }

   private void PlayersTurn() {
      if(!player){
         lblPlayerOne.setStyle("-fx-background-color: transparent;");
         lblPlayerTwo.setStyle("-fx-background-color: yellow;");
      }
      else{
         lblPlayerTwo.setStyle("-fx-background-color: transparent;");
         lblPlayerOne.setStyle("-fx-background-color: yellow;");
      }
      
   }
}
