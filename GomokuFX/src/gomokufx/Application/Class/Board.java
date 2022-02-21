/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokufx.Application.Class;

/**
 *
 * @author rickyzheng
 */
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import gomokufx.Application.UI.UI;
import gomokufx.Application.methods.Win;

public class Board extends Pane{
    
    public char token = ' '; //B: black, W: white
    public int currStep; //mark the current step
    private Alert winner = new Alert(AlertType.INFORMATION);
    private Chess chess = null;
    
    //table: 25 x 25
    public Board(int x, int y){
        setStyle("-fx-border-color:black");
        this.setPrefSize(100, 100); //unsure
        this.setOnMouseClicked(e -> handleMouseClick(x,y));
        
    }
    
    public void handleMouseClick(int x, int y){
        
        if(UI.AIPlay ==false && token==' '){
            setToken(UI.token,x,y);
            if(Win.isWin(x,y)){
                
            }
            else{
                UI.token = (UI.token=='B')?'W':'B';
            }
        }
        
        if(UI.AIPlay == false && token==' '){
            setToken(UI.token, x,y);
            if(Win.isWin(x,y)){
                   
            }
            else{
                UI.token = (UI.token=='B')?'W':'B';
            }
        }
        
        public void setToken(char c, int x, int y){
            this.token = c;
            Chess chess = null;
            UI.step++;
            if(this.token =='B'){
                chess = new Chess(20,Color.BLACK);
            }
            else if(this.token=='W'){
                chess = new Chess(20,Color.WHITE);
            }
            //place the chess to the chessboards
        }
    }
    
}
