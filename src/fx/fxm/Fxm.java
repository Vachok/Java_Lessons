package fx.fxm;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Fxm extends Application {
    @FXML
    AnchorPane group;
    @FXML
    private FXMLLoader loader = new FXMLLoader(getClass().getResource("Fxm.fxml"));

    {
        try {
            group = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        loader.getRoot();
        loader.getController();
        primaryStage.setScene(new Scene(group, 640, 480));
        primaryStage.show();
    }
}
