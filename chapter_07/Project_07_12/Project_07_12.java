package chapter_07;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 12. Create a GUI application that draws the following picture of a magic
 * wand, using polygons and polylines:
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_12 extends Application
{
    @Override
    public void start(Stage stage)
    {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(500, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLACK);
        gc.fillRect(250, 250, 20, 300);

        gc.setFill(Color.GOLD);


        double[] xs = {260, 240, 140, 240, 260, 280, 380, 280};
        double[] ys = {350, 250, 230, 210, 110, 210, 230, 250};
        gc.fillPolygon(xs, ys, xs.length);

        gc.setFill(Color.BLACK);
        gc.strokePolyline(new double[] {160, 210}, new double[] {130, 180}, 2);
        gc.strokePolyline(new double[] {220, 230, 200}, new double[] {170, 200, 190}, 3);

        gc.strokePolyline(new double[] {160, 210}, new double[] {330, 280}, 2);
        gc.strokePolyline(new double[] {200, 230, 220}, new double[] {270, 260, 290}, 3);

        gc.strokePolyline(new double[] {360, 310}, new double[] {330, 280}, 2);
        gc.strokePolyline(new double[] {320, 290, 300}, new double[] {270, 260, 290}, 3);


        gc.strokePolyline(new double[] {360, 310}, new double[] {130, 180}, 2);
        gc.strokePolyline(new double[] {300, 290, 320}, new double[] {170, 200, 190}, 3);


        root.getChildren().add(canvas);
        stage.setTitle("Project_07_12");
        stage.setScene(scene);
        stage.show();
    }
}
