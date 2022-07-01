package chapter_04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

/**
 * 17. Create an applet that draws a pattern of circles whose centers are evenly
 * spaced along a horizontal line. Use six constants to control the pattern:
 * the number of circles to draw, the diameter of the first circle, the x- and
 * y-coordinates of the center of the first circle, the distance between adjacent
 * centers, and the change in the diameter of each subsequent circle.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_04_17 extends Application
{
    public static final int NUMBER_OF_CIRCLES = 8;
    public static final double FIRST_CIRCLE_DIAMETER = 20;
    public static final double FIRST_CIRCLE_CENTER_X = 10;
    public static final double FIRST_CIRCLE_CENTER_Y = 250;
    public static final double DISTANCE_BETWEEN_ADJACENT_CENTERS = 50;
    public static final double CHANGE_IN_DIAMETER = 5;

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

        for (int i = 0; i < NUMBER_OF_CIRCLES; i++)
        {
            double currentDiameter = FIRST_CIRCLE_DIAMETER + i * CHANGE_IN_DIAMETER;
            double x = FIRST_CIRCLE_CENTER_X + i * DISTANCE_BETWEEN_ADJACENT_CENTERS;
            double y = FIRST_CIRCLE_CENTER_Y - currentDiameter/2;

            gc.strokeOval(x, y, currentDiameter, currentDiameter);
        }


        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Exercise_04_17");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
