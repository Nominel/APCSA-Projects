package poly;

public class PointRunner {
        public static void main(String[] args){
                Point point1 = new Point(0,0);
                Point point2 = new Point(0,5);
                Point point3 = new Point(5,0);
                Point point4 = new Point(1,4);
                Point point5 = new Point(-9,2);
                Point point6 = new Point(-4,-5);
                Point point7 = new Point(6,-3);

                System.out.println("Point 1 Quad = "+point1.getQuad());
                System.out.println("Point 2 Quad = "+point2.getQuad());
                System.out.println("Point 3 Quad = "+point3.getQuad());
                System.out.println("Point 4 Quad = "+point4.getQuad());
                System.out.println("Point 5 Quad = "+point5.getQuad());
                System.out.println("Point 6 Quad = "+point6.getQuad());
                System.out.println("Point 7 Quad = "+point7.getQuad());

                System.out.println("Point 1 AxisOrOrigin = "+point1.getAxisOrOrigin());
                System.out.println("Point 2 AxisOrOrigin = "+point2.getAxisOrOrigin());
                System.out.println("Point 3 AxisOrOrigin = "+point3.getAxisOrOrigin());
                System.out.println("Point 4 AxisOrOrigin = "+point4.getAxisOrOrigin());
                System.out.println("Point 5 AxisOrOrigin = "+point5.getAxisOrOrigin());
                System.out.println("Point 6 AxisOrOrigin = "+point6.getAxisOrOrigin());
                System.out.println("Point 7 AxisOrOrigin = "+point7.getAxisOrOrigin());
        }
}
