package chapter_03;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * 10. Repeat Programming Project 8 in Chapter 1, but add yes-or-no dialogs to
 * allow the user to make the following color changes:
 * • Change the color of the solid center circle from black to red.
 * • Change the color of the outer circle from black to blue.
 * • Change the color of the spines from black to green.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_03_10 extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Color solidCircle= Color.BLACK, outerCircle = Color.BLACK,
                spines = Color.BLACK;
        int answer =
                JOptionPane.showConfirmDialog(null,
                        "Change the color of the solid center circle from black to red?",
                        "Change Colors", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION)
            solidCircle = Color.RED;

        answer = JOptionPane.showConfirmDialog(null,
                "Change the color of the outer circle from black to blue?",
                "Change Colors", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION)
            outerCircle = Color.BLUE;

        answer = JOptionPane.showConfirmDialog(null,
                "Change the color of the spines from black to green?",
                "Change Colors", JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION)
            spines = Color.GREEN;


        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setStroke(spines);
        gc.strokeArc(288.5, 220, 80, 80, 90, 180, ArcType.OPEN);
        gc.strokeArc(222, 158, 80, 80, 0, -180, ArcType.OPEN);
        gc.strokeArc(158, 220, 80, 80, 90, -180, ArcType.OPEN);
        gc.strokeArc(220, 288.5, 80, 80, 0, 180, ArcType.OPEN);

        gc.setStroke(outerCircle);
        gc.strokeOval(238.5, 238.5, 50, 50);

        gc.setFill(solidCircle);
        gc.setStroke(solidCircle);
        gc.fillOval(250, 250, 25, 25);

        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Project_03_10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
