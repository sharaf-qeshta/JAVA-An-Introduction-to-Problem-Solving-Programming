package chapter_03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 9. Write a JavaFX application to draw the five interlocking rings that are the
 * symbol of the Olympics. The color of the rings, from left to right, is blue,
 * yellow, black, green, and red.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_09 extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Pane pane = new Pane();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setLineWidth(10);
        gc.setStroke(Color.BLUE);
        gc.strokeOval(10, 250, 100, 100);

        gc.setStroke(Color.YELLOW);
        gc.strokeOval(90, 250, 100, 100);

        gc.setStroke(Color.BLACK);
        gc.strokeOval(170, 250, 100, 100);

        gc.setStroke(Color.GREEN);
        gc.strokeOval(60, 300, 100, 100);

        gc.setStroke(Color.RED);
        gc.strokeOval(140, 300, 100, 100);

        pane.getChildren().add(canvas);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Project_03_09");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
