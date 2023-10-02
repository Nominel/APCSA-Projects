public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(6, 12, 14);
        Triangle triangle2 = new Triangle(3,4,5);
        triangle1.calculatePerimeter();
        triangle2.calculatePerimeter();
        System.out.println("Area of triangle 1 = "+triangle1.getArea());
        System.out.println("Area of triangle 2 = "+triangle2.getArea());
    }
}