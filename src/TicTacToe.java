
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;


import javafx.scene.layout.BorderPane;


import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author oliwe
 */
public class TicTacToe extends Application {
    

    @Override
    public void start(Stage primaryStage) 
    {
        try {
            FXMLLoader loader=new FXMLLoader(this.getClass().getResource("/Game/Game.fxml"));
            BorderPane borderPane=loader.load();
            
            Scene scene=new Scene(borderPane);
            scene.getStylesheets().add("/Game/game.css");
            primaryStage.setScene(scene);
            primaryStage.setTitle("TicTacToe Game");
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
