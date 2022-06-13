package chapter_01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;


/**
 * 6. Write a JavaFX application that displays the following pattern:
 *
 * @author Sharaf Qeshta
 * */
public class Project_01_06 extends Application
{

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

        gc.strokeArc(288.5, 220, 80, 80, 90, 180, ArcType.OPEN);
        gc.strokeArc(222, 158, 80, 80, 0, -180, ArcType.OPEN);
        gc.strokeArc(158, 220, 80, 80, 90, -180, ArcType.OPEN);
        gc.strokeArc(220, 288.5, 80, 80, 0, 180, ArcType.OPEN);

        gc.strokeOval(238.5, 238.5, 50, 50);
        gc.fillOval(250, 250, 25, 25);


        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Project_01_06");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
