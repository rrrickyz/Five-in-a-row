/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokufx.Application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import java.util.List;
import java.util.ArrayList;
import javafx.scene.layout.GridPane;

/**
 *
 * @author rickyzheng
 */
public class GomokuFX extends Application {

    /**
     * @param args the command line arguments
     */
    
    private ChessPiece[][] chessBoard;   
    static GridPane root;
    static int size;
    
    //the UI
    @Override
    public void start(Stage stage)throws Exception{
        //stage
        root = new GridPane();
        stage.setTitle("Gomoku game");
        Button human_human = new Button();
        human_human.setText("Human vs. Human");
        Button human_ai = new Button();
        human_ai.setText("Human vs. AI");
        
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(GomokuFX.class);
    }
    
}
