package fx.lout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Lout extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane anchorPane = new AnchorPane();
        Button one = new Button("one");
        Button two = new Button("two");
        anchorPane.getChildren().addAll(one, two);
        anchorPane.setPadding(new Insets(100, 200, 100, 200));
        Group root = new Group();
        root.getChildren().addAll(anchorPane);
        primaryStage.setScene(new Scene(root, 300, 270));
        primaryStage.show();
    }
}

/*
Layout - принцип размещения элементов на фрейме
Layout - универсальное средсво, для работы с графикой. Масштабируемо.
Resize, с сохранением элементов в масштабе.
*/
/*

BorderPane borderPane = new BorderPane();
borderPane.setCenter(new Button("push"));
borderPane.setMinWidth(320);
borderPane.setMinHeight(240);
borderPane.getChildren().addAll(new TextField());
root.getChildren().addAll(borderPane);
*/

// https://goo.gl/YFWhrQ hbox
// https://goo.gl/1whTBe vbox

// StackPane - когда элементы умышленно нужно слепить
// GridPane - ячейки. Типа Excel
// FLowPane - BorderPane с переносом строк
// TilePane - FlowPane, где элементы в одинаковых квадратах
// AncorPane - "приклеивает" элементы к своим местам, и они ресайзятся с окном
// Так же можно создать свой layout


// at 08.02.2018 (12:16)