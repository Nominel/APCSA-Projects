package poly;

import java.util.*;

public class Point {
        private double[] points;

        public Point (){
                points = new double[]{0,0};
        }

        public Point (double x, double y){
                points = new double[] {x, y};
        }

        public double[] getPoint(){
                return points;
        }

        public double getX(){
                return points[0];
        }

        public double getY(){
                return points[1];
        }

        public char getAxisOrOrigin(){
                if (getX()==0&&getY()==0)
                        return 'o';
                if (getX()==0)
                        return 'x';
                if (getY()==0)
                        return 'y';
                return 'n';
        }

        public int getQuad(){
                if (getX()>0&&getY()>0)
                        return 1;
                if (getX()<0&&getY()>0)
                        return 2;
                if (getX()<0&&getY()<0)
                        return 3;
                if (getX()>0&&getY()<0)
                        return 4;
                return -1;
        }

        @Override
        public String toString() {
                return Arrays.toString(points);
        }
}
