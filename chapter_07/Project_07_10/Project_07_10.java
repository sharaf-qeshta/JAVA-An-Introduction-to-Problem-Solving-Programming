package chapter_07;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * 10. ELIZA was a program written in 1966 that parodied a psychotherapist
 * session. The user typed sentences and the program used those words to
 * compose a question.
 * Create a simple GUI application based on this idea. The program will
 * use a label to hold the program’s question, a text field into which the user
 * can type an answer, a button for the user to signal that the answer is
 * complete, and a quit button.
 * The initial text for the question label should read: “What would you
 * like to talk about?” When the user presses a button, get the text from the
 * text field. Now extract the words from the text one at a time and find the
 * largest word of length 4 or more. Let’s call this largest word X for now. In
 * response, create a question based on the length of the word. If the word is
 * length 4, the new question is: “Tell me more about X.” If the word is length
 * 5, the new question is: “Why do you think X is important?” If the word is
 * length 6 or more, the new question is: “Now we are getting somewhere.
 * How does X affect you the most?” If there is no word of length 4, the new
 * question is: “Maybe we should move on. Is there something else you
 * would like to talk about?” (Hint: You can use the class Scanner to extract
 * the words from a string, assuming blanks separate the words. For example,
 * the following statements
 *
 * String text = " one potato two potato ";
 * Scanner parser = new Scanner(text);
 * System.out.println(parser.next());
 * System.out.println(parser.next());
 * display one and potato on separate lines.)
 *
 *
 * @author Sharaf Qeshta
 * */
public class Project_07_10 extends Application
{
    public static final String LESS_THAN_4_QUESTION
            = "Maybe we should move on. Is there something else you would like to talk about?";
    public static final String LENGTH_4_QUESTION = "Tell me more about X.";
    public static final String LENGTH_5_QUESTION = "Why do you think X is important?";
    public static final String LENGTH_6_QUESTION = "Now we are getting somewhere. How does X affect you the most?";
    @Override
    public void start(Stage stage)
    {
        VBox pane = new VBox(5);
        pane.setAlignment(Pos.CENTER);

        Label question = new Label("What would you like to talk about?");

        pane.getChildren().add(question);

        Label answerLabel = new Label("Your answer");
        TextField answer = new TextField();
        answer.setPrefColumnCount(12);
        pane.getChildren().addAll(answerLabel, answer);

        Button submit = new Button("Submit");
        Button quit = new Button("Quit");
        pane.getChildren().addAll(submit, quit);

        submit.setOnAction(e ->
        {
            String answer_ = answer.getText().trim();
            Scanner scanner = new Scanner(answer_);
            int maxLength = 0;
            String maxWord = "";
            while (scanner.hasNext())
            {
                String word = scanner.next();
                if (word.length() > maxLength)
                {
                    maxLength = word.length();
                    maxWord = word;
                }
            }

            answer.setText("");

            if (maxLength < 4)
                question.setText(LESS_THAN_4_QUESTION);
            else if (maxLength == 4)
                question.setText(LENGTH_4_QUESTION.replaceAll("X", maxWord));
            else if (maxLength == 5)
                question.setText(LENGTH_5_QUESTION.replaceAll("X", maxWord));
            else
                question.setText(LENGTH_6_QUESTION.replaceAll("X", maxWord));

        });

        quit.setOnAction(e ->
        {
            System.exit(0);
        });

        Scene scene = new Scene(pane, 500, 500);
        stage.setTitle("Project_07_10");
        stage.setScene(scene);
        stage.show();
    }
}
