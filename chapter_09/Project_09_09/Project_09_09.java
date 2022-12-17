package chapter_09;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * 9. Write a JavaFX program that moves an image toward the location of the
 * mouse. The image shouldn’t jump directly to the mouse coordinates
 * (which is what happens in Listing 9.16) but should move a few pixels
 * toward the mouse location every time cycle. You can choose the time cycle
 * to control the speed of the animation.
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_09 extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        root.setPrefSize(400,400);
        Circle circle = new Circle();
        circle.setRadius(30);
        circle.setFill(Color.RED);

        root.setOnMouseMoved(new EventHandler<>()
        {
            Timeline previousTimeline;

            @Override
            public void handle(MouseEvent event)
            {
                if (previousTimeline != null)
                    previousTimeline.stop();

                int dx = (circle.getCenterX() > event.getX()) ? -1 : 1;
                int dy = (circle.getCenterY() > event.getY()) ? -1 : 1;

                Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event_)
                            {
                                if (dx == -1)
                                {
                                    if (circle.getCenterX() > event.getX())
                                        circle.setCenterX(circle.getCenterX() - 1);
                                }
                                else
                                {
                                    if (circle.getCenterX() < event.getX())
                                        circle.setCenterX(circle.getCenterX() + 1);
                                }

                                if (dy == -1)
                                {
                                    if (circle.getCenterY() > event.getY())
                                        circle.setCenterY(circle.getCenterY() - 1);
                                }
                                else
                                {
                                    if (circle.getCenterY() < event.getY())
                                        circle.setCenterY(circle.getCenterY() + 1);
                                }
                            }
                        }));
                timeline.setCycleCount(Timeline.INDEFINITE);
                timeline.play();
                previousTimeline = timeline;
            }
        });

        root.getChildren().add(circle);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Project_09_09");
        primaryStage.show();
    }
}
