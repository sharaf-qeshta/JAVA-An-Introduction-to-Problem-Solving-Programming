package chapter_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * 15. Repeat Exercise 18 in Chapter 1, but define and use named constants
 *
 * @author Sharaf Qeshta
 * */
public class Exercise_02_15 extends Application
{
    public static final double CENTER_X = 250;
    public static final double CENTER_Y = 250;
    public static final double RADIUS = 5;
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        Pane pane = new Pane();

        // bull`s eye
        Circle bullEye = new Circle(CENTER_X, CENTER_Y, RADIUS);
        bullEye.setFill(Color.BLACK);

        // 6 circles around the bull`s eye
        Circle circle1 = new Circle(CENTER_X, CENTER_Y, RADIUS+10, Color.WHITE);
        circle1.setStroke(Color.BLACK);

        Circle circle2 = new Circle(CENTER_X, CENTER_Y, RADIUS+20, Color.WHITE);
        circle2.setStroke(Color.BLACK);

        Circle circle3 = new Circle(CENTER_X, CENTER_Y, RADIUS+30, Color.WHITE);
        circle3.setStroke(Color.BLACK);

        Circle circle4 = new Circle(CENTER_X, CENTER_Y, RADIUS+40, Color.WHITE);
        circle4.setStroke(Color.BLACK);

        Circle circle5 = new Circle(CENTER_X, CENTER_Y, RADIUS+50, Color.WHITE);
        circle5.setStroke(Color.BLACK);

        Circle circle6 = new Circle(CENTER_X, CENTER_Y, RADIUS+60, Color.WHITE);
        circle6.setStroke(Color.BLACK);

        pane.getChildren().addAll(circle6, circle5, circle4,
                circle3, circle2, circle1, bullEye);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Exercise_02_15");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
