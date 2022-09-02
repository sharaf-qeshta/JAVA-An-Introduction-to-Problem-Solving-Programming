package chapter_06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * 12. Create a JavaFX application that displays a button with the text “Button
 * 1”. Underneath the button add a label with the text “Label 1”. Repeat with
 * and additional “Button 2” and “Label 2”. Add an image icon of your
 * choice to the first button and the first label.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_06_12 extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        VBox box = new VBox(5);
        Image image = new Image("desert.jpg");
        ImageView view1 = new ImageView(image);
        view1.setFitWidth(10);
        view1.setFitHeight(10);

        ImageView view2 = new ImageView(image);
        view2.setFitWidth(10);
        view2.setFitHeight(10);

        Button button1 = new Button("Button 1");
        button1.setGraphic(view1);

        Label label1 = new Label("Label 1");
        label1.setGraphic(view2);

        Button button2 = new Button("Button 2");
        Label label2 = new Label("Label 2");

        box.getChildren().add(button1);
        box.getChildren().add(label1);
        box.getChildren().add(button2);
        box.getChildren().add(label2);

        Scene scene = new Scene(box, 300, 100);
        primaryStage.setTitle("Project_06_12");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
