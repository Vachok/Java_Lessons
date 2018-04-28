package fx.hello;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Hello extends Application {
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
JavaFX - UI-приложения, кроссплатформа
JFX более универсален, чем Свинг.
Более ВЕБ-ориентирован. Так же FX в теории можно запустить на моб.девайсах
* */