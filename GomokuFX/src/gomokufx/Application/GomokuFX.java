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
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

import javafx.event.ActionEvent;

import java.io.FileInputStream;

import gomokufx.Application.Class.Board;

/**
 *
 * @author rickyzheng
 */
public class GomokuFX extends Application {

    /**
     * @param args the command line arguments
     */
    
    private Board[][] Board;   
    static GridPane root;
    static int size;
    
    //the UI
    @Override
    public void start(Stage window)throws Exception{
        
        window.setWidth(920);
        window.setHeight(700);
        //stage
        root = new GridPane();
        window.setTitle("Gomoku game");
        
        //import chessboard image
        FileInputStream input = new FileInputStream("build/static/chessboard.png");
        Image image = new Image(input);
        ImageView imageView1 = new ImageView(image);
        ImageView imageView2 = new ImageView(image);
        /*
        BorderPane chessboard = new BorderPane();
        chessboard.setMaxSize(imageView1.getFitHeight(), imageView1.getFitWidth());
        chessboard.setCenter(imageView1);
        String outer_style = "-fx-border-color: black;"+"-fx-border-width: 5;";
        chessboard.setStyle(outer_style); 
        */
        
        //vertical lines for buttons
        VBox buttons1 = new VBox();
        buttons1.setPrefSize(250, 50);
        //set buttons and texts
        Button human_human = new Button("Human vs. Human"); 
        Button human_ai = new Button("Human vs. AI");
        Button exit = new Button("Exit Game");
        //set font
        Font font = Font.font("Arial",FontWeight.BOLD,20);
        human_human.setFont(font);
        human_ai.setFont(font);
        exit.setFont(font);
        //set size
        human_human.setMinSize(250,50);
        human_ai.setMinSize(250,50);
        exit.setMinSize(250, 50);
        //set spacing
        buttons1.getChildren().add(human_human);
        buttons1.setMargin(human_human,new Insets(180,20,0,10));
        buttons1.getChildren().add(human_ai);
        buttons1.setMargin(human_ai,new Insets(0,20,0,10));
        buttons1.getChildren().add(exit);
        buttons1.setMargin(exit,new Insets(0,20,0,10));
        buttons1.setSpacing(50);
        
        //the window's layout
        BorderPane layout1 = new BorderPane();
        layout1.setRight(buttons1);
        layout1.setCenter(imageView1);
        layout1.setMargin(imageView1, new Insets(20,10,20,20));
        
        //default scene
        //root.getChildren().add(layout);       
        Scene primaryScene = new Scene(layout1);
        
        //set buttons, size, font, layout
        Button back = new Button("Return");
        back.setMaxSize(250, 50);
        back.setMinSize(250,50);
        back.setFont(font);
        Button withdraw = new Button("Withdraw");
        withdraw.setMaxSize(250, 50);
        withdraw.setMinSize(250,50);
        withdraw.setFont(font);
        Button restart = new Button("Restart");
        restart.setFont(font);
        restart.setMaxSize(250, 50);
        restart.setMinSize(250,50);
        VBox buttons2 = new VBox();
        buttons2.getChildren().add(withdraw);
        buttons2.setMargin(withdraw,new Insets(180,20,0,10));
        buttons2.getChildren().add(restart);
        buttons2.setMargin(restart,new Insets(0,20,0,10));
        buttons2.getChildren().add(back);
        buttons2.setMargin(back,new Insets(0,20,0,10));
        buttons2.setSpacing(50);
        
        //scene: play
        BorderPane layout2 = new BorderPane();
        layout2.setCenter(imageView2);
        layout2.setMargin(imageView2, new Insets(20,10,20,20));
        layout2.setRight(buttons2);
        
        Scene play = new Scene(layout2);
        
        window.setScene(primaryScene);
        
        //buttons' onclicks
        human_human.setOnAction(e -> window.setScene(play));
        back.setOnAction(e -> window.setScene(primaryScene));
        human_ai.setOnAction(e -> window.setScene(play));
        exit.setOnAction(e -> window.close());
        
        window.show();
    }
    
    
   
    public static void main(String[] args) {
        launch(GomokuFX.class);
    }
    
}
