/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak14_keyvin.jourdan;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Praktikan
 */
public class Prak14_KeyvinJourdan extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Keyvin Jourdan-2117051076");
        
        stage.setScene(scene);
        stage.show();
//        Button btn = new Button("Submit");
//        Label txt = new Label(" ");
//        
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                  txt.setText("Hello World!");
////                txt.setText("Nama : Keyvin Jourdan\n NPM : 2117051076 \n umur : 19");
////                txt.setText("NPM  : 2117051076");
////                txt.setText("Umur : 19");
//            }
//        });
//        
//    
//        
////        StackPane root = new StackPane();
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.getChildren().add(txt);
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root);
//        
//        stage.setHeight(300);
//        stage.setWidth(300);
//        stage.setScene(scene);
//        stage.setTitle("Keyvin Jourdan_2117051076");
//        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
