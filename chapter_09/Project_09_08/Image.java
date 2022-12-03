package chapter_09;

import javafx.scene.image.ImageView;

import java.util.Random;

public class Image extends ImageView
{
    private int x,y;
    private int xVel, yVel;

    public Image(String imagePath)
    {
        super(imagePath);
        Random random = new Random();
        x = 50;
        y = 50;
        xVel = random.nextInt(20) + 5;
        yVel = random.nextInt(20) + 5;
        setX(x);
        setY(y);
    }

    public void updateLocation()
    {
        x += xVel;
        y += yVel;
        setX(x);
        setY(y);
    }

    public int getX_()
    {
        return x;
    }

    public int getY_()
    {
        return y;
    }

    public void reverseX()
    {
        xVel *= -1;
    }

    public void reverseY()
    {
        yVel *= -1;
    }
}
