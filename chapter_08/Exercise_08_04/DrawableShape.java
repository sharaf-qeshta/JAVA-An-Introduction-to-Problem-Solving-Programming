package chapter_08;

public abstract class DrawableShape
{
    private int x, y;
    private String color;

    public abstract int getX();

    public abstract void setX(int x);

    public abstract int getY();

    public abstract void setY(int y);

    public abstract String getColor();

    public abstract void setColor(String color);
}
