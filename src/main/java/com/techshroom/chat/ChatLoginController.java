package com.techshroom.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public final class ChatLoginController {
    private static BorderPane sectionForChat;

    public static void setSectionForChat(BorderPane sectionForChat) {
        ChatLoginController.sectionForChat = sectionForChat;
    }

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button login, signup;

    @FXML
    private void onClickLogin(ActionEvent event) {

    }

    @FXML
    private void onClickSignUp(ActionEvent event) {

    }
}
