package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
//https://www.geeksforgeeks.org/javafx-textinputdialog/
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        TextInputDialog td = new TextInputDialog();
        GridPane p1 = new GridPane();
        Button button = new Button("Add students");
        ArrayList<Label> arr = new ArrayList<>();
        Label larr = new Label("Student's names");


        //adding students using add student button


// create a event handler

        List<String> list = new ArrayList<>();

        list.add( "a" );
        list.add( "b" );
        list.add( "c" );

        List<Label> labels = list
                .stream()
                .map( Label::new )
                .collect(Collectors.toList());


        TextArea studentlist = new TextArea();

        p1.add(button, 0, 0, 1, 1);
        p1.add(labels, 0, 1 , 1, 1);

        Scene scene = new Scene(p1);
        stage.setScene(scene);
        stage.setMinHeight(300);
        stage.setMinWidth(400);
        stage.setTitle("Attendence");
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
*/


import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("add student");
        Button label = new Button("add names");

        TextInputDialog td = new TextInputDialog();

        ArrayList<Label> arr = new ArrayList<>();

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                // show the text input dialog
                td.showAndWait();

                // set the text of the label
                Label l = new Label("Student's names");
                l.setText(td.getEditor().getText());
                arr.add(l);
            }
        };

        // set on action of event
        button.setOnAction(event);
        window.setTitle("Pizza ordering system");
        MenuBar menuBar = new MenuBar();
        Menu orderMenu = new Menu("Order");
        orderMenu.getItems().addAll(new OrderMenu().getmenuItems());
        menuBar.getMenus().add(orderMenu);
        GridPane p = new GridPane();
        p.add(label, 0, 0, 1, 1);
        p.add(menuBar, 0, 1, 1, 1);
        
        VBox vBox = new VBox(p);
        Scene scene = new Scene(vBox, 300, 300);
        window.setScene(scene);
        window.show();
    }
}

class OrderMenu {

    public ArrayList<MenuItem> menuItems;

    public OrderMenu (){

        menuItems = new ArrayList<>();
        menuItems.add(new Pizza("Margherita",50) );
        menuItems.add(new Pizza("Hawaii", 55));
        menuItems.add(new Pizza("Marinara", 70));
        menuItems.add(new Pizza("Meat Lovers", 70));
        menuItems.add(new Pizza("Calazone", 60));
    }

    public ArrayList<MenuItem> getmenuItems() {
        return menuItems;
    }
}

class Pizza extends MenuItem {

    Pizza(String name, int cost) {
        setText(name +" $"+cost);
        setOnAction(e-> System.out.println(name+ " piza ordered"));
    }
}
