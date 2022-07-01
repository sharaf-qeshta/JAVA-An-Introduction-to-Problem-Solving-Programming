package chapter_04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * 13. Write a JavaFX application that draws a bull’s-eye pattern. The center
 * should be a filled-in blue circle with a diameter of 100 pixels. The center
 * circle should be surrounded by five rings that alternate in color from green
 * to blue. Each ring should have a width of 30 pixels.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_13 extends Application
{
    public static final double BULLS_EYE_DIAMETER = 100;
    public static final double RING_WIDTH = 30;

    @Override
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 800);

        Canvas canvas = new Canvas(800, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLUE);
        gc.setStroke(Color.WHITE);
        gc.fillOval(350, 350, BULLS_EYE_DIAMETER , BULLS_EYE_DIAMETER);

        gc.setLineWidth(RING_WIDTH);
        gc.setStroke(Color.GREEN);
        gc.strokeOval(325, 325, BULLS_EYE_DIAMETER*1.5, BULLS_EYE_DIAMETER*1.5);

        gc.setStroke(Color.CYAN);
        gc.strokeOval(275, 275, BULLS_EYE_DIAMETER*2.5, BULLS_EYE_DIAMETER*2.5);

        gc.setStroke(Color.TURQUOISE);
        gc.strokeOval(225, 225, BULLS_EYE_DIAMETER*3.5, BULLS_EYE_DIAMETER*3.5);

        gc.setStroke(Color.TEAL);
        gc.strokeOval(175, 175, BULLS_EYE_DIAMETER*4.5, BULLS_EYE_DIAMETER*4.5);

        gc.setStroke(Color.BLUE);
        gc.strokeOval(125, 125, BULLS_EYE_DIAMETER*5.5, BULLS_EYE_DIAMETER*5.5);


        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Project_04_13");
        primaryStage.show();
    }
}
