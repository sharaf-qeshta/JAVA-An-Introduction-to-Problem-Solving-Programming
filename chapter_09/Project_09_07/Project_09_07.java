package chapter_09;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 7. Create a JavaFX application that implements a short survey. The first
 * question should ask the user for his or her favorite color and present the
 * choices “red”, “orange”, “blue”, and “green” in radio buttons. The
 * second question should ask the user for his or her age and present the
 * choice in a spinner with the range 10–100. The third and final question
 * should ask the user to select his or her favorite programming language
 * from the choices “Java”, “C++”, “Python”, and “C#” presented in a
 * choice box. Add a button, that when clicked, summarizes the user’s
 * selections.
 *
 * @author Sharaf Qeshta
 */
public class Project_09_07 extends Application
{
    @Override
    public void start(Stage stage)
    {
        VBox root = new VBox();

        root.getChildren().add(new Label("What is your favorite color?"));
        ToggleGroup toggleColor = new ToggleGroup();
        RadioButton rbRed = new RadioButton("Red");
        rbRed.setToggleGroup(toggleColor);
        rbRed.setSelected(true);
        RadioButton rbOrange = new RadioButton("Orange");
        rbOrange.setToggleGroup(toggleColor);
        RadioButton rbBlue = new RadioButton("Blue");
        rbBlue.setToggleGroup(toggleColor);
        RadioButton rbGreen = new RadioButton("Green");
        rbGreen.setToggleGroup(toggleColor);
        root.getChildren().add(rbRed);
        root.getChildren().add(rbOrange);
        root.getChildren().add(rbBlue);
        root.getChildren().add(rbGreen);

        root.getChildren().add(new Label("Select age"));
        Spinner<Integer> spinnerAge = new Spinner<>();
        int defaultValue = 20;
        SpinnerValueFactory<Integer> ageFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(10, 100, defaultValue);
        spinnerAge.setValueFactory(ageFactory);
        root.getChildren().add(spinnerAge);

        root.getChildren().add(new Label("Select favorite programming language"));
        ChoiceBox<String> cbModes = new ChoiceBox<String>(
                FXCollections.observableArrayList("Java", "C++", "Python", "C#"));
        root.getChildren().add(cbModes);

        Button btnSubmit = new Button("Submit");
        btnSubmit.setOnAction(event ->
        {
            String favColor = "";
            if (rbRed.isSelected())
                favColor = "red";
            else if (rbGreen.isSelected())
                favColor = "green";
            else if (rbOrange.isSelected())
                favColor = "orange";
            else if (rbBlue.isSelected())
                favColor = "blue";
            System.out.println("Favorite color: " + favColor);
            System.out.println("Age: " + spinnerAge.getValue());
            System.out.println("Favorite Programming Language: " + cbModes.getValue());
        });
        root.getChildren().add(btnSubmit);

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Project_09_07");
        stage.setScene(scene);
        stage.show();
    }
}
