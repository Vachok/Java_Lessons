package fx.swingvfx;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;

public class SwingInFX {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FX on Swing");
        JFXPanel jfxPanel = new JFXPanel();
        jFrame.add(jfxPanel);
        jFrame.setSize(300, 200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Group group = new Group();
        Scene scene = new Scene(group, Color.BLUE);
        group.getChildren().add(new Button("Hello"));
        jfxPanel.setScene(scene);
    }
}
