package fx.images;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

public class Images extends Application {
    private Image image;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image sunImage = new Image(new FileInputStream("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\src\\fx\\images\\20180212_081924.jpg"));
        Image redImage = new Image(new FileInputStream("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\src\\fx\\images\\20180212_083523.jpg"));
        WritableImage writableImage;
        if (Calendar.getInstance().get(Calendar.AM_PM) == 0) image = sunImage;
        if (Calendar.getInstance().get(Calendar.AM_PM) == 1) image = redImage;

        Collection<Integer> argb = new ArrayList<>();
        PixelReader pixelReader = image.getPixelReader();
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Integer a = pixelReader.getArgb(i, j);
                argb.add(a);
            }
        }

        writableImage = new WritableImage((int) image.getWidth(), (int) image.getHeight());
        PixelWriter pixelWriter = writableImage.getPixelWriter();
        for (int readY = 0; readY < image.getHeight(); readY++) {
            for (int readX = 0; readX < image.getWidth(); readX++) {
                for (int i = 0; i < argb.size(); i++) {
                    pixelWriter.setArgb(readX, readY, i - 7);
                }
            }
        }
        if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 7) image = writableImage;
        ImageIO.write(SwingFXUtils.fromFXImage(writableImage, null), "png", new FileOutputStream("fx.images.Images.png"));
        Group group = new Group();
        primaryStage.setScene(new Scene(group, 600, 600));
        primaryStage.setTitle("Йа фрейм");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(599);
        imageView.setFitWidth(599);
        group.getChildren().add(imageView);
        primaryStage.show();
    }
}
