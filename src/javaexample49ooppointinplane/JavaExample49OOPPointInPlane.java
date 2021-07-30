
package javaexample49ooppointinplane;


public class JavaExample49OOPPointInPlane {

    
    public static void main(String[] args) {
        
        
        Point p1= new Point();
        Point p2=new Point(3, 4);
        Point p3=new Point(-2, -5);
        
        System.out.println("The first point is: "+p1.toString());
        System.out.println("The second point is: "+p2);
        System.out.println("The third point is: "+p3);
        
        System.out.println();
        
        System.out.println("The distance from the first point to the origin: "+p1.Distance());
        System.out.println("The distance from the first point to the second point: "+p1.Distance(p2));
        System.out.println("The distance from the first point to the third point: "+p1.Distance(p3));
        
        System.out.println("");
        
        System.out.println("The distance from the second point to the origin: "+p2.Distance());
        System.out.println("The distance from the second point to the first point: "+p2.Distance(p1));
        System.out.println("The distance from the second point to the second point: "+p2.Distance(p2));
        System.out.println("The distance from the second point to the third point: "+p2.Distance(p3));
        
    }
    
}
