package chapter_05;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 11. Repeat Programming Project 18 from Chapter 4, but use a method that
 * displays a circular disk as a subtask.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_05_11 extends Application
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
            createDisk(i, 250, gc);
        }

        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Project_05_11");
        primaryStage.show();
    }


    public static void createDisk(int order, int y, GraphicsContext gc)
    {
        gc.fillOval(CHANGE_IN_X*order, y,
                CHANGE_IN_RADIUS*order + FIRST_CIRCLE_RADIUS,
                CHANGE_IN_RADIUS*order + FIRST_CIRCLE_RADIUS );
    }
}
