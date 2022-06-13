package chapter_01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 * 20. Write statements that can be used in a JavaFX application to draw the
 * outline of a crescent moon
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_01_20 extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.strokeArc(250, 250, 100, 100, -90, 180, ArcType.OPEN);
        gc.strokeArc(240, 250, 120, 100, -90, 180, ArcType.OPEN);
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Exercise_01_20");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
