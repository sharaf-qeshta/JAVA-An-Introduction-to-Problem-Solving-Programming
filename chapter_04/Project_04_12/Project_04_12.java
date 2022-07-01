package chapter_04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 12. Repeat Programming Project 7, but write the program as JavaFX
 * application. Use a constant for the initial velocity of the ball. Draw a circle
 * for the position of the ball at each second. The y-coordinate should be
 * proportional to the height of the ball, and the x-coordinate should change
 * by a small constant amount
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_12 extends Application
{
    public static final double INITIAL_VELOCITY = 100;
    public static final double WIDTH = 20;
    public static final double HEIGHT = 20;
    public static final double WINDOW_WIDTH = 500;
    public static final double WINDOW_HEIGHT = 500;
    public static final double CHANGE_IN_X = 20;

    @Override
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

        Canvas canvas = new Canvas(WINDOW_WIDTH, WINDOW_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        double velocity = INITIAL_VELOCITY;
        int bounces = 0;
        double height = 0, x = CHANGE_IN_X;

        gc.setFill(Color.BLACK);
        gc.setStroke(Color.WHITE);
        while (bounces < 5)
        {
            if (x < 500 || x >= 0)
                x += CHANGE_IN_X;
            if (x > 500)
                x = 0;
            if (x < 0)
                x *= -1;

            height += velocity;
            velocity -= 32;

            if (height < 0)
            {
                gc.fillOval(x, 0, WIDTH, HEIGHT);
                height *= -0.5;
                velocity *= -0.5;
                bounces++;
            }
            else
                gc.fillOval(x, height, WIDTH, HEIGHT);
        }

        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Project_04_12");
        primaryStage.show();
    }
}
