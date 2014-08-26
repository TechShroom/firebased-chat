package com.techshroom.chat;

import com.techshroom.fxml.FXMLLoader2;

import javafx.scene.Node;

public class ChatArea {
    public static Node create() {
        return FXMLLoader2.load("chat-login-screen.fxml");
    }

    private ChatArea() {
    }
}
