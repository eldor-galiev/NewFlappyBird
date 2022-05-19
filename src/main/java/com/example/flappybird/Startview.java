package com.example.flappybird;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Startview {
    public void restart(MouseEvent mouseEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(startview_Controller.class.getResource("view.fxml"));
        Parent PvsP_parent = fxmlLoader.load();
        Scene PvsP_scene = new Scene(PvsP_parent);
        Stage app_stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        app_stage.setScene(PvsP_scene);
        app_stage.show();
    }
}
