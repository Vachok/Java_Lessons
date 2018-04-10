package fx.media;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.*;
import javafx.stage.Stage;

import java.io.File;


public class Medi extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        File file = new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\src\\fx\\media\\Kladbizhe_domashnih_zhivotnyh_1989_HDRip_by_Dalemake.avi");
        System.out.println(file.getTotalSpace());
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        MediaView mediaView = new MediaView(mediaPlayer);
        Group group = new Group();
        group.getChildren().add(mediaView);
        primaryStage.setScene(new Scene(group, 320, 240));
    }
}

//todo Играем музыку
//        File file = new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\src\\fx\\media\\Armin van Buuren - Another You feat Mr. Probz Headhunterz Radio Edit.mp3");
//        URI uriArmin = file.toURI();
//        Media media = new Media(uriArmin.toString());
//        MediaPlayer mediaPlayer = new MediaPlayer(media);
