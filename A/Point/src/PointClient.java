import java.awt.*;

public class PointClient {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel();
        Graphics g = panel.getGraphics();

        Point.setEarthquakeOrigin(new Point(80,40));
        Point.setEarthquakeImpactRadius(50);

        Point.drawEarthquakeOrigin(g);

        Point p1 = new Point(15, 37);
//        p1.x = 15;
//        p1.y = 37;

        System.out.println("Point 1 is " + p1);
        System.out.println("Point 1.x is " + p1.getX());
        System.out.println("Point 1.y is " + p1.getY());
        p1.draw(g);
//
        Point p2 = new Point(51, 79);
//        p2.x = 51;
//        p2.y = 79;
        System.out.println("Point 2 is " + p2);
        p2.draw(g);
//
        Point p3 = new Point();
        p3.setX(150);
        p3.setY(200);
        System.out.println("Point 3 is " + p3);
        p3.draw(g);
    }
}