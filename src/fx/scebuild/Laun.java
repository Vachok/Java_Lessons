package fx.scebuild;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Laun extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Group group = new Group();
        Scene scrne = new Scene(group, 500, 400);

        Parent content = FXMLLoader.load(getClass().getResource("../form.fxml"));
        BorderPane root = new BorderPane();
        root.setCenter(content);
        group.getChildren().add(root);

        primaryStage.setScene(scrne);
        primaryStage.show();
    }
}