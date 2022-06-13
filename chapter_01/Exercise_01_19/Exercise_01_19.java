package chapter_01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;


/**
 * 19. Find the documentation for the class Graphics Context in the JavaFX Class
 * Library. (See Exercise 12.) Learn how to use the method strokeRect. Then
 * write statements that can be used in a JavaFX application to draw a square
 * containing a circle. The circle’s diameter and the square’s side should be
 * equal in size.
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_01_19 extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // https://docs.oracle.com/javase/8/javafx/api/javafx/scene/canvas/GraphicsContext.html#strokeRect-double-double-double-double-
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // rectangle
        gc.strokeRect(245, 245, 100, 100);

        // circle
        gc.strokeOval(245, 245, 100, 100);
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Exercise_01_19");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
