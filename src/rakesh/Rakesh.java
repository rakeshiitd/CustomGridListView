/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakesh;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.controlsfx.control.GridCell;
import org.controlsfx.control.GridView;

/**
 *
 * @author 5110
 */
public class Rakesh extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ObservableList listViewItems = FXCollections.observableArrayList();
        ListView listView = new ListView(listViewItems);
        listView.setCellFactory(new Callback<ListView<Dog>, ListCell<Dog>>() {
        public ListCell<Dog> call(ListView<Dog> listView) {
        return new ColorGridCell2();
     }
 });  
         for (int i = 1; i <= 200000; i++) {
                           listViewItems.add(new Dog(Integer.toString(i)));
                        }
        
        StackPane root = new StackPane();
        root.getChildren().addAll(listView);
        
        Scene scene = new Scene(root, 300, 250);
        
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
