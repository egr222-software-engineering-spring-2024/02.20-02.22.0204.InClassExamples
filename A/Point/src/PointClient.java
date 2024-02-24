import java.awt.*;

public class PointClient {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel();
        Graphics g = panel.getGraphics();

        Point p1 = new Point();
        p1.x = 15;
        p1.y = 37;

        System.out.println("Point 1 is " + p1);
//        p1.draw(g);
//
//        Point p2 = new Point();
//        p2.x = 51;
//        p2.y = 79;
//        p2.draw(g);
    }
}