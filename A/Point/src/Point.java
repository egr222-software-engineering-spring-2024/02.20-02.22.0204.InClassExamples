import java.awt.*;

// TO DO:  Implement a class of our own named Point
public class Point {
    private int x;
    private int y;

    private static Point earthquakeOrigin;
    private static int earthquakeImpactRadius = 50;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void setEarthquakeOrigin(Point p) {
        earthquakeOrigin = p;
    }

    public static void setEarthquakeImpactRadius(int radius) {
        earthquakeImpactRadius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(Graphics g) {
        if (earthquakeOrigin != null && distanceFromEarthquakeOrigin() < earthquakeImpactRadius) {
            g.setColor(Color.red);
        }
        else g.setColor(Color.black);

        g.fillOval(x, y, 3, 3);
        g.drawString("(" + x + ", " + y + ")", x, y);
    }

    public double distanceFromEarthquakeOrigin() {
        int deltaX = x - earthquakeOrigin.x;
        int deltaY = y - earthquakeOrigin.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static void drawEarthquakeOrigin(Graphics g) {
        if (earthquakeOrigin != null) {
            Color c = g.getColor();

            g.setColor(Color.red);
//            earthquakeOrigin.draw(g);
            g.fillOval(earthquakeOrigin.x, earthquakeOrigin.y, 3,3);

            int earthquakeCircleRadius = 5;
            while (earthquakeCircleRadius <= earthquakeImpactRadius) {
                int diameter = 2 * earthquakeCircleRadius;
                g.drawOval(earthquakeOrigin.x - earthquakeCircleRadius, earthquakeOrigin.y - earthquakeCircleRadius, diameter, diameter);
                earthquakeCircleRadius += 5;
            }

            g.setColor(c);
        }
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}