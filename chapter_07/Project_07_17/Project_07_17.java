package chapter_07;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 17. Create a JavaFX application to create the interface for a calculator. Use a
 * BorderPane in the stage with a TextField at the top. The text field would
 * be used to store the number being entered in the calculator as digits are
 * entered. Create buttons for digits 0–9 in a GridPane in the center of the
 * BorderPane. Create buttons for the operators *, /, +, - on the left. Create
 * a button for = on the right.
 * Your application won’t actually function as a calculator at this point. You
 * are just designing the interface.
 *
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_17 extends Application
{
    @Override
    public void start(Stage stage)
    {
        BorderPane pane = new BorderPane();

        TextField result = new TextField();
        result.setEditable(false);
        pane.setTop(result);

        GridPane numbersButtons = new GridPane();
        numbersButtons.setAlignment(Pos.CENTER);

        int buttonNumber = 1;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                numbersButtons.add(new Button(buttonNumber++ + ""), j, i);

        Button zero = new Button("0");
        numbersButtons.add(zero, 1, 3);

        pane.setCenter(numbersButtons);


        VBox operations = new VBox();
        operations.getChildren().add(new Button("*"));
        operations.getChildren().add(new Button("/"));
        operations.getChildren().add(new Button("+"));
        operations.getChildren().add(new Button("-"));

        pane.setLeft(operations);

        Button button = new Button("=");
        button.setMinSize(20, 100);
        pane.setRight(button);

        Scene scene = new Scene(pane, 120, 130);
        stage.setScene(scene);
        stage.setTitle("Project_07_17");
        stage.show();
    }
}
