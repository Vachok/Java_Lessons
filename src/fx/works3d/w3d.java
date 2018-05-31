package fx.works3d;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class w3d extends Application {
    private final double cameraModifier = 50.0;
    private final double cameraQuantity = 10.0;
    private final double cameraYlimit = 15;
    private final double rotateModifier = 25;
    private double mouseXold = 0;
    private double mouseYold = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        /* Создаётся объект цилиндр*/

        Cylinder cylinder = new Cylinder(100, 300);
        PhongMaterial blueMaterial = new PhongMaterial();

/*
делаем его синим, переходящим от тёмно-синего
ставим по углом 45
*/
        blueMaterial.setDiffuseColor(Color.DARKBLUE);
        blueMaterial.setSpecularColor(Color.LIGHTBLUE);
        cylinder.setMaterial(blueMaterial);
        cylinder.setRotationAxis(Rotate.X_AXIS);
        cylinder.setRotate(45);
        cylinder.setCacheHint(CacheHint.SPEED);

/*
Камера, для осмотра
 */
        Camera camera = new PerspectiveCamera(true);
        camera.setFarClip(50000.0);
        camera.setTranslateZ(-1000);

        Group group = new Group();
        Scene scene = new Scene(group, 800, 600);

/*
Присваиваем кнопкам и мышке действия.
W,S,A,D = масштаб и право-лево
Мышь - для перетаскивания
*/
        Rotate xRotate = new Rotate(0, 0, 0, 0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);
        camera.getTransforms().addAll(xRotate, yRotate);
        scene.setOnMouseClicked(event -> {
            Node picked = event.getPickResult().getIntersectedNode();
            if (null != picked) {
                double scalar = 2;
                if (picked.getScaleX() > 1)
                    scalar = 1;
                picked.setScaleX(scalar);
                picked.setScaleY(scalar);
                picked.setScaleZ(scalar);
            }
        }); //  fx/works3d/2018-02-22_09-30-54.gif
        scene.setOnKeyPressed(event -> {
            double change = cameraQuantity;
            if (event.isShiftDown()) change = cameraModifier;

            KeyCode keyCode = event.getCode();

            if (keyCode == KeyCode.W) {
                camera.setTranslateZ(camera.getTranslateZ() - change);
            }
            if (keyCode == KeyCode.S) {
                camera.setTranslateZ(camera.getTranslateZ() + change);
            }
            if (keyCode == KeyCode.A) {
                camera.setTranslateX(camera.getTranslateX() - change);
            }
            if (keyCode == KeyCode.D) {
                camera.setTranslateX(camera.getTranslateX() + change);
            }
        }); // fx/works3d/2018-02-22_09-44-13.gif
        scene.addEventHandler(MouseEvent.ANY, event -> {
            if (event.getEventType() == MouseEvent.MOUSE_PRESSED ||
                    event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
                double mouseXnew = event.getSceneX();
                double mouseYnew = event.getSceneY();
                if (event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
                    double pitchRotate = xRotate.getAngle() + (mouseYnew - mouseYold) / rotateModifier;
                    pitchRotate = pitchRotate > cameraYlimit ? cameraYlimit : pitchRotate;
                    pitchRotate = pitchRotate < -cameraYlimit ? cameraYlimit : pitchRotate;
                    xRotate.setAngle(pitchRotate);
                    double yawRotate = yRotate.getAngle() - (mouseXnew - mouseXold) / rotateModifier;
                    yRotate.setAngle(yawRotate);
                }
                mouseXold = mouseXnew;
                mouseYold = mouseYnew;
            }
        });

// Вывод на экран
        KeyCodeCombination exit = new KeyCodeCombination(KeyCode.SCROLL_LOCK);
        scene.setFill(Color.BLACK);
        scene.setCamera(camera);
        group.getChildren().addAll(cylinder);
        primaryStage.setScene(scene);
        primaryStage.setFullScreenExitKeyCombination(exit);
        primaryStage.setFullScreenExitHint("Scroll Lock to Exit");
        primaryStage.setFullScreen(true);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }
}
