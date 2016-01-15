/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakesh;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Callback;
import org.controlsfx.control.GridCell;
import org.controlsfx.control.GridView;

/**
 *
 * @author 5110
 */
public class ColorGridCell2 extends ListCell<Dog> {
    public Rectangle rectangle;
        public Button changeFillButton;
        public Button changeStrokeButton;
        public HBox buttonHBox;
        public Dog lastitem;
        public Pane pane;
        public Button btn = new Button("x");
        ObservableList listViewItems;
        GridView gridView0;

    public ColorGridCell2() { 
        this.listViewItems = FXCollections.observableArrayList(new Dog("Julia"), new Dog("Ian"), new Dog("Sue"), new Dog("Matthew"), new Dog("Hannah"), new Dog("Stephan"), new Dog("Denise"));
        GridView listView = new GridView(this.listViewItems);
        listView.setCellFactory(new Callback<GridView<Dog>, GridCell<Dog>>() {
        public GridCell<Dog> call(GridView<Dog> gridView) {
        return new ColorGridCell3();
     }
 });
    this.gridView0=listView;
    Pane pane = new Pane();
            pane.getStyleClass().add("gridpane");
            Image img = new Image("resources/high.jpg");
            ImageView imgview = new ImageView();
            imgview.setImage(img);
            pane.getChildren().addAll(imgview,listView);
            this.pane = pane;
    }
       
    @Override
    public void updateItem(Dog item, boolean empty) {
        super.updateItem(item, empty);
        setEditable(false);
        if (item != null) {
            if (empty) {
                lastitem = null;
                setGraphic(null);
            } else {
            lastitem = item;
            btn.setText(item.name);
            
            setGraphic(gridView0);
            }
            
        } else {
            setText(null);
            setGraphic(null);
        }
    }   
    class ColorGridCell3 extends GridCell<Dog> {
    public Rectangle rectangle;
        public Button changeFillButton;
        public Button changeStrokeButton;
        public HBox buttonHBox;
        public Dog lastitem;
        public Pane pane;
        public Button btn = new Button("x");
        ObservableList listViewItems = FXCollections.observableArrayList();
        Button btn3= new Button("y");

    public ColorGridCell3() { 
    Pane pane = new Pane();
            pane.getStyleClass().add("gridpane");
            pane.getChildren().addAll(btn3);
            this.pane = pane;
    }
       
    @Override
    public void updateItem(Dog item, boolean empty) {
        super.updateItem(item, empty);
        setEditable(false);
        if (item != null) {
            if (empty) {
                lastitem = null;
                setGraphic(null);
            } else {
            lastitem = item;
            btn3.setText(item.name);
            btn3.setMinHeight(50);
            btn3.setMinWidth(50);
            
            
            setGraphic(pane);
            }
            
        } else {
            setText(null);
            setGraphic(pane);
        }
    }   
 }
 }


