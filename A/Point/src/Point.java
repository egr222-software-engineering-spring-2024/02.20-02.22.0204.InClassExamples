import java.awt.*;

// TO DO:  Implement a class of our own named Point
public class Point {
    int x;
    int y;

    public void draw(Graphics g) {
        g.fillOval(x, y, 3, 3);
        g.drawString("(" + x + ", " + y + ")", x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}