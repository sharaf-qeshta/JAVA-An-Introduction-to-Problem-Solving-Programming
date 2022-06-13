package chapter_01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 * 4. Write a JavaFX application similar to the one in Listing 1.2 that displays a
 * picture of a snowman. (Hint: Draw three circles, one above the other.
 * Make the circles progressively smaller from bottom to top. Make the top
 * circle a happy face.)
 *
 * @author Sharaf Qeshta
 * */
public class Project_01_04 extends Application
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

        gc.strokeOval(250, 300, 200, 200);
        gc.strokeOval(300, 200, 100, 100);
        gc.strokeOval(325, 150, 50, 50);

        // happy face
        gc.fillOval(345, 160, 5, 10);
        gc.fillOval(355, 160, 5, 10);
        gc.strokeArc(345, 180, 15, 5, 180, 180, ArcType.OPEN);


        root.getChildren().add(canvas);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Project_01_04");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
