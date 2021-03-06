package lt.baltictalents.p09.demo2;

import lt.baltictalents.p09.demo2.Figure;

public class Circle extends Figure {

    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void setSizeFromArea(double area) {
        radius = Math.sqrt(area / Math.PI);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
