package lt.baltictalents.p30.demo2_Bridge;

public class Demo2 {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new CircleShape(1, 2, 3, new DrawingAPI1()),
                new CircleShape(5, 7, 11, new DrawingAPI2())
        };

        for (Shape shape : shapes) {
            shape.draw();
            shape.resizeByPercentage(50);
            shape.draw();
        }

    }
}
