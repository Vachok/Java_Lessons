package fx.shapess;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Ellipse line = new Ellipse(0, 0, 100, 100);
        line.setStroke(Color.BLUE);
        line.setFill(Color.GREENYELLOW);

        Text text = new Text(50, 140, "helloWorld!");
        text.setFont(Font.font(50));

        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);
        root.getChildren().add(line);
        root.getChildren().add(text);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

