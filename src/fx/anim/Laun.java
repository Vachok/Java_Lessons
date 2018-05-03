package fx.anim;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;


public class Laun extends Application {
    Image image;

    public static void main(String[] args) {
        launch(args);
    }

    //todo https://youtu.be/3uILUbkR1Ls?t=28s

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Rectangle rectangle = new Rectangle(0, 0, 50, 50);
        KeyValue xValue = new KeyValue(rectangle.xProperty(), 100);
        KeyValue yValue = new KeyValue(rectangle.yProperty(), 100);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), xValue, yValue);

        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.getKeyFrames().addAll(keyFrame);
        timeline.play();

        Image sunImage = new Image(new FileInputStream("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\src\\fx\\images\\20180212_081924.jpg"));
        Image redImage = new Image(new FileInputStream("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\src\\fx\\images\\20180212_083523.jpg"));


        if (Calendar.getInstance().get(Calendar.AM_PM) == 0) {
            image = redImage;
            primaryStage.sizeToScene();
            primaryStage.setAlwaysOnTop(true);
        }
        if (Calendar.getInstance().get(Calendar.AM_PM) == 1) {
            image = sunImage;
            primaryStage.sizeToScene();
            primaryStage.setAlwaysOnTop(true);
        }

        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(330);
        imageView.setFitWidth(365);

        FadeTransition fadeOut = new FadeTransition(Duration.millis(1000), imageView);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setCycleCount(Timeline.INDEFINITE);
        fadeOut.setAutoReverse(true);
        fadeOut.play();

        Rectangle rectPath = new Rectangle(0, 0, 40, 40);
        rectPath.setFill(Color.BLUE);

        Path path = new Path();
        path.getElements().add(new MoveTo(20, 20));
        path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
        path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));
/*
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4500));
        pathTransition.setPath(path);
        pathTransition.setNode(rectPath);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();*/

        FadeTransition fadeTransition = new FadeTransition(Duration.millis(2500), rectPath);
        fadeTransition.setFromValue(1.0f);
        fadeTransition.setToValue(0.3f);
        fadeTransition.setCycleCount(2);
        fadeTransition.setAutoReverse(true);
        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(2000), rectPath);
        translateTransition.setFromX(50);
        translateTransition.setToX(250);
        translateTransition.setCycleCount(2);
        translateTransition.setAutoReverse(true);

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(4000), rectPath);
        rotateTransition.setByAngle(180f);
        rotateTransition.setCycleCount(4);
        rotateTransition.setAutoReverse(true);

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(1700), rectPath);
        scaleTransition.setToX(2f);
        scaleTransition.setToY(2f);
        scaleTransition.setCycleCount(2);
        scaleTransition.setAutoReverse(true);
/*
        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.setAutoReverse(true);
        parallelTransition.getChildren().addAll(
                fadeTransition,
                translateTransition,
                rotateTransition,
                scaleTransition
        );
        parallelTransition.setCycleCount(Timeline.INDEFINITE);
        parallelTransition.play();*/

        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.setAutoReverse(true);
        sequentialTransition.getChildren().addAll(
                fadeTransition,
                translateTransition,
                rotateTransition,
                scaleTransition
        );
        sequentialTransition.setCycleCount(Timeline.INDEFINITE);
        sequentialTransition.play();

        Group group = new Group();

        group.getChildren().addAll(imageView, rectangle, rectPath);

        primaryStage.setScene(new Scene(group, 365, 330));
        primaryStage.setTitle("Йа фрейм");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
