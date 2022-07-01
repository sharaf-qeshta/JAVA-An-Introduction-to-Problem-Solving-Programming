package chapter_04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 14. Create a JavaFX application that draws a pattern of evenly spaced circles.
 * Use four constants to control the pattern: the number of circles to draw,
 * the radius of the first circle, the change in the radius of each subsequent
 * circle, and the change in the x-coordinate of the circle. Cycle the colors of
 * the circles through red, green, and blue.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_14 extends Application
{
    public static final int NUMBER_OF_CIRCLES = 4;
    public static final double FIRST_CIRCLE_RADIUS = 25;
    public static final double CHANGE_IN_RADIUS = 25;
    public static final double CHANGE_IN_X = 100;

    @Override
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(Color.WHITE);
        for (int i = 0; i < NUMBER_OF_CIRCLES; i++)
        {
            gc.setFill(new Color(Math.random(), Math.random(), Math.random(), 0.9));
            gc.fillOval(CHANGE_IN_X*i, 250,
                    CHANGE_IN_RADIUS*i + FIRST_CIRCLE_RADIUS,
                    CHANGE_IN_RADIUS*i + FIRST_CIRCLE_RADIUS );
        }

        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Project_04_14");
        primaryStage.show();
    }
}
