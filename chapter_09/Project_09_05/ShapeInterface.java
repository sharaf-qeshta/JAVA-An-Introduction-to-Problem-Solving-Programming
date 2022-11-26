package chapter_09;

/**
 Interface for simple shapes drawn on
 the screen using keyboard characters.
 */
public interface ShapeInterface
{
    /**
     Sets the offset for the shape.
     */
    public void setOffset(int newOffset);
    /**
     Returns the offset for the shape.
     */
    public int getOffset();
    /**
     Draws the shape at lineNumber lines down
     from the current line.
     */
    public void drawAt(int lineNumber);
    /**
     Draws the shape at the current line.
     */
    public void drawHere();
}

