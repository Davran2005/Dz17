import Shape.*;

public class Main {
    public static void main(String[] args) {
        Paralellepiped paralellepiped = new Paralellepiped();
        paralellepiped.setHeight(2);
        paralellepiped.setLength(3);
        paralellepiped.setWidth(8);
        System.out.println(paralellepiped.getPerimeter());

        Square square = new Square();
        square.setSideA(8);
        System.out.println(square.getPerimeter());

        Triangle triangle = new Triangle();
        triangle.setSideA(3);
        triangle.setSideB(10);
        triangle.setSideC(2);
        System.out.println(triangle.getPerimeter());


        Circle circle = new Circle();
        circle.setRadius(7);
        System.out.println(circle.getPerimeter());


        Rectangle rectangle = new Rectangle();
        rectangle.setSideA(5);
        rectangle.setSideB(7);
        System.out.println(rectangle.getPerimeter());


    }
}