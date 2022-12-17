package chapter_09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * 11. Write an application that implements a trip-time calculator. Define and
 * use a class TripComputer to compute the time of a trip. TripComputer
 * should have the private attributes
 * • totalTime—the total time for the trip
 * • restStopTaken—a boolean flag that indicates whether a rest stop has
 * been taken at the end of the current leg
 * and the following methods:
 * • computeLegTime(distance, speed)—computes the time for a leg of the trip
 * having a given distance in miles and speed in miles per hour. If either
 * the distance or the speed is negative, throws an exception.
 * • takeRestStop(time)—takes a rest stop for the given amount of time. If
 * the time is negative, throws an exception. Also throws an exception if
 * the client code attempts to take two rest stops in a row.
 * • getTripTime—returns the current total time for the trip.
 * • Here is one possible configuration of the labels, buttons, and text fields
 * required by the trip-time calculator:
 *
 * @author Sharaf Qeshta
 */
public class Project_09_11 extends Application
{
    @Override
    public void start(Stage stage)
    {
        BorderPane root = new BorderPane();

        TripComputer tripComputer;

        TextField timeTextField = new TextField();
        Label timeLabel = new Label("Stop Time (hours)");
        Button stopButton = new Button("Add Stop");

        VBox stopPanel = new VBox();
        stopPanel.getChildren().add(timeTextField);
        stopPanel.getChildren().add(timeLabel);
        stopPanel.getChildren().add(stopButton);

        root.setLeft(stopPanel);

        TextField distanceTextField = new TextField();
        Label distanceLabel = new Label("Distance (miles)");
        TextField speedTextField = new TextField();
        Label speedLabel = new Label("Speed (mph)");

        Button legButton = new Button("Add Leg");

        VBox legPanel = new VBox();
        legPanel.getChildren().add(distanceTextField);
        legPanel.getChildren().add(distanceLabel);
        legPanel.getChildren().add(speedTextField);
        legPanel.getChildren().add(speedLabel);
        legPanel.getChildren().add(legButton);

        root.setRight(legPanel);


        Label totalTimeLabel = new Label("Your trip time so far (hours): ");
        root.setCenter(totalTimeLabel);

        tripComputer = new TripComputer();

        stopButton.setOnAction(event ->
        {
            try
            {
                double time = Double.parseDouble(timeTextField.getText().trim());
                tripComputer.takeRestStop(time);
                totalTimeLabel.setText("Your trip time so far (hours): " + tripComputer.getTripTime());
            }
            catch (TripComputerException ex)
            {
                totalTimeLabel.setText("Error: " + ex.getMessage());
            }
            catch (Exception ex)
            {
                totalTimeLabel.setText("Error in time: " + ex.getMessage());
            }
        });

        legButton.setOnAction(event ->
        {
            try
            {
                double speed = Double.parseDouble(speedTextField.getText().trim());
                double distance = Double.parseDouble(distanceTextField.getText().trim());
                tripComputer.computeLegTime(distance, speed);
                totalTimeLabel.setText("Your trip time so far (hours): " + tripComputer.getTripTime());
            }
            catch (TripComputerException ex)
            {
                totalTimeLabel.setText("Error: " + ex.getMessage());
            }
            catch (Exception ex)
            {
                totalTimeLabel.setText("Error in speed or distance: " + ex.getMessage());
            }
        });

        Scene scene = new Scene(root, 500, 200);
        stage.setTitle("Project_09_11");
        stage.setScene(scene);
        stage.show();
    }
}
