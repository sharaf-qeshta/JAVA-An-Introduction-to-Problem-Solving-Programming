package chapter_08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 8. Create a JavaFX application that uses a TextField to get a message and
 * encode or decode it using the classes described in Programming Project 5.
 * Use buttons to control the kind of cipher used and to specify whether to
 * encode or decode the message. Also use a TextField to get the number
 * used in the constructor for the ciphers.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_08_08 extends Application
{
    @Override
    public void start(Stage stage)
    {
        Label lblWord = new Label("Enter a word: ");
        TextField txtWord = new TextField();
        Label lblNumber = new Label("Enter a number: ");
        TextField txtNumber = new TextField();
        HBox inputs = new HBox(5, lblWord, txtWord, lblNumber, txtNumber);

        Button encryptSubstitution = new Button("Encrypt using Substitution");
        Button encryptShuffle = new Button("Encrypt using Shuffle");
        HBox encryption = new HBox(5, encryptSubstitution, encryptShuffle);

        Button decryptSubstitution = new Button("Decrypt using Substitution");
        Button decryptShuffle = new Button("Decrypt using Shuffle");
        HBox decryption = new HBox(5, decryptSubstitution, decryptShuffle);

        VBox pane = new VBox(5, inputs, encryption, decryption);
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Project_08_08");
        stage.show();

        encryptSubstitution.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                String word = txtWord.getText().trim();
                int number = Integer.parseInt(txtNumber.getText().trim());
                SubstitutionCipher substitutionCipher = new SubstitutionCipher(number);
                txtWord.setText(substitutionCipher.encode(word));
            }
        });

        encryptShuffle.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                String word = txtWord.getText().trim();
                int number = Integer.parseInt(txtNumber.getText().trim());
                ShuffleCipher shuffleCipher = new ShuffleCipher(number);
                txtWord.setText(shuffleCipher.encode(word));
            }
        });


        decryptSubstitution.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                String word = txtWord.getText().trim();
                int number = Integer.parseInt(txtNumber.getText().trim());
                SubstitutionCipher substitutionCipher = new SubstitutionCipher(number);
                txtWord.setText(substitutionCipher.decode(word));
            }
        });

        decryptShuffle.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                String word = txtWord.getText().trim();
                int number = Integer.parseInt(txtNumber.getText().trim());
                ShuffleCipher shuffleCipher = new ShuffleCipher(number);
                txtWord.setText(shuffleCipher.decode(word));
            }
        });
    }
}
