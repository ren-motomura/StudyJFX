package dance.ballroom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ren
 */
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root;
        try {
            root = FXMLLoader.load(getClass().getResource("app.fxml"));
        } catch (IOException e) {
            root = new GridPane();
        }
        
        Scene scene = new Scene(root, 300, 275);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
