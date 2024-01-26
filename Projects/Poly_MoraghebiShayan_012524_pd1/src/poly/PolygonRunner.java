package poly;

import java.util.ArrayList;
import java.util.Arrays;

public class PolygonRunner {
        public static void main(String[] args){
                Point point3 = new Point(2,1);
                Point point4 = new Point(1,3);
                Point point2 = new Point(4,5);
                Point point5 = new Point(6,4);
                Point point1 = new Point(5,0);


                ArrayList<Point> polyPoints = new ArrayList<>();
                polyPoints.add(point1);
                polyPoints.add(point2);
                polyPoints.add(point3);
                polyPoints.add(point4);
                polyPoints.add(point5);

                Polygon poly = new Polygon(polyPoints);
                System.out.println("The centroid is "+ Arrays.toString(poly.getCentroid()));
                System.out.println(poly);
                poly.sortCounterClockwise();
                System.out.println(poly);
                System.out.println("Are "+poly.getVertices().get(2)+" and "+poly.getVertices().get(4)+" adjacent? "+poly.isAdjacent(2,4));
                System.out.println("Are "+poly.getVertices().get(2)+" and "+poly.getVertices().get(3)+" adjacent? "+poly.isAdjacent(2,3));
                System.out.println("The area of the polygon is "+poly.calculateArea());
        }
}
