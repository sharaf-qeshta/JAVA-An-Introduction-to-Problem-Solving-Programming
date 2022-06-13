package chapter_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * 5. Write a JavaFX application for the problem described in Exercise 18.
 *
 * @author Sharaf Qeshta
 * */
public class Project_01_05 extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Pane pane = new Pane();

        // bull`s eye
        Circle bullEye = new Circle(250, 250, 5);
        bullEye.setFill(Color.BLACK);

        // 6 circles around the bull`s eye
        Circle circle1 = new Circle(250, 250, 15, Color.WHITE);
        circle1.setStroke(Color.BLACK);

        Circle circle2 = new Circle(250, 250, 25, Color.WHITE);
        circle2.setStroke(Color.BLACK);

        Circle circle3 = new Circle(250, 250, 35, Color.WHITE);
        circle3.setStroke(Color.BLACK);

        Circle circle4 = new Circle(250, 250, 45, Color.WHITE);
        circle4.setStroke(Color.BLACK);

        Circle circle5 = new Circle(250, 250, 55, Color.WHITE);
        circle5.setStroke(Color.BLACK);

        Circle circle6 = new Circle(250, 250, 65, Color.WHITE);
        circle6.setStroke(Color.BLACK);

        pane.getChildren().addAll(circle6, circle5, circle4,
                circle3, circle2, circle1, bullEye);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Exercise_01_18");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
