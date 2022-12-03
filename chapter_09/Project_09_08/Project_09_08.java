package chapter_09;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * 8. Modify the Bouncing Ball example from Listing 9.18, except instead of
 * animating a red circle, animate an image of your choice.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_09_08 extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        Pane root = new Pane();
        root.setPrefSize(400,400);
        Image image = new Image("chapter_09/Ball.png");
        image.setFitHeight(50); image.setFitWidth(50);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(10),
                        new EventHandler<ActionEvent>()
                        {
                            @Override
                            public void handle(ActionEvent event)
                            {
                                image.updateLocation();
                                if ((image.getX_() < 0) ||
                                        (image.getX_() > root.getWidth()))
                                    image.reverseX();
                                if ((image.getY_() < 0) ||
                                        (image.getY_() > root.getHeight()))
                                    image.reverseY();
                            }
                        }
                )
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.play();

        root.getChildren().add(image);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Project_09_08");
        primaryStage.show();
    }
}
