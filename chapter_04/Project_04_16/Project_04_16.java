package chapter_04;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


/**
 * 16. Write a JavaFX application that displays a series of pictures of a person
 * with arms, legs, and of course a head. Use a happy face for the head. Use
 * ovals for the body, arms, and legs. Draw a sequence of figures that appear
 * one after the other, as in Listing 4.9. Make the figures assume a running
 * position. Change the color of the person’s face in each succeeding figure,
 * going from white to pink to red to yellow to green. Have the smiling face
 * gradually change its mouth shape from a smile on the first person to a
 * frown on the last person. Use a switch statement to choose the color.
 * Embed the switch statement in a loop.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_04_16 extends Application
{
    public static final int FACE_DIAMETER = 50;
    public static final int X_FACE0 = 10;
    public static final int Y_FACE0 = 250;
    public static final int EYE_WIDTH = 5;
    public static final int EYE_HEIGHT = 10;
    public static final int X_RIGHT_EYE0 = 20;
    public static final int Y_RIGHT_EYE0 = 260;
    public static final int X_LEFT_EYE0 = 45;
    public static final int Y_LEFT_EYE0 = Y_RIGHT_EYE0;
    public static final int NOSE_DIAMETER = 5;
    public static final int X_NOSE0 = 32;
    public static final int Y_NOSE0 = 270;
    public static final int MOUTH_WIDTH = 30;
    public static final int MOUTH_HEIGHT0 = 0;
    public static final int X_MOUTH0 = 20;
    public static final int Y_MOUTH0 = 280;
    public static final int MOUTH_START_ANGLE = 180;
    public static final int MOUTH_EXTENT_ANGLE = 180;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);

        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        int xOffset;
        for (int i = 0; i <= 4; i++)
        {
            xOffset = 100 * i;

            switch (i)
            {
                case 0 : gc.setFill(Color.GREEN); break;
                case 1 : gc.setFill(Color.YELLOW); break;
                case 2 : gc.setFill(Color.RED); break;
                case 3 : gc.setFill(Color.PINK); break;
                case 4 : gc.setFill(Color.WHITE); break;
            }

            //Draw face:
            gc.fillOval(X_FACE0 + xOffset, Y_FACE0,
                    FACE_DIAMETER, FACE_DIAMETER);

            //Draw eyes:
            gc.setFill(Color.BLACK);
            gc.fillOval(X_RIGHT_EYE0 + xOffset, Y_RIGHT_EYE0,
                    EYE_WIDTH, EYE_HEIGHT);
            gc.fillOval(X_LEFT_EYE0 + xOffset, Y_LEFT_EYE0,
                    EYE_WIDTH, EYE_HEIGHT);

            //Draw nose:
            gc.setFill(Color.BLACK);
            gc.fillOval(X_NOSE0 + xOffset, Y_NOSE0,
                    NOSE_DIAMETER, NOSE_DIAMETER);

            //Draw mouth:
            gc.setFill(Color.BLACK);
            gc.strokeArc(X_MOUTH0 + xOffset, Y_MOUTH0,
                    MOUTH_WIDTH, MOUTH_HEIGHT0 + 3 * ((i == 0)? 4 : i) + 1,
                    MOUTH_START_ANGLE * ((i == 0)? i : 1), MOUTH_EXTENT_ANGLE,
                    ArcType.OPEN);

            //Draw body:
            gc.strokeOval(X_FACE0 + xOffset, Y_FACE0 + FACE_DIAMETER,
                    FACE_DIAMETER, FACE_DIAMETER*1.5);

            //Draw arms:
            gc.strokeOval(X_FACE0 + xOffset - 15, Y_FACE0 + FACE_DIAMETER * 1.1,
                    FACE_DIAMETER * 0.5, FACE_DIAMETER * 0.1);

            gc.strokeOval(X_FACE0 + xOffset + 15, Y_FACE0 + FACE_DIAMETER * 1.1,
                    FACE_DIAMETER * 0.5, FACE_DIAMETER * 0.1);

            //Draw legs
            gc.strokeOval(X_FACE0 + xOffset + 10, Y_FACE0 + FACE_DIAMETER * 2.4,
                    FACE_DIAMETER * 0.1, FACE_DIAMETER * 0.8);
            gc.strokeOval(X_FACE0 + xOffset + 35, Y_FACE0 + FACE_DIAMETER * 2.4,
                    FACE_DIAMETER * 0.1, FACE_DIAMETER * 0.8);
        }

        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Project_04_16");
        primaryStage.show();
    }
}
