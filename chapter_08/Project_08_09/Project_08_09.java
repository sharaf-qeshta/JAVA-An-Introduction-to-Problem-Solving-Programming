package chapter_08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * 9. Create a JavaFX application that acts as a simple calculator. Create buttons
 * for digits 0-9 and a text field that concatenates digits for the current
 * number as the buttons are clicked. Add additional buttons for operators +,
 * −, *, and /. Add a final button for = that calculates the previously computed
 * value with the value entered in the text field. Consider using the layout
 * described in Programming Project 17 from Chapter 7.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_09 extends Application
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
        {
            for (int j = 0; j < 3; j++)
            {
                Button button = new Button(buttonNumber++ + "");
                numbersButtons.add(button, j, i);
                button.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        if (result.getText().equals("Invalid Pattern"))
                            result.setText("");
                        result.setText(result.getText() + button.getText());
                    }
                });
            }
        }


        Button zero = new Button("0");
        zero.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                if (result.getText().equals("Invalid Pattern"))
                    result.setText("");
                result.setText(result.getText() + "0");
            }
        });
        numbersButtons.add(zero, 1, 3);

        pane.setCenter(numbersButtons);


        VBox operations = new VBox();
        Button multiply = new Button("*");
        Button divide = new Button("/");
        Button add = new Button("+");
        Button subtract = new Button("-");
        operations.getChildren().add(multiply);
        operations.getChildren().add(divide);
        operations.getChildren().add(add);
        operations.getChildren().add(subtract);

        multiply.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                result.setText(result.getText() + " * ");
            }
        });

        divide.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                result.setText(result.getText() + " / ");
            }
        });

        add.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                result.setText(result.getText() + " + ");
            }
        });

        subtract.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                result.setText(result.getText() + " - ");
            }
        });

        pane.setLeft(operations);

        Button equal = new Button("=");
        equal.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                String[] operationElements = result.getText().trim().split(" ");
                if (operationElements.length == 3)
                {
                    int x = Integer.parseInt(operationElements[0]);
                    String op = operationElements[1];
                    int y = Integer.parseInt(operationElements[2]);

                    switch (op)
                    {
                        case "*": result.setText(x * y + ""); break;
                        case "/": result.setText(x / y + ""); break;
                        case "+": result.setText((x + y) + ""); break;
                        case "-": result.setText((x - y) + "");break;
                    }
                }
                else
                {
                    result.setText("Invalid Pattern");
                }
            }
        });


        equal.setMinSize(20, 100);
        pane.setRight(equal);

        Scene scene = new Scene(pane, 120, 130);
        stage.setScene(scene);
        stage.setTitle("Project_08_09");
        stage.show();
    }
}
