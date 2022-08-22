package chapter_05;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;

enum HandPosition{EAR, EYE, MOUTH}
/**
 * 12. Create a JavaFX application that displays something like the following
 * picture. You should have methods for drawing a monkey face and a hand.
 *
 * */
public class Project_05_12 extends Application
{
    public static final int X_BASE = 100;
    public static final int Y_BASE = 100;
    public static final int FACE_DIAMETER = 75;
    public static final int FACE_SPACING = 150;

    public static void main(String[] args)
    {
        launch(args);
    }

    public static void drawFace(GraphicsContext gc, int atX, int atY, HandPosition where)
    {
        gc.strokeOval(atX-FACE_DIAMETER/2.0, atY-FACE_DIAMETER/2.0, FACE_DIAMETER, FACE_DIAMETER);

        //draw the ears
        int earWidth = (int)  (FACE_DIAMETER * 0.3);
        int earHeight = (int) (FACE_DIAMETER * 0.5);
        int earOffset = (int) (FACE_DIAMETER * 0.06);
        gc.strokeOval(atX-FACE_DIAMETER/2.0-earWidth+earOffset, atY-FACE_DIAMETER/2.0, earWidth, earHeight);
        gc.strokeOval(atX+FACE_DIAMETER/2.0-earOffset, atY-FACE_DIAMETER/2.0, earWidth, earHeight);

        //draw the eyes
        int eyeWidth = (int)  (FACE_DIAMETER * 0.15);
        int eyeHeight = (int) (FACE_DIAMETER * 0.25);
        int eyeOffsetX = (int) (FACE_DIAMETER * 0.40);
        int eyeOffsetY = (int) (FACE_DIAMETER * 0.20);
        gc.fillOval(atX-FACE_DIAMETER/2.0-eyeWidth+eyeOffsetX,
                atY-FACE_DIAMETER/2.0+eyeOffsetY, eyeWidth, eyeHeight);
        gc.fillOval(atX+FACE_DIAMETER/2.0-eyeOffsetX, atY-FACE_DIAMETER/2.0+eyeOffsetY, eyeWidth, eyeHeight);

        //draw mouth
        int mouthWidth = (int)  (FACE_DIAMETER * 0.70);
        int mouthHeight = (int) (FACE_DIAMETER * 0.60);
        int mouthOffsetX = (int) (FACE_DIAMETER * 0.05);
        int mouthOffsetY = (int) (FACE_DIAMETER * 0.25);
        gc.strokeArc(atX-mouthWidth/2.0+mouthOffsetX, atY-FACE_DIAMETER/2.0+mouthOffsetY,
                mouthWidth, mouthHeight, 0, -180, ArcType.OPEN);

        int handOffsetX;
        int handOffsetY;
        switch (where)
        {
            case MOUTH ->
            {
                handOffsetX = (int) (mouthWidth * 0.3);
                handOffsetY = (int) (-FACE_DIAMETER / 2 + mouthOffsetY + mouthHeight * 0.9);
                drawHand(gc, atX - handOffsetX, atY + handOffsetY);
                drawHand(gc, atX + handOffsetX, atY + handOffsetY);
            }
            case EYE ->
            {
                handOffsetX = eyeOffsetX - eyeWidth;
                handOffsetY = (int) (-FACE_DIAMETER / 2 + eyeOffsetY + eyeHeight * 0.6);
                drawHand(gc, atX - handOffsetX, atY + handOffsetY);
                drawHand(gc, atX + handOffsetX, atY + handOffsetY);
            }
            case EAR ->
            {
                handOffsetX = -FACE_DIAMETER / 2 - earWidth / 2;
                handOffsetY = (int) (-FACE_DIAMETER / 2 + earHeight * 0.75);
                drawHand(gc, atX - handOffsetX, atY + handOffsetY);
                drawHand(gc, atX + handOffsetX, atY + handOffsetY);
            }
        }

    }

    public static void drawHand(GraphicsContext gc, int atX, int atY)
    {

        int palmWidth = (int)  (FACE_DIAMETER * 0.4);
        int palmHeight = (int) (FACE_DIAMETER * 0.2);
        gc.fillOval(atX-palmWidth/2.0, atY-palmHeight/2.0, palmWidth, palmHeight);

        //draw the fingers
        int fingerWidth = (int)  (palmWidth * 0.2);
        int fingerHeight = (int) (palmHeight * 1.2);
        int fingerOffsetX = (int) (fingerWidth * 1.8);
        int fingerOffsetY = (int) (fingerHeight * 0.8);
        gc.fillOval(atX-fingerWidth/2.0-fingerOffsetX,
                atY-palmHeight/2.0-fingerOffsetY, fingerWidth, fingerHeight);
        gc.fillOval(atX-fingerWidth/2.0, atY-palmHeight/2.0-fingerOffsetY,
                fingerWidth, fingerHeight);
        gc.fillOval(atX-fingerWidth/2.0+fingerOffsetX,
                atY-palmHeight/2.0-fingerOffsetY, fingerWidth, fingerHeight);
    }


    @Override
    public void start(Stage primaryStage)
    {
        Group root = new Group();
        Scene scene = new Scene(root);

        Canvas canvas = new Canvas(500, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawFace(gc, X_BASE, Y_BASE, HandPosition.EAR);
        gc.setFont(Font.font("Courier New ", 16));
        gc.fillText("Hear no evil", X_BASE-FACE_DIAMETER/2.0, Y_BASE + FACE_DIAMETER);

        drawFace(gc, X_BASE+FACE_SPACING, Y_BASE, HandPosition.EYE);
        gc.fillText("See no evil", X_BASE+FACE_SPACING-FACE_DIAMETER/2.0, Y_BASE + FACE_DIAMETER);

        drawFace(gc, X_BASE+2*FACE_SPACING, Y_BASE, HandPosition.MOUTH);
        gc.fillText("Speak no evil", X_BASE+2*FACE_SPACING-FACE_DIAMETER/2.0, Y_BASE + FACE_DIAMETER);

        root.getChildren().add(canvas);
        primaryStage.setTitle("Project_05_12");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
