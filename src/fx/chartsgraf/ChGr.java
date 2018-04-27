package fx.chartsgraf;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class ChGr extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        primaryStage.setScene(new Scene(group, 640, 480));

        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
                new PieChart.Data("muscule", 13),
                new PieChart.Data("genitals", 1),
                new PieChart.Data("head", 53),
                new PieChart.Data("vacular sys", 3),
                new PieChart.Data("digestive system", 30));
        final PieChart chart = new PieChart(data);
        chart.setTitle("Ivan was just wear and tear...");
        group.getChildren().addAll(chart);
        primaryStage.setTitle("Моё здоровье");
        primaryStage.show();
    }
}
