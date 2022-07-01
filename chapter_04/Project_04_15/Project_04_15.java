package chapter_04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 15. (Challenge) Repeat the previous project, but position the centers of the
 * circles on a spiral. The center of each circle will depend on both an angle
 * and a distance from the origin. A constant change in both the angle and
 * the distance will result in a spiral pattern.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_15 extends Application
{
    public static final int NUMBER_OF_CIRCLES = 4;
    public static final double FIRST_CIRCLE_RADIUS = 25;
    public static final double CHANGE_IN_RADIUS = 25;

    @Override
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(Color.WHITE);
        double part = 360.0/(NUMBER_OF_CIRCLES*2);
        double angle = part;
        for (int i = 0; i < NUMBER_OF_CIRCLES; i++)
        {
            gc.setFill(new Color(Math.random(), Math.random(), Math.random(), 0.9));
            double x = Math.cos(angle) * 150 + 250;
            double y = Math.sin(angle) * 150 + 250;
            double radius = CHANGE_IN_RADIUS * i + FIRST_CIRCLE_RADIUS;
            gc.fillOval(x-radius/2, y-radius/2,  radius, radius);
            angle += part;
        }

        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Project_04_15");
        primaryStage.show();
    }
}
