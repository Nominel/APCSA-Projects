package poly;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
        private ArrayList<Point> vertices;

        public Polygon(ArrayList<Point> points){
                vertices = points;
        }

        public double[] getCentroid(){
                double averageX = 0;
                double averageY = 0;

                for(Point points : vertices){
                        averageX+=points.getX();
                        averageY+= points.getY();
                }

                averageX/=vertices.size();
                averageY/=vertices.size();

                return new double[] {averageX,averageY};
        }

        public ArrayList<Point> getVertices() {
                return vertices;
        }

        public void sortCounterClockwise(){
                int size = vertices.size();
                for(int i = 0; i<size-1;i++){
                        int maxIndex = i;
                        double minAngle = Math.atan2(getCentroid()[1]-vertices.get(i).getY(),getCentroid()[0]-vertices.get(i).getX());
                        if(minAngle<0)
                                minAngle+=2*Math.PI;
                        for(int j = i+1; j<size; j++){
                                double jAngle = Math.atan2(getCentroid()[1]-vertices.get(j).getY(),getCentroid()[0]-vertices.get(j).getX());
                                if(jAngle<0)
                                        jAngle+=2*Math.PI;
                                if(jAngle<minAngle) {
                                        maxIndex = j;
                                        minAngle = jAngle;
                                }
                        }
                        Point temp = vertices.get(i);
                        vertices.set(i, vertices.get(maxIndex));
                        vertices.set(maxIndex, temp);
                }
        }

        public boolean isAdjacent(int index1, int index2){
                ArrayList<Point> temp = vertices;
                sortCounterClockwise();
                boolean adjacent = Math.abs(vertices.indexOf(temp.get(index1)) - vertices.indexOf(temp.get(index2))) == 1;
                vertices = temp;
                return adjacent;
        }

        public double calculateArea(){
                sortCounterClockwise();
                ArrayList<Point> vertices = this.vertices;
                vertices.add(vertices.getFirst());
                double area = 0;
                for(int i = 0; i<vertices.size()-1;i++){
                        double x1 = vertices.get(i).getX();
                        double y1 = vertices.get(i).getY();
                        double x2 = vertices.get(i+1).getX();
                        double y2 = vertices.get(i+1).getY();
                        area+=(x1*y2)-(x2*y1);
                }
                return area/2;
        }

        @Override
        public String toString() {
                String result = "Polygon data:";
                for(int i = 0; i< vertices.size(); i++){
                        result+=" P"+(i+1)+"("+vertices.get(i).getX()+" ,"+vertices.get(i).getY()+"),";
                }
                return  result.substring(0,result.length()-1);
        }
}
