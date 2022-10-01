package chapter_07;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 9. Write a GUI application that displays a picture of a pine tree formed by
 * drawing a triangle on top of a small rectangle that makes up the visible
 * trunk. The tree should be green and have a gray trunk.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_09 extends Application
{
    public static final double[] rectangle1X = {125, 250, 375};
    public static final double[] rectangle1Y = {300, 200, 300};

    public static final double[] rectangle2X = {150, 250, 350};
    public static final double[] rectangle2Y = {225, 150, 225};

    public static final double[] rectangle3X = {175, 250, 325};
    public static final double[] rectangle3Y = {170, 100, 170};
    @Override
    public void start(Stage stage)
    {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(500, 500);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Draw Trunk
        gc.setFill(Color.BROWN); // brown will be better
        gc.fillRect(225, 300, 50, 100);

        // Draw the upper part
        gc.setFill(Color.GREEN);
        gc.fillPolygon(rectangle1X, rectangle1Y, 3 );
        gc.fillPolygon(rectangle2X, rectangle2Y, 3 );
        gc.fillPolygon(rectangle3X, rectangle3Y, 3 );

        root.getChildren().add(canvas);

        stage.setTitle("Project_07_09");
        stage.setScene(scene);
        stage.show();
    }
}
