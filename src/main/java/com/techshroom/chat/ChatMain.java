package com.techshroom.chat;

import com.techshroom.fxml.FXMLLoader2;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public final class ChatMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader2.setResourcePath("resources");
        BorderPane mainPane = new BorderPane();
        ChatLoginController.setSectionForChat(mainPane);

        Node chat = ChatArea.create();
        mainPane.setCenter(chat);

        Scene s = new Scene(mainPane);
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}