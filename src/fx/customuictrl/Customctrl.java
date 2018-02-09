package fx.customuictrl;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Customctrl extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        CustomControl numberTextField = new CustomControl();
        Group group = new Group();
        group.getChildren().addAll(numberTextField);
        primaryStage.setScene(new Scene(group, 320, 240));
        primaryStage.show();
    }
}
