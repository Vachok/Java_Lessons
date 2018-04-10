package fx.concurrency;

import javafx.application.Application;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Conc extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MyService myService = new MyService();
        myService.start();
        myService.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                System.out.println("done: " + t.getSource().getValue());
            }
        });
        Group root = new Group();
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }

    // Класс для запуска сервиса в отдельном потоке.
    static class MyService extends Service<String> {
        @Override
        protected Task<String> createTask() {
            return new Task<String>() {
                @Override
                protected String call() {
                    return "hello world!";
                }
            };
        }
    }
}
