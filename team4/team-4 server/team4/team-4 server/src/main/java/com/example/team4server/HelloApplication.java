package com.example.team4server;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloApplication extends Application {
    @Override


    public void start(Stage primaryStage) throws Exception {
        VBox layout = new VBox();
        VBox layout2 = new VBox();
        VBox layout3 = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout2.setAlignment(Pos.CENTER);
        layout3.setAlignment(Pos.CENTER);
        //set for first scene
        Scene scene = new Scene(layout, 800, 600);
        FileInputStream input = new FileInputStream("C:\\\\Users\\\\Froze\\\\IdeaProjects\\\\team4\\\\team-4 server\\\\src\\\\main\\\\resources\\\\com\\\\stream_pi\\\\server\\\\icons\\\\image.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(128);
        imageView.setFitWidth(128);

        //set up a popup windows ready to use
        Button b = new Button("Okay");

        // create a alert
        Alert a = new Alert(AlertType.NONE);

        // action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                // set alert type
                a.setAlertType(AlertType.CONFIRMATION);

                // set content text
                a.setContentText("You are set. Press OK to continue or Cancel for configuration!");

                // show the dialog
                a.show();
            }
        };


        Label label1 = new Label("Team 4", imageView);
        label1.setFont(Font.font("Verdana", FontWeight.BOLD, 70));


        //set for 2nd scene
        Label label2 = new Label("Introducing");
        label2.setFont(Font.font("Verdana", FontWeight.BOLD, 30));
        Scene scene2 = new Scene(layout2, 800, 600);

        //set for 3rd scene
        Scene scene3 = new Scene(layout3, 800, 600);

        Label label3 = new Label("Set up for IP");

        //creating buttons
        Button button = new Button("Next");
        button.setOnAction(e -> primaryStage.setScene(scene2));

        Button button2 = new Button("Previous");
        button2.setOnAction(e -> primaryStage.setScene(scene));

        Button button3 = new Button("Next");
        button3.setOnAction(e -> primaryStage.setScene(scene3));

        Button button4 = new Button("Previous");
        button4.setOnAction(e -> primaryStage.setScene(scene2));

        Button button5 = new Button("Confirm");
        button5.setOnAction(event);

        //Creating text field
        TextField text1 = new TextField();
        text1.setMaxWidth(100);

        TextField text2 = new TextField();
        text2.setMaxWidth(100);

        TextField text3 = new TextField();
        text3.setMaxWidth(100);

        Label text1Label = new Label("Server Name");
        Label text2Label = new Label("Server Port");
        Label text3Label = new Label("Server IP Binding");



        layout.getChildren().addAll(label1, button);
        layout.setSpacing(10);

        layout2.getChildren().addAll(label2, button2, button3);
        layout2.setSpacing(10);

        layout3.getChildren().addAll(text1Label, text1, text2Label, text2, text3Label, text3, button5, button4);
        layout3.setSpacing(10);

        primaryStage.setTitle("Stream-Pi Server");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}