package com.example.buttonjavafx;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class ButtonJavaFX extends Application {

    Label response;

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage myStage) {

        myStage.setTitle("Doge-dice");

        FlowPane rootNode = new FlowPane(20,20);

        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 400, 100);

        myStage.setScene(myScene);

        response = new Label("Push a Button");

        Button buttonPlay = new Button("Play");
        Button buttonHighScore = new Button("HighScore");

        buttonPlay.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("You pressed play");
            }
        });

        buttonHighScore.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("You pressed highscore");
            }
        });

        rootNode.getChildren().addAll(buttonPlay, buttonHighScore, response);

        myStage.show();
    }
}
