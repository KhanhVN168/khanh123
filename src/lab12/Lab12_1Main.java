/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 *
 * @author icom
 */
public class Lab12_1Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        GridPane root = FXMLLoader.load(getClass().getResource("lab12.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Registration");
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
