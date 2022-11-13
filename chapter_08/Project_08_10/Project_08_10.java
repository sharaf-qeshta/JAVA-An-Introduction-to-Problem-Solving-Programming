package chapter_08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * 10. Create a JavaFX application that will draw a spiral using line segments.
 * The equations for the points on a spiral are:
 *  x = 250 + kθ sin θ
 *  y = 250 + kθ sin θ
 * You should draw 150 points. Start θ at 0 and increase it by 0.1 for each
 * new point. Let k be 15. Set the size of the window to 500 by 500.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_10 extends Application
{
    @Override
    public void start(Stage stage)
    {
        Pane pane = new Pane();

        double θ = 0;
        double k = 15;
        double previousX = 250, previousY = 250;

        for (int i = 0; i < 150; i++, θ += 0.1)
        {
            double x = 250 + k * θ * Math.sin(θ);
            double y = 250 + k * θ * Math.cos(θ);
            pane.getChildren().add(new Line(x, y, previousX, previousY));
            previousX = x;
            previousY = y;
        }

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Project_08_10");
        stage.show();
    }
}
