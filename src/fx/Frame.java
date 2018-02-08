package fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Frame extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Group group = new Group();
        primaryStage.setScene(new Scene(group, 320, 240));
        primaryStage.show();
    }
}