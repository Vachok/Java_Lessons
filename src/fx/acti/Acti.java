package fx.acti;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Acti extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Йа кнопко");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("ACTION");
            }
        });
        button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("EVENT!");
            }
        });
        Group group = new Group();
        primaryStage.setScene(new Scene(group, 320, 240));
        primaryStage.setTitle("Йа фрейм");
        group.getChildren().addAll(button);
        primaryStage.show();
    }
}

// at 09.02.2018 (16:44)