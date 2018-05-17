package fx.css;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Starter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Application.setUserAgentStylesheet(getClass().getResource("css.css").toExternalForm()); - это полностью заменяет стиль
        Button button = new Button("Кнопица");
        button.setId("my-button");
        button.setStyle("");
        Group group = new Group();
        group.getChildren().add(button);

        Scene scene = new Scene(group, 300, 150);
        scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}