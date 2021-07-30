
package javaexample49ooppointinplane;

                         // a point in a plane
public class Point {
    
    private double x; // x-coordinate
    private double y; // y-coordinate

    public Point() { // create a default point and set it to the origin (0 , 0)
        this.x=0;
        y=0;
    }

    public Point(double a, double b) { // create a point with its coordinats (a , b)
        this.x = a;
        this.y = b;
    }
    
    public double Distance() { // distance from the point to the origin
        double dist=Math.sqrt(x*x+y*y);
        return dist;
    }
    
    public double Distance(Point p) { // distance from the point to the point p
        double distX=(this.x-p.x)*(x-p.x);
        double distY=(y-p.y)*(y-p.y);
        double dist=Math.sqrt(distX+distY);
        return dist;
    }
    
    public String toString() {
        return "("+x+" , "+y+")";
    }
    
    
    
    
}
