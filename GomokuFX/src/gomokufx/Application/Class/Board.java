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

public class Board extends Pane{
    
    public char token = ' '; //B: black, W: white
    public int currStep; //mark the current step
    
    public Board(int x, int y){
        setStyle("-fx-border-color:black");
        this.setPrefSize(100, 100); //unsure
        this.setOnMouseClicked(e -> mouseClick(x,y));
        
    }
    
    public void mouseClick(int x, int y){
        
    }
    
}
