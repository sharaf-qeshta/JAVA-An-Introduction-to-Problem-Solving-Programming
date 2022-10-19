package chapter_08;

public abstract class DrawableShape
{
    protected int x, y;
    protected String color;

    public abstract int getX();

    public abstract void setX(int x);

    public abstract int getY();

    public abstract void setY(int y);

    public abstract String getColor();

    public abstract void setColor(String color);

    public abstract void draw();
}
