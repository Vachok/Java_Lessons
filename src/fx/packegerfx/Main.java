package fx.packegerfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Scene scene = new Scene(group, 640, 480);

        primaryStage.setTitle("HelloWorld!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

/*
javapackager -createjar -appclass Main -srcdir . -srcfiles Main.class -outfile packa.jar -V
*/