package fx.uictrl;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Uictrl extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setScene(new Scene(root, 850, 580));
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(15);
        flowPane.setVgap(15);
        flowPane.getChildren().add(new Label("LEIBA"));
        flowPane.getChildren().add(new Button("BUT"));
        ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton("RB 1");
        RadioButton rb2 = new RadioButton("RB 2");
        RadioButton rb3 = new RadioButton("RB 3");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);
        root.getChildren().addAll();


        flowPane.getChildren().addAll(rb1, rb2, rb3);
        flowPane.getChildren().add(new ToggleButton("TOOGLE"));
        flowPane.getChildren().add(new CheckBox("CBox"));
        flowPane.getChildren().add(new ChoiceBox<String>(FXCollections.observableArrayList("First", "Second", "Third")));
        flowPane.getChildren().add(new TextField("TEXT FIELD"));
        flowPane.getChildren().add(new PasswordField());

        ScrollBar sc = new ScrollBar();
        sc.setMin(0);
        sc.setMax(100);
        sc.setValue(50);
        flowPane.getChildren().add(sc);
        TreeItem<String> rootItem = new TreeItem<String>("Inbox");
        rootItem.setExpanded(true);
        for (int i = 0; i < 6; i++) {
            TreeItem<String> item = new TreeItem<String>("Message " + i);
            rootItem.getChildren().add(item);
        }
        TreeView<String> tree = new TreeView<String>(rootItem);
        tree.setMaxHeight(100);
        flowPane.getChildren().add(tree);

        ObservableList<String> options = FXCollections.observableArrayList(
                "OPT1",
                "OPT2",
                "OPT3"
        );
        ComboBox comboBox = new ComboBox(options);
        flowPane.getChildren().add(comboBox);

        Separator separator = new Separator();
        separator.setOrientation(Orientation.VERTICAL);
        flowPane.getChildren().add(separator);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(40);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);
        flowPane.getChildren().add(slider);

        ProgressBar pb = new ProgressBar(0.6);
        ProgressIndicator pi = new ProgressIndicator(0.3);
        flowPane.getChildren().add(pb);
        flowPane.getChildren().add(pi);

        Hyperlink link = new Hyperlink();
        link.setText("https://srv-mail3.eatmeat.ru/owa");
        link.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Link Click!");
            }
        });
        flowPane.getChildren().add(link);

        Tooltip tooltip = new Tooltip();
        tooltip.setText("HAHA");
        link.setTooltip(tooltip);

        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setPrefHeight(200);
        htmlEditor.getHtmlText();
        flowPane.getChildren().add(htmlEditor);

        TitledPane tp = new TitledPane("My TP", new Button("TP"));
        flowPane.getChildren().add(tp);

        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(tp, new TitledPane("TP2", new TextField("FIELD")));
        accordion.setExpandedPane(tp);
        flowPane.getChildren().add(accordion);

        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        MenuItem menuItem = new MenuItem("open");
        MenuItem menuItem2 = new MenuItem("save");
        MenuItem menuItem3 = new MenuItem("HUI");
        MenuItem menuItem4 = new MenuItem("PIZDA");
        menuFile.getItems().addAll(menuItem, menuItem2);
        menuEdit.getItems().addAll(menuItem3, menuItem4);
        menuBar.getMenus().addAll(menuFile, menuEdit);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(menuBar, flowPane);

        ColorPicker colorPicker = new ColorPicker();
        flowPane.getChildren().add(colorPicker);

        Pagination pagination = new Pagination();
        flowPane.getChildren().add(pagination);

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("RED or BLUE");
        Button button = new Button("Open");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fileChooser.showOpenDialog(primaryStage);
            }
        });
        flowPane.getChildren().add(button);

        root.getChildren().addAll(flowPane);
        root.getChildren().addAll(vBox);
        primaryStage.show();
    }
}